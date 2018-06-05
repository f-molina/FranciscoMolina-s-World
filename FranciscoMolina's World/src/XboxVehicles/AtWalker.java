/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XboxVehicles;

import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class AtWalker implements Xbox{
    
    int health;
    int damage;
    
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
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
