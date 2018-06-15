/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XboxArmy;

import Juego.Jugador;
import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class MasterChief implements Xbox{
    
    public int damage =75;
    public int health = 75;
    public int costo = 75;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public MasterChief() {
    }

    public MasterChief(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
        int total, total1;
        MasterChief h = new MasterChief(jugador);
        if(h.getJugador().getCm().getRecurso1() >= costo 
           && h.getJugador().getCm().getRecurso3() >= costo && estado==false){
            total = h.getJugador().getCm().getRecurso1()-costo;  
            h.getJugador().getCm().setRecurso1(total);
            total1 = h.getJugador().getCm().getRecurso3()-costo;
            h.getJugador().getCm().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno a Master Chief");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
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
