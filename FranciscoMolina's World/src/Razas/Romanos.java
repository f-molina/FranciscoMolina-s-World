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
public class Romanos implements Razas {
    
    public int health = 75;
    public int damage = 50;
    
    @Override
    public int attack(int damage){
        return damage;
    }
    
    @Override
    public int defend(int damage){
        return damage;
    }
    
    @Override
    public int escuadron(int health){
        return health;
    }
    
}
