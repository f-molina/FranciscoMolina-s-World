/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XboxResources;

import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class Adamantium implements Xbox{
    
    int health, damage;
    int cantidad = 150;
    
    @Override
    public int getCantidad(){
        System.out.println("Adamantium:"+cantidad);
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
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
}
