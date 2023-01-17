/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author seif
 */
public class Singleton {
private static Singleton instance;
    private ArrayList<String> list = new ArrayList<String>();

    private Singleton() {
        list.add("cat");
        list.add("dog");
        list.add("cow");
        list.add("bull");
        list.add("snake");
        list.add("goat");
        Collections.shuffle(list, new Random());
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            Singleton.instance = new Singleton();
        }
        return instance;
    }

    protected ArrayList<String> getShuffledStrings() { 
        return list;
    }    
}
