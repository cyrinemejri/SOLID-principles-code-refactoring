package com.directi.training.dip.exerice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingWithNetAndDb1 extends EncodeWithNetAndDbAbs{

    public EncodingWithNetAndDb1(String netProtocol, String netHost, String netFile, Database db) {
            super(netProtocol, netHost, netFile, db);
        }
    
    @Override
    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        URL url;
        url = new URL(getNetProtocol(), getNetHost(), getNetFile());
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        Database database = getDb();
        database.write(encodedString);
    }    
}

