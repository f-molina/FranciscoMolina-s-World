/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;
import Juego.Jugador;
import Juego.Menu;
import Nintendo.Nintendo;
import NintendoResources.Acero;
import NintendoResources.Cristal;
import NintendoResources.Mushrooms;

/**
 *
 * @author fmolina
 */
public class AceroStorage implements Nintendo{
    
    int damage, cantidad;
    public int health;
    public int costo;

    public Jugador jugador;
    Acero a = new Acero();
    Cristal c = new Cristal();
    Mushrooms m = new Mushrooms();

    public AceroStorage() {
    }

    public AceroStorage(Jugador jugador) {
        this.jugador = jugador;
    }

    public AceroStorage(int health, int costo, Jugador jugador) {
        this.health = 500;
        this.costo = 100;
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
    
    /*@Override
    public int getCantidad(){
        return a.getCantidad();
    }
    
    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }*/
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        /*if(st.getJugador().getA().getCantidad() >= costo && st.getJugador().getC().getCantidad() >= costo){
            total = st.getJugador().getA().getCantidad()-costo;  
            st.getJugador().getA().setCantidad(total);
            total1 = st.getJugador().getC().getCantidad()-costo;
            st.getJugador().getC().setCantidad(total1);
            System.out.println("Construccion realizada, acero restante: "+st.getJugador().getA().getCantidad());
            System.out.println("cirstal restante: "+st.getJugador().getA().getCantidad());
        }else{
            System.out.println("No tiene recursos suficientes");
        }*/
    }
    
    @Override
    public int recoger(){
        int num;
        num = a.getCantidad();
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
