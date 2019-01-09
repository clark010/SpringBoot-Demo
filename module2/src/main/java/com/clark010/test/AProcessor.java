package com.clark010.test;

public abstract class AProcessor {
    public abstract boolean init();
    public abstract Status process(Doc doc);
    public abstract boolean cleanup();
}
