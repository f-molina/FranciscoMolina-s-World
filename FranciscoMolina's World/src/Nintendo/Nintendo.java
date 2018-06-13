/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;
import Juego.Jugador;
/**
 *
 * @author fmolina
 */
public interface Nintendo {

    void construir(Jugador jugador);
    int recoger();
    int getAttack();
    boolean entrenar(Jugador jugador);
    boolean estado();
    
}
