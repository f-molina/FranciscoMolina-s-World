/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoVehicles;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Juego.Jugador;
import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
//nave star fox 
public class Arwing implements Nintendo{
    
    public int health = 200;
    public int damage = 100;
    public int costo = 50;
    int cantidad;
    public Jugador jugador;

    public Arwing() {
    }

    public Arwing(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo arwing = nintendo.getNintendo("Arwing");
        Arwing ar = new Arwing(jugador);
        if(ar.getJugador().getCm().getRecurso1() >= costo 
           && ar.getJugador().getCm().getRecurso2() >= costo){
            total = ar.getJugador().getCm().getRecurso1()-costo;  
            ar.getJugador().getCm().setRecurso1(total);
            total1 = ar.getJugador().getCm().getRecurso2()-costo;
            ar.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ar.getJugador().getV1().add(arwing);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(){
        return cantidad;
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        boolean estado =false;
        return estado;
    }
    
    @Override
    public boolean estado(){
        boolean estado =false;
        return estado;
    }
    
}
