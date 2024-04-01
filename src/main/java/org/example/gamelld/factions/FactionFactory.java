package org.example.gamelld.factions;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactionFactory {

    List<FactionStrategies> factionStrategiesList;

    FactionFactory(@NonNull final List<FactionStrategies> factionStrategies){
        this.factionStrategiesList = factionStrategies;
    }

    FactionStrategies getFactionStrategy(FactionEnum factionEnum){
        return this.factionStrategiesList.stream()
                .filter( factionStrategies -> factionStrategies.getFaction().equals(factionEnum))
                .findFirst()
                .orElseThrow();
    }

}
