package com.directi.training.dip.exerice_refactored;

import java.io.IOException;

public class EncodingModuleBAse64 implements EncodingModule{

    EncodingWithFileAbs fileEncoderBase64=new EncodingWithFileBase64(
        "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt",
        "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");

    Database dbBase64 = new MyDatabase1();
    EncodeWithNetAndDbAbs netAndDbAbsEncoder=new EncodingWithNetAndDb1(
        "http",
        "myfirstappwith.appspot.com",
        "/index.html",
        dbBase64);

    @Override
    public void encodeWithFiles() throws IOException {
        fileEncoderBase64.encodeWithFiles();
    }

    @Override
    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        netAndDbAbsEncoder.encodeBasedOnNetworkAndDatabase();
    }

    

}
