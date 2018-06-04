/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author fmolina
 */
public class Mongoles implements Razas {
    
    @Override
    public int attack(int damage){
        damage = 75;
        return damage;
    }
    
    @Override
    public int defend(int damage){
        damage = 75;
        return damage;
    }
}
