package com.DaveIntoSpace.DaveIntoSpace.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DaveIntoSpace.DaveIntoSpace.services.CharacterService;

@RestController
public class CharacterController {
    // ======================================================================
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // ======================================================================

    // CREATE
    @PostMapping
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        Character newCharacter = characterService.createCharacter(character);
        return ResponseEntity.ok(newCharacter);
    }

    // READ
    @GetMapping("/character")
    public ResponseEntity<List<Character>> getAllAliens() {
        List<Character> allCharacters = characterService.getAllCharacters();
        return ResponseEntity.ok(allCharacters);
    }

    // UPDATE

    // DELETE

}
