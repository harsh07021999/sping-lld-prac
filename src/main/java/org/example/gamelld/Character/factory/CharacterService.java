package org.example.gamelld.Character.factory;

import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.entity.Character;

public interface CharacterService {

    Character createCharacter(Request request);

    CharEnum tell();

}
