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
public class Puerto implements Playstation{
    
    boolean estado=false;
    int damage, cantidad;
    public int health = 200;
    public int costo = 100;
    public Jugador jugador;

    public Puerto() {
    }

    public Puerto(Jugador jugador) {
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
        Playstation puerto = play.getPlayStation("Puerto");
        Puerto p = new Puerto(jugador);
        if(p.getJugador().getCm().getRecurso1() >= costo 
           && p.getJugador().getCm().getRecurso2() >= costo){
            total = p.getJugador().getCm().getRecurso1()-costo;  
            p.getJugador().getCm().setRecurso1(total);
            total1 = p.getJugador().getCm().getRecurso2()-costo;
            p.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            p.getJugador().getEd2().add(puerto);
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
        return estado;
    }
    
}
