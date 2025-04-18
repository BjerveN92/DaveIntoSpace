package com.DaveIntoSpace.DaveIntoSpace.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "characters")

public class Character {

    @Id
    private String id;

    private String name;
    private int level;

}