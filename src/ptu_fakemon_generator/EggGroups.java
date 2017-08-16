/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ptu_fakemon_generator;

/**
 *
 * @author Brittany
 */
public class EggGroups {
    
    private String group_one;
    private String group_two; //Optional! Not all pokemon have two egg groups.
   
    //Returns egg groups as a string
    @Override
    public String toString() {
        if (!group_two.equals("")) {
            return group_one;
        }
        //else
        return group_one.concat(" / ".concat(group_two));
    }
    
}
