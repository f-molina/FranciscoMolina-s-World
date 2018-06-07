/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;

import Nintendo.Nintendo;
import NintendoResources.Mushrooms;

/**
 *
 * @author fmolina
 */
public class MushroomGenerator implements Nintendo{
    
    int damage, cantidad;
    int health = 500;
    int costo = 150;
    Mushrooms m = new Mushrooms();
    
    @Override
    public int getCantidad(){
        return m.getCantidad();
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    @Override
    public int construir(int cantidad){
        int total=0;
        if(m.getCantidad()>=costo){
            total = m.getCantidad()-costo;   
            m.setCantidad(total);
            System.out.println("Construccion realizada, mushrooms restantes: "+total);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
        return total;
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
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
