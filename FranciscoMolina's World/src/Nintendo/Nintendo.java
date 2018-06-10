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
    
    //int getCantidad();
    //void setCantidad(int cantidad);
    void construir(Jugador jugador);
    int recoger();
    int getLife();
    void setLife(int health);
    int getAttack();
    
    
}
