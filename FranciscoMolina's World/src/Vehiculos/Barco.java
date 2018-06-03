/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author fmolina
 */
public class Barco implements Vehiculos {
    
    public int damage = 100;
    
    @Override
    public int attack(int damage){
        return damage;
    }
    
    @Override
    public int defend(int damage){
        return damage;
    }
    
}
