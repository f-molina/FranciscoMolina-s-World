/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xbox;
import AbstractFactory.AbstractFactory;
import Nintendo.Nintendo;
import Playstation.Playstation;
import XboxArmy.Locust;
import XboxArmy.MasterChief;
import XboxResources.Adamantium;
import XboxResources.Energia;
import XboxResources.Polvora;

/**
 *
 * @author fmolina
 */
public class XboxFactory implements AbstractFactory{
    
    @Override
    public Nintendo getNintendo(String type){
        return null;
    }
    
    @Override
    public Playstation getPlayStation(String type){
        return null;
    }
    
    @Override
    public Xbox getXbox(String type){
        
        switch(type){
            case "Locust":
                return new Locust();
            case "Master Chief":
                return new MasterChief();
            case "Adamantium":
                return new Adamantium();   
            case "Energia":
                return new Energia();
            case "Polvora":
                return new Polvora();     
        }
        return null;
    }
    
}
