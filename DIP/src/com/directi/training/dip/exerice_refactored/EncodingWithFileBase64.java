package com.directi.training.dip.exerice_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class EncodingWithFileBase64 extends EncodingWithFileAbs { 

    public EncodingWithFileBase64(String fileDirInput,String fileDirOutput){
        super(fileDirInput, fileDirOutput);
    }

    @Override
    public void encodeWithFiles() throws IOException {
        {
            BufferedReader reader = null;
            BufferedWriter writer = null;
            
            try {
                reader = new BufferedReader(
                    new FileReader(getFileDirInput()));
                writer = new BufferedWriter(
                    new FileWriter(getFileDirOutput()));
                String aLine;
                while ((aLine = reader.readLine()) != null) {
                    String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                    writer.append(encodedLine);
                }
            } finally {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            }
        }
}
}