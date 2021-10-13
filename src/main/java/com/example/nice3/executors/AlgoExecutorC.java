package com.example.nice3.executors;

import com.example.nice3.model.Interaction;
import com.example.nice3.algo.AlgoC;
import org.springframework.stereotype.Component;

@Component
public class AlgoExecutorC implements AlgoExecutor {


    private AlgoC algoC;

    public AlgoExecutorC(AlgoC algoC) {

        this.algoC = algoC;
    }

    public AlgoC getAlgo() {
        return algoC;
    }

    public void setAlgo(AlgoC algoC) {
        this.algoC = algoC;
    }

    public String executeAlgo(Interaction interaction) {
        return this.algoC.execute(interaction);
    }


}
