/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;

import Nintendo.Nintendo;
import NintendoResources.Cristal;
import NintendoResources.Mushrooms;

/**
 *
 * @author fmolina
 */
public class CristalStorage implements Nintendo{
    
    int damage, cantidad;
    int health = 200;
    int costo = 75;
    Cristal c = new Cristal();
    Mushrooms m = new Mushrooms();

    /*@Override
    public int getCantidad(){
        return c.getCantidad();
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }*/
    
    @Override
    public void construir(int cantidad){
        int total, total1;
        if(c.getCantidad()>=costo && m.getCantidad()>=costo){
            total = c.getCantidad()-costo;   
            c.setCantidad(total);
            total1 = m.getCantidad()-costo;
            m.setCantidad(total1);
            System.out.println("Construccion realizada, cristal restante: "+total);
            System.out.println("mushrooms restante: "+total1);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
        //return total;
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
