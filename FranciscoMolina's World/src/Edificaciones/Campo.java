/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author fmolina
 */
//Edificacion para caballos
public class Campo implements Edificaciones {
    
    public int health = 100;
    
    @Override
    public int life(int health){
        return health;
    }
    
}
