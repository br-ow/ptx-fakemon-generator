/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ptu_fakemon_generator;

/**
 * GenRatio; represents all possible gender ratios for pokemon species.
 * There's also an extra one; FMostly is not present in canon.
 * This page used for reference:
 * http://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html
 * @author Brittany
 */
public enum GenRatio {
    GENDERLESS, MONLY, MMOSTLY, MCOMMON, EQUAL, FCOMMON, FMOSTLY, FONLY, HERM;

    //Returns the gender ratio written as a string.
    @Override
    public String toString() {
        switch (this) {
            case GENDERLESS:
                return "No Gender";
            case MONLY:
                return "100% M / 0% F";
            case MMOSTLY:
                return "87.5% M / 12.5% F";
            case MCOMMON:
                return "75% M / 25% F";
            case EQUAL:
                return "50% M / 50% F";
            case FCOMMON:
                return "25% M / 75% F";
            case FMOSTLY:
                return "12.5% M / 87.5% F";
            case FONLY:
                return "0% M / 100% F";
            case HERM:
                return "Hermaphrodite";
        }
        return "Error!";
    }

}

