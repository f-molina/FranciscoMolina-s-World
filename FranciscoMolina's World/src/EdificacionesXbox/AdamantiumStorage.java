/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesXbox;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Juego.Jugador;
import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class AdamantiumStorage implements Xbox{
    
    boolean estado=false;
    int damage, cantidad;
    public int health = 350;
    public int costo = 1500;
    public Jugador jugador;

    public AdamantiumStorage() {
    }

    public AdamantiumStorage(Jugador jugador) {
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
        AbstractFactory xbox = FactoryProducer.getFactory("Xbox");
        Xbox adamantium = xbox.getXbox("Adamantium");
        AdamantiumStorage a = new AdamantiumStorage(jugador);
        if(a.getJugador().getCm().getRecurso1() >= costo 
           && a.getJugador().getCm().getRecurso2() >= costo){
            total = a.getJugador().getCm().getRecurso1()-costo;  
            a.getJugador().getCm().setRecurso1(total);
            total1 = a.getJugador().getCm().getRecurso2()-costo;
            a.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            a.getJugador().getEd3().add(adamantium);
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
    
    @Override
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
        
    }
    
}
