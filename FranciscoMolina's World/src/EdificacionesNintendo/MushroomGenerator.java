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
public class MushroomGenerator implements Nintendo{
    
    int damage, cantidad;
    public int health = 500;
    public int costo = 1500;
    public Jugador jugador;
    int recurso;

    public MushroomGenerator() {
    }

    public MushroomGenerator(Jugador jugador) {
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

    public int getRecurso() {
        return recurso;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }
    
    
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        MushroomGenerator mg = new MushroomGenerator(jugador);
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo nint3 = nintendo.getNintendo("MushroomGenerator");
        if(mg.getJugador().getCm().getRecurso1() >= costo 
           && mg.getJugador().getCm().getRecurso3() >= costo){
            total = mg.getJugador().getCm().getRecurso1()-costo;  
            mg.getJugador().getCm().setRecurso1(total);
            total1 = mg.getJugador().getCm().getRecurso3()-costo;
            mg.getJugador().getCm().setRecurso3(total1);
            System.out.println("Construccion realizada");
            mg.getJugador().getEd1().add(nint3);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
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
        MushroomGenerator m = new MushroomGenerator(jugador);
        m.getJugador().getCm().setRecurso3(m.getJugador().getCm().getRecurso3()+1500);
    }
    
}
