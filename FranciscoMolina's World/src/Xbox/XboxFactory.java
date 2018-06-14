/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xbox;
import AbstractFactory.AbstractFactory;
import EdificacionesXbox.AdamantiumStorage;
import EdificacionesXbox.Campo;
import EdificacionesXbox.EnergiaGenerator;
import EdificacionesXbox.Fabrica;
import EdificacionesXbox.MotherShip;
import EdificacionesXbox.PolvoraStorage;
import Nintendo.Nintendo;
import Playstation.Playstation;
import XboxArmy.Locust;
import XboxArmy.MasterChief;

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
            case "Master":
                return new MasterChief();
            case "Adamantium":
                return new AdamantiumStorage();
            case "Polvora":
                return new PolvoraStorage();
            case "Energia":
                return new EnergiaGenerator();
            case "Campo":
                return new Campo();
            case "Fabrica":
                return new Fabrica();
            case "Mothership":
                return new MotherShip();
        }
        return null;
    }
    
}
