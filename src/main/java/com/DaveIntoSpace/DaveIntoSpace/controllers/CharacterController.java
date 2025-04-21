package com.DaveIntoSpace.DaveIntoSpace.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DaveIntoSpace.DaveIntoSpace.models.Character;
import com.DaveIntoSpace.DaveIntoSpace.services.CharacterService;

@RestController
public class CharacterController {
    // ======================================================================
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // CREATE======================================================================
    @PostMapping
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        Character newCharacter = characterService.createCharacter(character);
        return ResponseEntity.ok(newCharacter);
    }

    // READ======================================================================
    @GetMapping("/character-list")
    public ResponseEntity<List<Character>> getAllCharacters() {
        List<Character> allCharacters = characterService.getAllCharacters();
        return ResponseEntity.ok(allCharacters);
    }

    @GetMapping("/character-list/{id}")
    public ResponseEntity<List<Character>> getCharacterById(@PathVariable String id) {
        List<Character> oneCharacter = characterService.getCharacterById(id);
        return ResponseEntity.ok(oneCharacter);
    }

    // UPDATE======================================================================
    @PutMapping("/{id}")
    public ResponseEntity<List<Character>> updateCharacterById(@PathVariable String id,
            @RequestBody Character character) {
        List<Character> updatedCharacter = characterService.updateCharacterById(id, character);
        if (updatedCharacter.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCharacter);
    }

    // DELETE======================================================================
    @DeleteMapping("/{id}")
    public ResponseEntity<Character> deleteCharacter(@PathVariable String id) {
        Character deletedCharacter = characterService.deleteCharacter(id);
        return ResponseEntity.ok(deletedCharacter);

    }

}
