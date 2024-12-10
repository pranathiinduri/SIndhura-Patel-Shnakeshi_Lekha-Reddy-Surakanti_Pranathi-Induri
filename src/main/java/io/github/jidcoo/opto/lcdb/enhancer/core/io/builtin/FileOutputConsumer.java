package io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin;

import io.github.jidcoo.opto.lcdb.enhancer.base.OutputConsumer;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputConsumer implements OutputConsumer {

    private final String filePath;

    // Constructor to initialize filePath
    public FileOutputConsumer(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path must not be null or empty.");
        }
        this.filePath = filePath;
    }

    @Override
    public void consume(String output) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // Append mode
            writer.write(output + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public void consumeNextOutput(String output) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consumeNextOutput'");
    }
}