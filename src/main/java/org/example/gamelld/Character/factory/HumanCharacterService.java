package org.example.gamelld.Character.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.entity.Character;
import org.example.gamelld.Character.entity.Human;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@Service
public class HumanCharacterService implements CharacterService {
    @Override
    public Character createCharacter(Request request) {
        Human human = new Human();
        human.setClan("Mitsubishi");
        human.setRace("Asian");
        return human;
    }

    @Override
    public CharEnum tell() {
        return CharEnum.HUMAN;
    }
}
