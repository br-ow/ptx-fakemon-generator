/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Type;

/**
 *
 * @author Brittany
 */
public class Typing {
    int num_types; //0 if none set, otherwise only 1 or 2.
    String primary_type;
    String secondary_type;
    
    //Constructor for single-type pokemon
    protected Typing(String primary) {
        num_types = 1;
        primary_type = primary;
        secondary_type = "None";
    }
    
    //Constructor for dual-type pokemon
    protected Typing(String primary, String secondary) {
        num_types = 2;
        primary_type = primary;
        secondary_type = secondary;
    }
    
    //Getters for types
    public String getPrimary() {
        return primary_type;
    }
    
    public String getSecondary() {
        return secondary_type;
    }
    
}
