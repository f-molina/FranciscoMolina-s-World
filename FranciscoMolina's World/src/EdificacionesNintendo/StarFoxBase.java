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
//edificacion vehiculo1
public class StarFoxBase implements Nintendo{
    
    public int health = 100;
    public int costo = 25;
    int damage;
    int cantidad;
    
    public Jugador jugador;

    public StarFoxBase() {
    }

    public StarFoxBase(Jugador jugador) {
        this.jugador = jugador;
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void construir(Jugador jugador){
        int total, total1;
        StarFoxBase sb = new StarFoxBase(jugador);
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo nint5 = nintendo.getNintendo("Starfox");
        if(sb.getJugador().getCm().getRecurso2() >= costo 
           && sb.getJugador().getCm().getRecurso3() >= costo){
            total = sb.getJugador().getCm().getRecurso2()-costo;  
            sb.getJugador().getCm().setRecurso2(total);
            total1 = sb.getJugador().getCm().getRecurso3()-costo;
            sb.getJugador().getCm().setRecurso3(total1);
            System.out.println("Construccion realizada");
            sb.getJugador().getEd1().add(nint5);
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
