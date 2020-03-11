package com.example.myapplication;

import com.example.myapplication.polymorpie.Ente;
import com.example.myapplication.polymorpie.Lebewesen;
import com.example.myapplication.polymorpie.Mensch;
import com.example.myapplication.polymorpie.Tier;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testPolymorphie() {
        Lebewesen lebewesen = new Ente("name");

        boolean expected = false;
        boolean actual = lebewesen instanceof Mensch;

        assertEquals(expected, actual);
    }
}