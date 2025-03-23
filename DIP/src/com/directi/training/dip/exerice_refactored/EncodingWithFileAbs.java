package com.directi.training.dip.exerice_refactored;

import java.io.IOException;

public abstract class EncodingWithFileAbs {
    private String _fileDirInput;
    private String _fileDirOutput;

    public EncodingWithFileAbs(String fileDirInput, String fileDirOutput) {
        _fileDirInput = fileDirInput;
        _fileDirOutput = fileDirOutput;
    }

    public abstract void encodeWithFiles() throws IOException;

    public String getFileDirInput() {
        return _fileDirInput;
    }

    public String getFileDirOutput() {
        return _fileDirOutput;
    }
}
