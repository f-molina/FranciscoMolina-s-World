/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoVehicles;

import Juego.Jugador;
import Nintendo.Nintendo;

/**
 *
 * @author fmolina
 */
//nave star fox 
public class Arwing implements Nintendo{
    
    int health;
    int damage;
    int cantidad;

    @Override
    public void construir(Jugador jugador){
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
        health = newLife;
    }
    
    @Override
    public int getAttack(){
        return damage;
    }
    
}
