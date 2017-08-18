package fakemon_generator_tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ptu_fakemon_generator.Pokemon;
import Type.TypeList;
import Type.Typing;

/**
 *
 * @author Brittany
 */
public class PokeTest {
    
    
    
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
        
        assertTrue(
            (pokmon.getHp() != pokermon.getHp()) ||
            (pokmon.getHp() != pokomon.getHp()) ||
            (pokmon.getHp() != poqmon.getHp()) ||
            (pokmon.getHp() != pocmon.getHp()) ||
            (pokmon.getHp() != pokamon.getHp()) ||
            (pokmon.getHp() != pokumon.getHp()) ||
            (pokmon.getHp() != pokymon.getHp()) ||
            (pokmon.getHp() != popmon.getHp()) ||
            (pokmon.getHp() != podmon.getHp())
        );
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
        
        assertTrue(
            (pokmon.getAtk() != pokermon.getAtk()) ||
            (pokmon.getAtk() != pokomon.getAtk()) ||
            (pokmon.getAtk() != poqmon.getAtk()) ||
            (pokmon.getAtk() != pocmon.getAtk()) ||
            (pokmon.getAtk() != pokamon.getAtk()) ||
            (pokmon.getAtk() != pokumon.getAtk()) ||
            (pokmon.getAtk() != pokymon.getAtk()) ||
            (pokmon.getAtk() != popmon.getAtk()) ||
            (pokmon.getAtk() != podmon.getAtk())
        );
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
        
        assertTrue(
            (pokmon.getDef() != pokermon.getDef()) ||
            (pokmon.getDef() != pokomon.getDef()) ||
            (pokmon.getDef() != poqmon.getDef()) ||
            (pokmon.getDef() != pocmon.getDef()) ||
            (pokmon.getDef() != pokamon.getDef()) ||
            (pokmon.getDef() != pokumon.getDef()) ||
            (pokmon.getDef() != pokymon.getDef()) ||
            (pokmon.getDef() != popmon.getDef()) ||
            (pokmon.getDef() != podmon.getDef())
        );
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
        
        assertTrue(
            (pokmon.getSpAtk() != pokermon.getSpAtk()) ||
            (pokmon.getSpAtk() != pokomon.getSpAtk()) ||
            (pokmon.getSpAtk() != poqmon.getSpAtk()) ||
            (pokmon.getSpAtk() != pocmon.getSpAtk()) ||
            (pokmon.getSpAtk() != pokamon.getSpAtk()) ||
            (pokmon.getSpAtk() != pokumon.getSpAtk()) ||
            (pokmon.getSpAtk() != pokymon.getSpAtk()) ||
            (pokmon.getSpAtk() != popmon.getSpAtk()) ||
            (pokmon.getSpAtk() != podmon.getSpAtk())
        );
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
        
        assertTrue(
            (pokmon.getSpDef() != pokermon.getSpDef()) ||
            (pokmon.getSpDef() != pokomon.getSpDef()) ||
            (pokmon.getSpDef() != poqmon.getSpDef()) ||
            (pokmon.getSpDef() != pocmon.getSpDef()) ||
            (pokmon.getSpDef() != pokamon.getSpDef()) ||
            (pokmon.getSpDef() != pokumon.getSpDef()) ||
            (pokmon.getSpDef() != pokymon.getSpDef()) ||
            (pokmon.getSpDef() != popmon.getSpDef()) ||
            (pokmon.getSpDef() != podmon.getSpDef())
        );
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
        
        assertTrue(
            (pokmon.getSpd() != pokermon.getSpd()) ||
            (pokmon.getSpd() != pokomon.getSpd()) ||
            (pokmon.getSpd() != poqmon.getSpd()) ||
            (pokmon.getSpd() != pocmon.getSpd()) ||
            (pokmon.getSpd() != pokamon.getSpd()) ||
            (pokmon.getSpd() != pokumon.getSpd()) ||
            (pokmon.getSpd() != pokymon.getSpd()) ||
            (pokmon.getSpd() != popmon.getSpd()) ||
            (pokmon.getSpd() != podmon.getSpd())
        );
    }
    
    
    @Test
    public void typingTest() {
        TypeList types = TypeList.getInstance();
        Typing new_typing = types.genRandomTyping();
        
        assertTrue(new_typing.getPrimary() != "None");
    }
    
}//end of tests
