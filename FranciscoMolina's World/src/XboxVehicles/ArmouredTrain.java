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
public class ArmouredTrain implements Xbox{
    
    @Override
    public void attack(){
        int damage = 250;
    }
    
    @Override
    public void life(){
        int health = 250;
    }
    
    @Override
    public void construir(){
    }
    
    @Override
    public void recoger(){
    }
    
}