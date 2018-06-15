/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playstation;
import Juego.Jugador;

/**
 *
 * @author fmolina
 */
public interface Playstation {

    void construir(Jugador jugador);
    int recoger(Jugador jugador);
    int getAttack();
    boolean entrenar(Jugador jugador);
    void generar(Jugador jugador);
    
}
