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
    public int cantidad;

    public Cristal() {
        this.cantidad = 150;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    /*@Override
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }*/
    
    @Override
    public void construir(int cantidad){
        //return cantidad;
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
