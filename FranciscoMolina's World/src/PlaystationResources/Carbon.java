/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaystationResources;

import Playstation.Playstation;

/**
 *
 * @author fmolina
 */
public class Carbon implements Playstation{
    
    int health, damage;
    
    @Override
    public void construir(){
        int cantidad = 50;
        System.out.println("Carbon: "+cantidad);
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
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
