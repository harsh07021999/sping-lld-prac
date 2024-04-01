package org.example.gamelld.Character.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.example.gamelld.Character.CharEnum;

@Getter
@Setter
public class Request {

    String name;

    @JsonProperty("type")
    CharEnum charEnum;
}
