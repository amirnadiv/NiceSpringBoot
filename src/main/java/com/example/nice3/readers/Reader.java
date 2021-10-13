package com.example.nice3.readers;

import com.example.nice3.model.Interaction;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reader {

    List<Interaction>  readAll(File file) throws IOException;
}
