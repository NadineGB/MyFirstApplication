package com.example.myapplication.polymorpie;

public class Mensch extends Lebewesen {

    public Mensch(String name) {
        super(name);
    }

    @Override
    public boolean kannFliegen() {
        return false;
    }

}
