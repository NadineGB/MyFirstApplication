package com.example.myapplication.polymorpie;

public class Ente extends Tier {

    public Ente(String name) {
        super(name);
    }

    @Override
    public boolean kannSchwimmen() {
        return true;
    }

    @Override
    public boolean kannFliegen() {
        return true;
    }

    @Override
    public boolean kannQuaken() {
        return true;
    }
}
