/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;
import Juego.Jugador;
import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
public class AceroStorage implements Nintendo{
    
    int damage, cantidad;
    public int health = 500;
    public int costo = 100;

    public Jugador jugador;

    public AceroStorage() {
    }

    public AceroStorage(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
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
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AceroStorage ac = new AceroStorage(jugador);
        if(ac.getJugador().getRes1().getAcero().getCantidad() >= costo 
           && ac.getJugador().getRes2().getCristal().getCantidad() >= costo){
            total = ac.getJugador().getRes1().getAcero().getCantidad()-costo;  
            ac.getJugador().getRes1().getAcero().setCantidad(total);
            total1 = ac.getJugador().getRes2().getCristal().getCantidad()-costo;
            ac.getJugador().getRes2().getCristal().setCantidad(total1);
            System.out.println("Construccion realizada");
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(){
        int num=0;
        //num = a.getCantidad();
        setCantidad(0);
        return num;
    }
    
    @Override
    public int getLife(){
        return health;
    }
    
    @Override
    public void setLife(int newLife){
        health = newLife;
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
