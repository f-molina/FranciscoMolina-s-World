/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;

import Nintendo.Nintendo;
import NintendoResources.Acero;
import NintendoResources.Cristal;

/**
 *
 * @author fmolina
 */
public class AceroStorage implements Nintendo{
    
    int damage, cantidad;
    int health = 500;
    int costo = 100;
    Acero a = new Acero();
    Cristal c = new Cristal();
    
    @Override
    public int getCantidad(){
        return a.getCantidad();
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    @Override
    public int construir(int cantidad){
        int total=0, total1=0;
        if(a.getCantidad()>=costo && c.getCantidad()>=costo){
            total = a.getCantidad()-costo;   
            a.setCantidad(total);
            total1 = c.getCantidad()-costo;
            c.setCantidad(total1);
            System.out.println("Construccion realizada, acero restante: "+total);
            System.out.println("cirstal restante: "+total1);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
        return total;
    }
    
    @Override
    public int recoger(){
        int num;
        num = a.getCantidad();
        setCantidad(0);
        return num;
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
