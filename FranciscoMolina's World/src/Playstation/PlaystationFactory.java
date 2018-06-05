/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playstation;

import AbstractFactory.AbstractFactory;
import Nintendo.Nintendo;
import PlaystationArmy.Hunters;
import PlaystationArmy.Kratos;
import PlaystationResources.Carbon;
import PlaystationResources.Ecos;
import PlaystationResources.Titanio;
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
            case "Old Hunters":
                return new Hunters();
            case "Kratos":
                return new Kratos();
            case "Titanio":
                return new Titanio();   
            case "Ecos Sangre":
                return new Ecos();
            case "Carbon":
                return new Carbon();     
        }
        return null;
    }
    
    @Override
    public Xbox getXbox(String type){
        return null;
    }
    
}
