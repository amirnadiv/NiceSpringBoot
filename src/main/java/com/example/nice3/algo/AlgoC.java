package com.example.nice3.algo;

import com.example.nice3.model.Interaction;
import org.springframework.stereotype.Component;

@Component
public class AlgoC implements Algo {
    @Override
    public String execute(Interaction interaction) {
        return "ALGO C: RULE-FOR-"+interaction.getId();
    }
}
