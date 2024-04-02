package org.example.gamelld.Character.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.gamelld.Character.CharEnum;

@Getter
@Setter
public class Orc extends Character {

    String gang;

    public Orc(){
        super();
        this.setCharType(CharEnum.ORC);
    }

    @Override
    public String toString() {
        return "Orc{" +
                "gang='" + gang + '\'' +
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
