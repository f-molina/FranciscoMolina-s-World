/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xbox;

/**
 *
 * @author fmolina
 */
public interface Xbox {

    void construir();
    void recoger();
    int getLife();
    void setLife(int newLife);
    int getAttack();
    
}
