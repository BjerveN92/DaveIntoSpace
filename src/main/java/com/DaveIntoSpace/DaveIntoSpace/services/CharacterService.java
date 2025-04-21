package com.DaveIntoSpace.DaveIntoSpace.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    // ======================================================================

    private final MongoOperations mongoOperations;

    public CharacterService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    // CREATE======================================================================
    public Character createCharacter(Character character) {
        return mongoOperations.save(character);
    }

    // READ======================================================================
    // alla karaktärer
    public List<Character> getAllCharacters() {
        return mongoOperations.findAll(Character.class);
    }

    // en karaktär
    public List<Character> getCharacterById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoOperations.find(query, Character.class);
    }

    // UPDATE======================================================================

    // DELETE======================================================================
}
