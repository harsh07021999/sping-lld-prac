package org.example.queueTh;

import lombok.NoArgsConstructor;
import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.Character.dto.Request;
import org.example.gamelld.Character.entity.Human;
import org.example.gamelld.Character.factory.CharacterFactory;
import org.example.gamelld.Character.factory.CharacterService;

@NoArgsConstructor
public class exec {
    CharacterFactory characterFactory;
    public exec(CharacterFactory characterFactory){
        this.characterFactory = characterFactory;
    }

    public void test(){
        Request r = new Request();
        CharacterService characterService = characterFactory.createCharacter(CharEnum.HUMAN);
        Human human = (Human) characterService.createCharacter(r);
    }
}
