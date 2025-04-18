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

}