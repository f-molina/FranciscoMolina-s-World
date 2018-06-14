/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playstation;

import AbstractFactory.AbstractFactory;
import EdificacionesPlaystation.Aircraft;
import EdificacionesPlaystation.Bonfire;
import EdificacionesPlaystation.CarbonStorage;
import EdificacionesPlaystation.EcosProducer;
import EdificacionesPlaystation.Puerto;
import EdificacionesPlaystation.TitanioStorage;
import Nintendo.Nintendo;
import PlaystationArmy.Hunters;
import PlaystationArmy.Kratos;
import PlaystationVehicles.Submarino;
import PlaystationVehicles.Xwing;
import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class PlaystationFactory implements AbstractFactory{
    
    @Override
    public Nintendo getNintendo(String type){
        return null;
    }
    
    @Override
    public Playstation getPlayStation(String type){
        
        switch(type){
            case "Hunter":
                return new Hunters();
            case "Kratos":
                return new Kratos();  
            case "TitanioStorage":
                return new TitanioStorage();
            case "CarbonStorage":
                return new CarbonStorage();
            case "EcosProducer":
                return new EcosProducer();
            case "Bonfire":
                return new Bonfire();
            case "Aircraft":
                return new Aircraft();
            case "Puerto":
                return new Puerto();
            case "Submarino":
                return new Submarino();
            case "Xwing":
                return new Xwing();
        }
        return null;
    }
    
    @Override
    public Xbox getXbox(String type){
        return null;
    }
    
}
