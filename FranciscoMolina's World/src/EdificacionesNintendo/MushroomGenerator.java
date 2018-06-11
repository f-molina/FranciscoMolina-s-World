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
public class MushroomGenerator implements Nintendo{
    
    int damage, cantidad;
    public int health = 500;
    public int costo = 150;
    public Jugador jugador;

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
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        MushroomGenerator mg = new MushroomGenerator(jugador);
        if(mg.getJugador().getRes1().getAcero().getCantidad() >= costo 
           && mg.getJugador().getRes3().getMush().getCantidad() >= costo){
            total = mg.getJugador().getRes1().getAcero().getCantidad()-costo;  
            mg.getJugador().getRes1().getAcero().setCantidad(total);
            total1 = mg.getJugador().getRes3().getMush().getCantidad()-costo;
            mg.getJugador().getRes3().getMush().setCantidad(total1);
            System.out.println("Construccion realizada");
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
