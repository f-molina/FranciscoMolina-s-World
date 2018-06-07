/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoResources;

import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
public class Mushrooms implements Nintendo{
    
    int health, damage;
    int cantidad = 150;
    
    @Override
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    @Override
    public int construir(int cantidad){
        return cantidad;
    }
    
    @Override
    public int recoger(){
        return cantidad;
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
