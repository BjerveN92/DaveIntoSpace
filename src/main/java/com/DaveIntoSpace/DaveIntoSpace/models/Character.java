package com.DaveIntoSpace.DaveIntoSpace.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.DaveIntoSpace.DaveIntoSpace.models.enums.Faction;
import com.DaveIntoSpace.DaveIntoSpace.models.enums.Species;
import com.DaveIntoSpace.DaveIntoSpace.models.enums.weapons.ExplosiveWeapons;
import com.DaveIntoSpace.DaveIntoSpace.models.enums.weapons.LightWeapons;
import com.DaveIntoSpace.DaveIntoSpace.models.enums.weapons.PrimaryWeapons;
import com.DaveIntoSpace.DaveIntoSpace.models.enums.weapons.SecondaryWeapons;

@Document(collection = "characters")

public class Character {

    @Id
    private String id;
    // general variables
    private String name;
    private int level;
    private Species species;
    private Faction faction;
    // weapon variables, they can be "NONE" if nessecary
    private LightWeapons lightWeapons;
    private PrimaryWeapons primaryWeapons;
    private SecondaryWeapons secondaryWeapons;
    private ExplosiveWeapons explosiveWeapons;

    public Character(String id, String name, int level, Species species, Faction faction, LightWeapons lightWeapons,
            PrimaryWeapons primaryWeapons, SecondaryWeapons secondaryWeapons, ExplosiveWeapons explosiveWeapons) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.species = species;
        this.faction = faction;
        this.lightWeapons = lightWeapons;
        this.primaryWeapons = primaryWeapons;
        this.secondaryWeapons = secondaryWeapons;
        this.explosiveWeapons = explosiveWeapons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public LightWeapons getLightWeapons() {
        return lightWeapons;
    }

    public void setLightWeapons(LightWeapons lightWeapons) {
        this.lightWeapons = lightWeapons;
    }

    public PrimaryWeapons getPrimaryWeapons() {
        return primaryWeapons;
    }

    public void setPrimaryWeapons(PrimaryWeapons primaryWeapons) {
        this.primaryWeapons = primaryWeapons;
    }

    public SecondaryWeapons getSecondaryWeapons() {
        return secondaryWeapons;
    }

    public void setSecondaryWeapons(SecondaryWeapons secondaryWeapons) {
        this.secondaryWeapons = secondaryWeapons;
    }

    public ExplosiveWeapons getExplosiveWeapons() {
        return explosiveWeapons;
    }

    public void setExplosiveWeapons(ExplosiveWeapons explosiveWeapons) {
        this.explosiveWeapons = explosiveWeapons;
    }

}