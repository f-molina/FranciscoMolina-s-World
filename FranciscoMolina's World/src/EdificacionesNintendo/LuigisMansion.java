/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;

import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
//ed. vehiculo2
public class LuigisMansion implements Nintendo{
    
    int damage, health,cantidad;
    
    @Override
    public int getCantidad(){
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
