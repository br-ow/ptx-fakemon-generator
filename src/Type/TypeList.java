/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Type;

/**
 * Singleton list of all available types
 * Also serves as a factory object to create Typings
 * @author Brittany
 */
public class TypeList {
    
    private static TypeList instance;
    
    //Private Constructor (necessary for singleton)
    private TypeList() {
        
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
        return new Typing("Boof");
    }
}
