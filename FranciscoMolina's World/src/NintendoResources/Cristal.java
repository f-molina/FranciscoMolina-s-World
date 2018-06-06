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
public class Cristal implements Nintendo{
    
    int damage,health;
    int cantidad=150;
    
    @Override
    public int getCantidad(){
        System.out.println("Cristal:"+cantidad);
        return cantidad;
    }
    
    @Override
    public void setCantidad(int newCantidad){
        cantidad = newCantidad;
    }
    
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
