package org.example.gamelld.Character.factory;

import lombok.AllArgsConstructor;
import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.entity.Character;
import org.example.gamelld.Character.entity.Orc;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrcCharacterService implements CharacterService {
    @Override
    public Character createCharacter(Request request) {
        Orc orc = new Orc();
        orc.setGang("Slayer");
        return orc;
    }

    @Override
    public CharEnum tell() {
        return CharEnum.ORC;
    }
}
