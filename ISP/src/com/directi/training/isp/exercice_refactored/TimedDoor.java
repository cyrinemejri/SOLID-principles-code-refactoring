package com.directi.training.isp.exercice_refactored;

public class TimedDoor extends BasicDoor implements ITimerCallback {
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void lock() { _locked = true; }

    @Override
    public void unlock() { _locked = false; }

    @Override
    public void open() {
        if (!_locked) _opened = true;
    }

    @Override
    public void close() { _opened = false; }

    @Override
    public void timeOutCallback() {
        _locked = true; 
    }
}
