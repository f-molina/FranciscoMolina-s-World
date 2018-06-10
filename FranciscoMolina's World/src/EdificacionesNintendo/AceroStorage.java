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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Acero getA() {
        return a;
    }

    public void setA(Acero a) {
        this.a = a;
    }

    public Cristal getC() {
        return c;
    }

    public void setC(Cristal c) {
        this.c = c;
    }
    
    
    
    /*@Override
    public int getCantidad(){
        return a.getCantidad();
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }*/
    
    @Override
    public void construir(int cantidad){
        int total, total1;
        if(a.getCantidad() >= costo && c.getCantidad() >= costo){
            total = a.getCantidad()-costo;   
            a.setCantidad(total);
            total1 = c.getCantidad()-costo;
            c.setCantidad(total1);
            System.out.println("Construccion realizada, acero restante: "+a.getCantidad());
            System.out.println("cirstal restante: "+c.getCantidad());
        }else{
            System.out.println("No tiene recursos suficientes");
        }
        //return total;
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
