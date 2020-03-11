package com.example.myapplication.polymorpie;

public abstract class Tier extends Lebewesen {

    public Tier(String name) {
        super(name);
    }

    public boolean kannQuaken() {
        return false;
    }

}
