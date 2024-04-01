package org.example.gamelld.factions;

import org.example.gamelld.Character.entity.Character;
import org.springframework.stereotype.Service;

@Service
public class ArcherFactionStrategy implements FactionStrategies{
    @Override
    public void applyStrategy(Character character) {
        character.setHp((int) (character.getHp()*1.10));
    }

    @Override
    public FactionEnum getFaction() {
        return FactionEnum.ARCHER;
    }

}
