package com.example.nice3.algo;

import com.example.nice3.model.Interaction;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AlgoB implements  Algo {
    @Override
    public String execute(Interaction interaction) {

        return UUID.randomUUID().toString();


    }
}
