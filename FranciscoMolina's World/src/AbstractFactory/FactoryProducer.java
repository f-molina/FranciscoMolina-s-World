/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import Nintendo.NintendoFactory;
import Playstation.PlaystationFactory;
import Xbox.XboxFactory;

/**
 *
 * @author fmolina
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Nintendo":
                return new NintendoFactory();
            case "Playstation":
                return new PlaystationFactory(); 
            case "Xbox":
                return new XboxFactory();
        }
        return null;
    }
    
}
