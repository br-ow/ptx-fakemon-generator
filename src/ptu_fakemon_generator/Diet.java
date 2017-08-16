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
public enum Diet {
    CARN, HERB, OMNI, PHOTO, TERRA, NULL;
    
    @Override
    public String toString() {
        switch(this) {
            case CARN:
                return "Carnivore";
            case HERB:
                return "Herbivore";
            case OMNI:
                return "Omnivore";
            case PHOTO:
                return "Phototroph";
            case TERRA:
                return "Terravore";
            case NULL:
                return "Nullivore";
        }
        return "Unknown";
    }
}
