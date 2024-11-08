public class Main {
    public static void main(String[] args) throws Exception {
        // två objekt från vardera klasser
        Allied marine = new Allied("Dave", 100, 100);
        Enemy bandit = new Enemy("Greger the childmolester", 100, 100);
        // testa att prata, attackera och försvara
        System.out.println("\033c");
        marine.talk();
        marine.attack();
        marine.defend();
        System.out.println();
        bandit.talk();
        bandit.attack();
        bandit.defend();

    }
}