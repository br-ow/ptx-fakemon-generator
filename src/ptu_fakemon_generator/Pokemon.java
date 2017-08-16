/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ptu_fakemon_generator;
import java.util.Random;


/**
 *
 * @author Brittany
 */
public class Pokemon {
    
    String name;
    //int dex_num;
    //Put appearance here later
    
    //Base Stats:
    int bst; //base stat total
    int hp;
    int atk;
    int def;
    int spatk;
    int spdef;
    int spd;
    
    //Basic Info:
    //Typing types;
    //Ability set (five):
    //Ability basic_abil;
    //Ability misc_abil; //This can be either basic or advanced!
    //Ability adv_abil; //one of at least two
    //Ability last_adv_abil;
    //Ability hidden_abil;
    //Evolution family/tree
    //PokeFamily evolution;
    
    //Size info:
    int size_class; 
    //float height; //in meters!!!
    int weight_class;
    //float weight; //In kilograms (to keep consistent with the meters)
    
    //Breeding Info:
    GenRatio gender_ratio;
    EggGroups egg_groups;
    int hatch_days;
    
    //Caring Info:
    //Diet diet;
    //HabitatList habitat;
    
    //Capabilities
    //movement capabilities
    int overland;
    int swim;
    //int levitate; //Not all pokemon have this!
    //int sky; //Not all pokemon have this!
    int high_jump;
    int long_jump;
    //Power and Intelligence
    int power;
    int intelligence;
    //Misc capabilities
    //Put other capabilities here!
    
    //Skills
    //SkillRank ath_rank;
    //SkillRank acro_rank;
    //SkillRank combat_rank;
    //SkillRank stealth_rank;
    //SkillRank percep_rank;
    //SkillRank focus_rank;    
    
    //Moves
    //LevelUpMoveList level_movelist;
    //TMList tm_list;
    //MoveList egg_move_list;
    //MoveList tutor_list;
    
    /* Functions:
    * Getters and Setters:
    */
    
    public void setBST(int total) {
        bst = total;
    }
    
    public int getBST() {
        return bst;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getAtk() {
        return atk;
    }
    
    public int getDef() {
        return def;
    }
    
    public int getSpAtk() {
        return spatk;
    }
    
    public int getSpDef() {
        return spdef;
    }
    
    public int getSpd() {
        return spd;
    }
    
    //distribute BST among all base stats
    public void distrStats() {
        //lowest bst is 6
        //each stat must be at least 1
        if (bst < 6) {
            return;
        }
        
        //set each base stat to its minimum of 1
        hp = 1;
        atk = 1;
        def = 1;
        spatk = 1;
        spdef = 1;
        spd = 1;
        
        Random rand = new Random();
        int which_stat;
        //Now add the remaining points randomly
        for (int i = 6; i < bst; i++) {
            //generate the stat to add to randomly
            which_stat = rand.nextInt(6);
            switch (which_stat) {
                case 0:
                    hp++;
                    break;
                case 1:
                    atk++;
                    break;
                case 2:
                    def++;
                    break;
                case 3:
                    spatk++;
                    break;
                case 4:
                    spdef++;
                    break;
                case 5:
                    spd++;
                    break;
            }//end switch
        }//end for 
    }
    
    
}
