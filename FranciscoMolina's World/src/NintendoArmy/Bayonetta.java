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
public class Bayonetta implements Nintendo {
    
    int health=500;
    int damage = 350;
    int cantidad;
    
    @Override
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public void setCantidad(int newCantidad){
        cantidad = newCantidad;
    }
    
    @Override
    public int construir(int cantidad){
        return cantidad;
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
