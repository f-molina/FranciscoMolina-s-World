/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoArmy;

import Juego.Jugador;
import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
public class Bayonetta implements Nintendo {
    
    public int health=500;
    public int damage = 350;
    public int costo = 200;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public Bayonetta() {
    }

    public Bayonetta(Jugador jugador) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public void construir(Jugador jugador){
        //return cantidad;
    }
    
    @Override
    public int recoger(){
        return cantidad;
    }
    
    @Override
    public int getAttack(){
        return health;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        Bayonetta b = new Bayonetta(jugador);
        if(b.getJugador().getCm().getRecurso1() >= costo 
           && b.getJugador().getCm().getRecurso3() >= costo && estado==false){
            total = b.getJugador().getCm().getRecurso1()-costo;  
            b.getJugador().getCm().setRecurso1(total);
            total1 = b.getJugador().getCm().getRecurso3()-costo;
            b.getJugador().getCm().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno Bayonetta");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }
    
}
