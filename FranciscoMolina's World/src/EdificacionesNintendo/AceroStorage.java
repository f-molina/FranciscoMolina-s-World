/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesNintendo;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
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
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo acSt = nintendo.getNintendo("AceroStorage");
        AceroStorage ac = new AceroStorage(jugador);
        if(ac.getJugador().getCm().getRecurso1() >= costo 
           && ac.getJugador().getCm().getRecurso2() >= costo){
            total = ac.getJugador().getCm().getRecurso1()-costo;  
            ac.getJugador().getCm().setRecurso1(total);
            total1 = ac.getJugador().getCm().getRecurso2()-costo;
            ac.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ac.getJugador().getEd1().add(acSt);
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
