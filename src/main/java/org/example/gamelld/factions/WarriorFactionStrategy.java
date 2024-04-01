package org.example.gamelld.factions;

import org.example.gamelld.Character.entity.Character;

public class WarriorFactionStrategy implements FactionStrategies{
    @Override
    public void applyStrategy(Character character) {

    }

    @Override
    public FactionEnum getFaction() {
        return FactionEnum.WARRIOR;
    }
}
