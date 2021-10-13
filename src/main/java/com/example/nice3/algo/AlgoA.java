package com.example.nice3.algo;

import com.example.nice3.model.Interaction;
import com.example.nice3.enums.EmotionEnum;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class AlgoA implements Algo {


    @Override
    public String execute(Interaction interaction) throws Exception {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        return EmotionEnum.getStringValue(randomNum).toString();
    }
}
