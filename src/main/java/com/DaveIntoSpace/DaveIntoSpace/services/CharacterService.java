package com.DaveIntoSpace.DaveIntoSpace.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.DaveIntoSpace.DaveIntoSpace.models.Character;

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
    public List<Character> updateCharacterById(String id, Character updatedCharacter) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        Update update = new Update()
                .set("name", updatedCharacter.getName())
                .set("level", updatedCharacter.getLevel())
                .set("species", updatedCharacter.getSpecies())
                .set("faction", updatedCharacter.getFaction())
                .set("lightWeapons", updatedCharacter.getLightWeapons())
                .set("primaryWeapons", updatedCharacter.getPrimaryWeapons())
                .set("secondaryWeapons", updatedCharacter.getSecondaryWeapons())
                .set("explosiveWeapons", updatedCharacter.getExplosiveWeapons());
        mongoOperations.updateFirst(query, update, java.lang.Character.class);

        return mongoOperations.findAll(Character.class);
    }

    // DELETE======================================================================
    public Character deleteCharacter(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoOperations.findAndRemove(query, Character.class);
    }
}
