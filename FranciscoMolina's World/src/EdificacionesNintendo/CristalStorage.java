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
public class CristalStorage implements Nintendo{
    
    int damage, cantidad=1000;
    int health = 500;
    int costo = 1500;
    public Jugador jugador;
    
    public CristalStorage(){
        
    }

    public CristalStorage(Jugador jugador) {
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo nint1 = nintendo.getNintendo("CristalStorage");
        CristalStorage cs = new CristalStorage(jugador);
        if(cs.getJugador().getCm().getRecurso2() >= costo 
           && cs.getJugador().getCm().getRecurso3() >= costo){
            total = cs.getJugador().getCm().getRecurso2()-costo;  
            cs.getJugador().getCm().setRecurso2(total);
            total1 = cs.getJugador().getCm().getRecurso3()-costo;
            cs.getJugador().getCm().setRecurso3(total1);
            System.out.println("Construccion realizada");
            cs.getJugador().getEd1().add(nint1);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
        int num;
        CristalStorage a = new CristalStorage(jugador);
        num = a.getCantidad();
        a.getJugador().getCm().setRecurso2(a.getJugador().getCm().getRecurso2()+num);
        return num;
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        boolean estado =false;
        return estado;
    }
    
    @Override
    public boolean estado(){
        boolean estado = false;
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
}
