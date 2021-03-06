/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaystationArmy;
import Juego.Jugador;
import Playstation.Playstation;

/**
 *
 * @author fmolina
 */
public class Kratos implements Playstation{
    
    public int damage =500;
    public int health = 500;
    public int costo = 2000;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public Kratos() {
    }

    public Kratos(Jugador jugador) {
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
        Kratos kr = new Kratos(jugador);
        if(kr.getJugador().getCm2().getRecurso2() >= costo 
           && kr.getJugador().getCm2().getRecurso3() >= costo && estado==false){
            total = kr.getJugador().getCm2().getRecurso2()-costo;  
            kr.getJugador().getCm2().setRecurso2(total);
            total1 = kr.getJugador().getCm2().getRecurso3()-costo;
            kr.getJugador().getCm2().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno a Kratos");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
}
