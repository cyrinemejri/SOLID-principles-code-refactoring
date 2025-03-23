package com.directi.training.dip.exerice_refactored;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncodingFileWithReverse  extends EncodingWithFileAbs{

    public EncodingFileWithReverse(String fileDirInput, String fileDirOutput) {
            super(fileDirInput, fileDirOutput);
        }
    
        @Override
        public void encodeWithFiles() throws IOException {
        // Example encoding logic
        String inputFilePath = getFileDirInput();
        String outputFilePath = getFileDirOutput();

        // Read the file content from the input directory (just an example)
        String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));

        // Apply some encoding (here we just reverse the string as a simple example)
        String encodedContent = new StringBuilder(content).reverse().toString();

        // Write the encoded content to the output file
        Files.write(Paths.get(outputFilePath), encodedContent.getBytes());

        System.out.println("File has been encoded and saved to: " + outputFilePath);
    }
}
