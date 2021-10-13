package com.example.nice3;

import com.example.nice3.model.Interaction;
import com.example.nice3.model.InteractionResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



@SpringBootTest
@ComponentScan
class Nice3ApplicationTests {

@Autowired
private InteractionManager interactionManager;

    @Test
    void writeInteractionResultsToFile() throws Exception {


        List<Interaction> interactionList = interactionManager.readAll(new File(interactionManager.inputFilePath));
        List<InteractionResult> interactionResults = new ArrayList<>();

        for (Interaction interaction:interactionList) {
            interactionResults.add(interactionManager.applyAlgoOnInteraction(interaction));
        }

       interactionManager.writeResults(interactionResults);

    }

}
