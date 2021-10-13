package com.example.nice3.executors;

import com.example.nice3.model.Interaction;
import com.example.nice3.algo.Algo;
import com.example.nice3.algo.AlgoA;
import org.springframework.stereotype.Component;

@Component
public class AlgoExecutorA implements AlgoExecutor{


    private AlgoA algoA;

    public AlgoExecutorA(AlgoA algoA) {
        this.algoA = algoA;
    }

    public Algo getAlgo() {
        return algoA;
    }

    public void setAlgo(Algo algo) {
        this.algoA = algoA;
    }

    public String executeAlgo(Interaction interaction) throws Exception {
        return this.algoA.execute(interaction);
    }


}
