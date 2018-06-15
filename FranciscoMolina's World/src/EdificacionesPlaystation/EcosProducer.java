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
public class EcosProducer implements Playstation{
    
    boolean estado=false;
    int damage, cantidad;
    public int health = 500;
    public int costo = 2000;
    public Jugador jugador;

    public EcosProducer() {
    }

    public EcosProducer(Jugador jugador) {
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
        Playstation ecos = play.getPlayStation("EcosProducer");
        EcosProducer ep = new EcosProducer(jugador);
        if(ep.getJugador().getCm2().getRecurso1() >= costo 
           && ep.getJugador().getCm2().getRecurso3() >= costo){
            total = ep.getJugador().getCm2().getRecurso1()-costo;  
            ep.getJugador().getCm2().setRecurso1(total);
            total1 = ep.getJugador().getCm2().getRecurso3()-costo;
            ep.getJugador().getCm2().setRecurso3(total1);
            System.out.println("Construccion realizada");
            ep.getJugador().getEd2().add(ecos);
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
        EcosProducer m = new EcosProducer(jugador);
        m.getJugador().getCm2().setRecurso3(m.getJugador().getCm2().getRecurso3()+1500);
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
}
