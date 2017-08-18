package fakemon_generator_tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Type.TypeList;
import Type.Typing;
import java.util.ArrayList;
import java.util.ListIterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ptu_fakemon_generator.Pokemon;

/**
 *
 * @author Brittany
 */
public class PokeTest {
    
        //for comparing many of the same sort of object
        //ONLY FOR USE on lists of items that implement the equals() function!
        //So ONLY use it for primitives, strings, etc. and not the classes implemented in this project.
    private boolean areAllIdentical(ArrayList list) {
            boolean answer = true;
            //Start the iterator at the second thing on the list
            //We don't need to compare the first item against itself
            ListIterator iterator = list.listIterator(1); 
            while (iterator.hasNext()) {
                if ( (list.get(0).equals(iterator.next())) ) {
                    //do nothing, because these two are identical
                }
                else { //these two are not identical
                    answer = false;
                }
            }
            return answer;
    };
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pokeTest() {
        Pokemon pokmon = new Pokemon();
        assertEquals(pokmon, pokmon);
    }
    
    @Test
    public void bstTest() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(6);
        assertEquals(pokmon.getBST(), 6);
    }
    
    @Test
    public void bstSetGet() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(10);
        assertEquals(pokmon.getBST(), 10);
    }
    
    @Test
    public void bstEqualsStats() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(6);
        pokmon.distrStats();
        assertEquals(pokmon.getBST(), 
                (pokmon.getHp() + pokmon.getAtk() + pokmon.getDef() + pokmon.getSpAtk() + pokmon.getSpDef() + pokmon.getSpd())
        );
    }
    
    @Test
    public void bstEqualsStatsTwo() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(18);
        pokmon.distrStats();
        assertEquals(pokmon.getBST(), 
                (pokmon.getHp() + pokmon.getAtk() + pokmon.getDef() + pokmon.getSpAtk() + pokmon.getSpDef() + pokmon.getSpd())
        );
    }
    
    //Test that the stats are not the same every time
    @Test
    public void randomHpDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated HP values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getHp());
        pokelist.add(pokermon.getHp());
        pokelist.add(pokomon.getHp());
        pokelist.add(poqmon.getHp());
        pokelist.add(pocmon.getHp());
        pokelist.add(pokamon.getHp());
        pokelist.add(pokumon.getHp());
        pokelist.add(pokymon.getHp());
        pokelist.add(popmon.getHp());
        pokelist.add(podmon.getHp());
        
        assertFalse(areAllIdentical(pokelist));
    }
    
    //Test that the stats are not the same every time
    @Test
    public void randomAtkDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated ATK values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getAtk());
        pokelist.add(pokermon.getAtk());
        pokelist.add(pokomon.getAtk());
        pokelist.add(poqmon.getAtk());
        pokelist.add(pocmon.getAtk());
        pokelist.add(pokamon.getAtk());
        pokelist.add(pokumon.getAtk());
        pokelist.add(pokymon.getAtk());
        pokelist.add(popmon.getAtk());
        pokelist.add(podmon.getAtk());
        
        assertFalse(areAllIdentical(pokelist));
    }
    
    //Test that the stats are not the same every time
    @Test
    public void randomDefDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated DEF values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getDef());
        pokelist.add(pokermon.getDef());
        pokelist.add(pokomon.getDef());
        pokelist.add(poqmon.getDef());
        pokelist.add(pocmon.getDef());
        pokelist.add(pokamon.getDef());
        pokelist.add(pokumon.getDef());
        pokelist.add(pokymon.getDef());
        pokelist.add(popmon.getDef());
        pokelist.add(podmon.getDef());
        
        assertFalse(areAllIdentical(pokelist));
        
    }
    
    //Test that the stats are not the same every time
    @Test
    public void randomSpAtkDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated SPATK values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getSpAtk());
        pokelist.add(pokermon.getSpAtk());
        pokelist.add(pokomon.getSpAtk());
        pokelist.add(poqmon.getSpAtk());
        pokelist.add(pocmon.getSpAtk());
        pokelist.add(pokamon.getSpAtk());
        pokelist.add(pokumon.getSpAtk());
        pokelist.add(pokymon.getSpAtk());
        pokelist.add(popmon.getSpAtk());
        pokelist.add(podmon.getSpAtk());
        
        assertFalse(areAllIdentical(pokelist));
    }
    
    //Test that the stats are not the same every time
    @Test
    public void randomSpDefDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated SPDEF values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getSpDef());
        pokelist.add(pokermon.getSpDef());
        pokelist.add(pokomon.getSpDef());
        pokelist.add(poqmon.getSpDef());
        pokelist.add(pocmon.getSpDef());
        pokelist.add(pokamon.getSpDef());
        pokelist.add(pokumon.getSpDef());
        pokelist.add(pokymon.getSpDef());
        pokelist.add(popmon.getSpDef());
        pokelist.add(podmon.getSpDef());
        
        assertFalse(areAllIdentical(pokelist));
    }
    
    
    //Test that the stats are not the same every time
    @Test
    public void randomSpdDistr() {
        Pokemon pokmon = new Pokemon();
        pokmon.setBST(45);
        pokmon.distrStats();
        
        Pokemon pokermon = new Pokemon();
        pokermon.setBST(45);
        pokermon.distrStats();
        
        Pokemon pokomon = new Pokemon();
        pokomon.setBST(45);
        pokomon.distrStats();
        
        Pokemon poqmon = new Pokemon();
        poqmon.setBST(45);
        poqmon.distrStats();
        
        Pokemon pocmon = new Pokemon();
        pocmon.setBST(45);
        pocmon.distrStats();
        
        Pokemon pokamon = new Pokemon();
        pokamon.setBST(45);
        pokamon.distrStats();
        
        Pokemon pokumon = new Pokemon();
        pokumon.setBST(45);
        pokumon.distrStats();
        
        Pokemon pokymon = new Pokemon();
        pokymon.setBST(45);
        pokymon.distrStats();
        
        Pokemon popmon = new Pokemon();
        popmon.setBST(45);
        popmon.distrStats();
        
        Pokemon podmon = new Pokemon();
        podmon.setBST(45);
        podmon.distrStats();
        
        //Add all of the generated SPD values to a list so that we can more easily compare them
        ArrayList pokelist = new ArrayList ();
        pokelist.add(pokmon.getSpd());
        pokelist.add(pokermon.getSpd());
        pokelist.add(pokomon.getSpd());
        pokelist.add(poqmon.getSpd());
        pokelist.add(pocmon.getSpd());
        pokelist.add(pokamon.getSpd());
        pokelist.add(pokumon.getSpd());
        pokelist.add(pokymon.getSpd());
        pokelist.add(popmon.getSpd());
        pokelist.add(podmon.getSpd());
        
        assertFalse(areAllIdentical(pokelist));
    }
    
    //-----------------Typing Tests------------------
    //Test that a valid typing is generated (at least a primary type)
    @Test
    public void typingTest() {
        TypeList types = TypeList.getInstance();
        Typing new_typing = types.genRandomTyping();
        
        assertTrue(new_typing.getPrimary() != "None");
    }
    
    //Test that the primary type is not the same every time.
    @Test
    public void typingUniquenessTest() {
        TypeList types = TypeList.getInstance();
        Typing typing = types.genRandomTyping();
        Typing typing_two = types.genRandomTyping();
        Typing typing_three = types.genRandomTyping();
        Typing typing_four = types.genRandomTyping();
        Typing typing_five = types.genRandomTyping();
        Typing typing_six = types.genRandomTyping();
        Typing typing_seven = types.genRandomTyping();
        Typing typing_eight = types.genRandomTyping();
        Typing typing_nine = types.genRandomTyping();
        Typing typing_ten = types.genRandomTyping();
        
        //Add all of the generated primary types to a list so that we can more easily compare them
        ArrayList typing_list = new ArrayList ();
        typing_list.add(typing.getPrimary());
        typing_list.add(typing_two.getPrimary());
        typing_list.add(typing_three.getPrimary());
        typing_list.add(typing_four.getPrimary());
        typing_list.add(typing_five.getPrimary());
        typing_list.add(typing_six.getPrimary());
        typing_list.add(typing_seven.getPrimary());
        typing_list.add(typing_eight.getPrimary());
        typing_list.add(typing_nine.getPrimary());
        typing_list.add(typing_ten.getPrimary());
        
        assertFalse(areAllIdentical(typing_list));
        
    }
    
}//end of tests
