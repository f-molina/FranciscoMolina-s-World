/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoArmy;
import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
public class KoopaTroopas implements Nintendo {
    
    int health, damage;
    
    @Override
    public void construir(){
    }
    
    @Override
    public void recoger(){
    }
    
    @Override
    public int getLife(){
        return health;
    }
    
    @Override
    public void setLife(int newLife){
        health = newLife;
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
}
