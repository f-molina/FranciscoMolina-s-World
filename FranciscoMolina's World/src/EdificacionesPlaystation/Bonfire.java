/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesPlaystation;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Juego.Jugador;
import Playstation.Playstation;

/**
 *
 * @author fmolina
 */
//entrenar
public class Bonfire implements Playstation{
    
    boolean estado=false;
    int damage, cantidad;
    public int health = 200;
    public int costo = 1000;
    public Jugador jugador;

    public Bonfire() {
    }

    public Bonfire(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory play = FactoryProducer.getFactory("Playstation");
        Playstation bonfire = play.getPlayStation("Bonfire");
        Bonfire b = new Bonfire(jugador);
        if(b.getJugador().getCm2().getRecurso3() >= costo 
           && b.getJugador().getCm2().getRecurso2() >= costo){
            total = b.getJugador().getCm2().getRecurso3()-costo;  
            b.getJugador().getCm2().setRecurso3(total);
            total1 = b.getJugador().getCm2().getRecurso2()-costo;
            b.getJugador().getCm2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            b.getJugador().getEd2().add(bonfire);
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
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
    
}
