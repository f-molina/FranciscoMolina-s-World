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
//entrenar escuadrones
public class PokemonGym implements Nintendo{
    
    public int health = 350;
    public int costo = 100;
    int damage;
    int cantidad;
    
    public Jugador jugador;

    public PokemonGym() {
    }

    public PokemonGym(Jugador jugador) {
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
        PokemonGym pg = new PokemonGym(jugador);
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo nint4 = nintendo.getNintendo("PokemonGym");
        if(pg.getJugador().getCm().getRecurso1() >= costo 
           && pg.getJugador().getCm().getRecurso2() >= costo){
            total = pg.getJugador().getCm().getRecurso1()-costo;  
            pg.getJugador().getCm().getRecurso2();
            total1 = pg.getJugador().getCm().getRecurso2()-costo;
            pg.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            pg.getJugador().getEd1().add(nint4);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(){
        return cantidad;
    }
    
    @Override
    public int getLife(){
        return health;
    }
    
    @Override
    public void setLife(int newLife){
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
