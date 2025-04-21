package com.DaveIntoSpace.DaveIntoSpace.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    // ======================================================================

    private final MongoOperations mongoOperations;

    public CharacterService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }
    // ======================================================================

    // CREATE
    public Character createCharacter(Character character) {
        return mongoOperations.save(character);
    }

    // READ
    //
    public List<Character> getAllCharacters() {
        return mongoOperations.findAll(Character.class);
    }
    // UPDATE

    // DELETE
}
