package com.example.nice3.executors;

import com.example.nice3.model.Interaction;
import com.example.nice3.algo.AlgoB;
import org.springframework.stereotype.Component;

@Component
public class AlgoExecutorB implements AlgoExecutor{


    private AlgoB algoB;

    public AlgoExecutorB(AlgoB algoB) {
        this.algoB= algoB;
    }

    public AlgoB getAlgo() {
        return algoB;
    }

    public void setAlgo(AlgoB algoB) {
        this.algoB = algoB;
    }

    public String executeAlgo(Interaction interaction){
        return this.algoB.execute(interaction);
    }


}
