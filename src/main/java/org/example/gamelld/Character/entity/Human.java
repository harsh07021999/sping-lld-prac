package org.example.gamelld.Character.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
public class Human extends Character {

    String Clan;

    String Race;

    public Human(){
        super();
    }

//    String bow;
//
//    Integer arrows;
//
//    Human(){
//        bow = "";
//        arrows = 50;
//    }

}
