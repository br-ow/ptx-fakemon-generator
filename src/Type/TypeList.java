/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Type;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Singleton list of all available types
 * Also serves as a factory object to create Typings
 * @author Brittany
 */
public class TypeList {
    
    private static TypeList instance;
    private static ArrayList<String> all_types; //The actual list of types that we are generating from
    private final Random rand;
    
    //Private Constructor (necessary for singleton)
    private TypeList() {
        //TODO: read the list of types from an external config file or something
        //For now, here is a list of some placeholder types
        all_types = new ArrayList<>();
        all_types.add("Fire");
        all_types.add("Water");
        all_types.add("Grass");
        all_types.add("Normal");
        all_types.add("Bug");
        all_types.add("Flying");
        
        rand = new Random(); //For random number generation
        //Using Random() instead of ThreadLocalRandom for ease of testing later.
    }
    
    //If instance doesn't exist, create it. Either way, return it.
    public static TypeList getInstance() {
        if (instance == null) {
            instance = new TypeList();
        }
        return instance;
    }
    
    //Create a Typing object with random types
    public Typing genRandomTyping() {
        //Generate a primary type; equal chance of any type on the list
        int which_primary = rand.nextInt(all_types.size());
        
        //Pass the generated primary type to the Typing constructor and return it
        return new Typing(all_types.get(which_primary));
    }
}
