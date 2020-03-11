package com.example.myapplication.polymorpie;

public abstract class Lebewesen {

    protected String name;

    public Lebewesen(String name) {
        this.name = name;
    }

    public boolean kannSchwimmen(){
        return false;
    }

    public abstract boolean kannFliegen();
}
