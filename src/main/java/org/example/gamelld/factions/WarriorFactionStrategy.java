package org.example.gamelld.factions;

import org.example.gamelld.Character.entity.Character;
import org.springframework.stereotype.Service;

@Service
public class WarriorFactionStrategy implements FactionStrategies{
    @Override
    public void applyStrategy(Character character) {
        character.setHp((int) (character.getHp()*0.8));
        character.setAttack((int) (character.getAttack()*1.25));
        character.setSpAttack((int) (character.getSpAttack()*1.25));
        character.setPrimary("Sword");
        character.setAmmo("5");
    }

    @Override
    public FactionEnum getFaction() {
        return FactionEnum.WARRIOR;
    }
}
