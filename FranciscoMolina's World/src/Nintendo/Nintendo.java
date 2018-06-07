/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;
/**
 *
 * @author fmolina
 */
public interface Nintendo {
    
    int getCantidad();
    void setCantidad(int cantidad);
    int construir(int cantidad);
    void recoger();
    int getLife();
    void setLife(int health);
    int getAttack();
    
}
