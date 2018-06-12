/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaystationResources;

import Juego.Jugador;
import Playstation.Playstation;

/**
 *
 * @author fmolina
 */
public class Carbon implements Playstation{
    
    int health, damage;
    int cantidad = 150;
    
    @Override
    public void construir(Jugador jugador){
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
        boolean estado = false;
        return estado;
    }
    
}
