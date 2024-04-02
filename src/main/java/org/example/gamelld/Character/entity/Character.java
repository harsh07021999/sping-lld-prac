package org.example.gamelld.Character.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.factions.FactionEnum;
import org.example.gamelld.factions.FactionStrategies;

@Getter
@Setter
public abstract class Character {

    Integer hp;

    Integer attack;

    Integer spAttack;

    CharEnum charType;

    FactionEnum faction;

    FactionStrategies factionStrategies;

    String primary;

    String ammo;

    Character(){
        hp = 100;
        attack = 25;
        spAttack = 35;
    }

    public void applyFactionStrategy(){
        if(factionStrategies != null){
            factionStrategies.applyStrategy(this);
        }
    }
}
