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
public class CentroMando implements Edificaciones{
    
    public int health = 500;
    
    @Override
    public int life(int health){
        return health;
    }
    
}
