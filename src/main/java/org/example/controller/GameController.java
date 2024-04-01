package org.example.controller;

import lombok.NonNull;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.factory.CharacterFactory;
import org.example.gamelld.Character.factory.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final CharacterFactory characterFactory;

    public GameController(@NonNull final CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    @PostMapping("/player")
    public ResponseEntity<?> createPlayer(@RequestBody Request request){
        CharacterService characterService = characterFactory.createCharacter(request.getCharEnum());
        characterService.createCharacter(request);
        return ResponseEntity.ok("ok");
    }
}
