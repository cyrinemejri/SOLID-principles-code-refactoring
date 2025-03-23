package com.directi.training.dip.exerice_refactored;

import java.io.IOException;

public abstract class EncodeWithNetAndDbAbs {
    private String _netProtocol;
    private String _netHost ;
    private String _netFile ;
    private Database db;

    public EncodeWithNetAndDbAbs(String netProtocol, String netHost, String netFile, Database db) {
        this._netProtocol = netProtocol;
        this._netHost = netHost;
        this._netFile = netFile;
        this.db = db;
    }

    public String getNetProtocol() {
        return _netProtocol;
    }

    public String getNetHost() {
        return _netHost;
    }

    public String getNetFile() {
        return _netFile;
    }

    public Database getDb() {
        return db;
    }

    public abstract void encodeBasedOnNetworkAndDatabase() throws IOException;

}
