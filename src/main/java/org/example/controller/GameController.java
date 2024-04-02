package org.example.controller;

import lombok.NonNull;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.entity.Character;
import org.example.gamelld.Character.factory.CharacterFactory;
import org.example.gamelld.Character.factory.CharacterService;
import org.example.gamelld.factions.FactionFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final CharacterFactory characterFactory;
    private final FactionFactory factionFactory;

    public GameController(@NonNull final CharacterFactory characterFactory, FactionFactory factionFactory) {
        this.characterFactory = characterFactory;
        this.factionFactory = factionFactory;
    }

    @PostMapping("/player")
    public ResponseEntity<?> createPlayer(@RequestBody Request request){
        CharacterService characterService = characterFactory.createCharacter(request.getCharEnum());
        Character character = characterService.createCharacter(request);
        character.setFactionStrategies(factionFactory.getFactionStrategy(request.getFactionEnum()));
        character.applyFactionStrategy();
        return ResponseEntity.ok("ok");
    }
}
