package org.example.gamelld.Character.factory;

import org.example.gamelld.Character.CharEnum;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterFactory {

    List<CharacterService> characterFactories;

    public CharacterFactory(List<CharacterService> characterServices){
        this.characterFactories = characterServices;
    }

    public CharacterService createCharacter(CharEnum c){
        return characterFactories.stream().filter(t-> t.tell().equals(c)).findFirst().orElseThrow();
    }
}
