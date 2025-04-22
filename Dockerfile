# FROM eclipse-temurin:17-jdk-jammy AS builder
# WORKDIR /opt/app
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
# COPY ./src ./src
# RUN ./mvnw clean install -DskipTests

# FROM eclipse-temurin:17-jre-jammy
# WORKDIR /opt/app
# EXPOSE 8080
# COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
# ENTRYPOINT ["java","-Dspring.profiles.active=prod", "-jar", "/opt/app/*.jar" ]


# -----------------------------
# Steg 1: Bygg Spring Boot-applikationen
# -----------------------------
FROM eclipse-temurin:17-jdk-jammy AS builder

WORKDIR /opt/app

# Kopiera Maven wrapper och pom.xml först (för att dra in dependencies snabbare vid cache)
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Ladda ner alla beroenden
RUN ./mvnw dependency:go-offline

# Kopiera resten av koden och bygg .jar-filen
COPY src ./src
RUN ./mvnw clean package -DskipTests

# -----------------------------
# Steg 2: Slimmad container för att köra appen
# -----------------------------
FROM eclipse-temurin:17-jre-jammy

WORKDIR /opt/app

# Kopiera bara det färdiga .jar-paketet från builder-staget
COPY --from=builder /opt/app/target/*.jar app.jar

# Starta applikationen med Spring-profilen "prod"
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/opt/app/app.jar"]
