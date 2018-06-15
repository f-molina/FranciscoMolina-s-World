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
public class Tanque implements Nintendo{
    
    public int health = 250;
    public int damage = 150;
    public int costo = 1500;
    int cantidad;
    public Jugador jugador;

    public Tanque() {
    }

    public Tanque(Jugador jugador) {
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
        Nintendo tanque = nintendo.getNintendo("Tanque");
        Tanque ta = new Tanque(jugador);
        if(ta.getJugador().getCm().getRecurso1() >= costo 
           && ta.getJugador().getCm().getRecurso2() >= costo){
            total = ta.getJugador().getCm().getRecurso1()-costo;  
            ta.getJugador().getCm().setRecurso1(total);
            total1 = ta.getJugador().getCm().getRecurso2()-costo;
            ta.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ta.getJugador().getV1().add(tanque);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
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
    
    @Override
    public void generar(Jugador jugador){
    }
}
