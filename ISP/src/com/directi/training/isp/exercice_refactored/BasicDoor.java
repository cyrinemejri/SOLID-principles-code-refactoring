package com.directi.training.isp.exercice_refactored;

public abstract class BasicDoor {

    protected boolean _locked;
    protected boolean _opened;

    abstract void lock();

    abstract void unlock();

    abstract void open();

    abstract void close();
}
