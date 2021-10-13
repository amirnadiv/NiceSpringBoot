package com.example.nice3;

import com.example.nice3.executors.AlgoExecutor;
import com.example.nice3.model.Interaction;
import com.example.nice3.model.InteractionResult;
import com.example.nice3.readers.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;


@Component
public class InteractionManager {

    private static final  Logger logger = LoggerFactory.getLogger(InteractionManager.class);


    private final Reader reader;

    private final Collection<AlgoExecutor> algoExecutors;

    @Value("${inputFilePath}")
    String inputFilePath;

    @Value("${outputFilePath}")
    String outputFilePath;

    public InteractionManager(Reader reader, ApplicationContext context) {

        this.reader = reader;
        Map<String, AlgoExecutor> algoExecutorMap = context.getBeansOfType(AlgoExecutor.class);
        this.algoExecutors = algoExecutorMap.values();
    }

    public List<Interaction> readAll(File file) throws IOException {
        return reader.readAll(file);
    }

    public InteractionResult applyAlgoOnInteraction(Interaction interaction) throws Exception {

        InteractionResult interactionResult = new InteractionResult();
        interactionResult.setId(interaction.getId());
        List<String> algoOutputs = new ArrayList<>();


        for (AlgoExecutor algoExecutor : algoExecutors) {
            algoOutputs.add(algoExecutor.executeAlgo(interaction));
        }
        interactionResult.setResults(algoOutputs);
        return interactionResult;
    }

    public void writeResults(List<InteractionResult> interactionResults) throws IOException {


        FileWriter writer = null;
        try {
            writer = new FileWriter(outputFilePath);
            for (InteractionResult interactionResult : interactionResults) {
                writer.write(interactionResult.toString() + System.lineSeparator());
            }

        } catch (IOException e) {
            logger.error("Failed to create Writer in writeResults method!!!");
            e.printStackTrace();
        } finally {

            Objects.requireNonNull(writer).close();
        }


    }


}




