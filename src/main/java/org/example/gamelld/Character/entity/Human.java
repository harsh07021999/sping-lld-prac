package org.example.gamelld.Character.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.gamelld.Character.CharEnum;

@Setter
@Getter
@AllArgsConstructor
public class Human extends Character {

    String Clan;

    String Race;

    public Human(){
        super();
        this.setCharType(CharEnum.HUMAN);
    }

    @Override
    public String toString() {
        return "Human{" +
                "Clan='" + Clan + '\'' +
                ", Race='" + Race + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", spAttack=" + spAttack +
                ", charType=" + charType +
                ", faction=" + faction +
                ", primary='" + primary + '\'' +
                ", ammo='" + ammo + '\'' +
                '}';
    }

}
