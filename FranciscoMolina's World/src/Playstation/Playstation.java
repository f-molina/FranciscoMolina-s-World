/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playstation;

/**
 *
 * @author fmolina
 */
public interface Playstation {
    
    int getCantidad();
    void setCantidad(int newCantidad);
    void construir();
    void recoger();
    int getLife();
    void setLife(int newLife);
    int getAttack();
    
}
