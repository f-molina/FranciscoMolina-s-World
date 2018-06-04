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
public class ExtractorPocion implements Edificaciones {

    @Override
    public int lifeCentro(int health){
        health = 500;
        return health;
    }
    
    @Override
    public int lifeVikingos(int health){
        health = 150;
        return health;
    }
    
    @Override
    public int lifeMongoles(int health){
        health = 200;
        return health;
    }
    
    @Override
    public int lifeRomanos(int health){
        health = 200;
        return health;
    }
    
}
