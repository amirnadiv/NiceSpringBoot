package com.example.nice3.readers;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.example.nice3.model.Interaction;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;


@Component
public class NiceFileReader implements Reader {


    public List<Interaction> readAll(File file) throws IOException {



        return new CsvToBeanBuilder(new FileReader(file))
                .withType(Interaction.class)
                .build()
                .parse();

    }
}
