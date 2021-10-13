package com.example.nice3.executors;

import com.example.nice3.model.Interaction;
import org.springframework.stereotype.Component;

@Component
public interface AlgoExecutor {

    public String executeAlgo(Interaction interaction) throws Exception;
}
