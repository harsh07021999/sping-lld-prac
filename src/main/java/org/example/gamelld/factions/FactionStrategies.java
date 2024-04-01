package org.example.gamelld.factions;


import org.example.gamelld.Character.entity.Character;
import org.springframework.stereotype.Component;

@Component
public interface FactionStrategies {

    void applyStrategy(Character character);

    FactionEnum getFaction();

}
