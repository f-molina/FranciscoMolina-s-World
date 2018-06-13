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
public class KoopaTroopas implements Nintendo {
    
    public int health = 100;
    public int damage = 500;
    public int costo = 100;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public KoopaTroopas() {
    }

    public KoopaTroopas(Jugador jugador) {
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
        Bayonetta b = new Bayonetta();
        int total;
        System.out.println("antes "+b.getHealth());
        total = b.getHealth()-getDamage();
        b.setHealth(total);
        System.out.println("despues "+b.getHealth());
        return total;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        KoopaTroopas kt = new KoopaTroopas(jugador);
        if(kt.getJugador().getCm().getRecurso1() >= costo 
           && kt.getJugador().getCm().getRecurso2() >= costo && estado==false){
            total = kt.getJugador().getCm().getRecurso1()-costo;  
            kt.getJugador().getCm().setRecurso1(total);
            total1 = kt.getJugador().getCm().getRecurso2()-costo;
            kt.getJugador().getCm().setRecurso2(total1);
            setEstado(true);
            System.out.println("Se entreno Koopa Troopas");
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
}
