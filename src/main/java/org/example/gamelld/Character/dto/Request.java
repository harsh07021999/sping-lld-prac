package org.example.gamelld.Character.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.example.gamelld.Character.CharEnum;
import org.example.gamelld.factions.FactionEnum;

@Getter
@Setter
public class Request {

    String name;

    @JsonProperty("type")
    CharEnum charEnum;

    @JsonProperty("faction")
    FactionEnum factionEnum;

}
