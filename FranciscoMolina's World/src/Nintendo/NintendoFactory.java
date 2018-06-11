/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

import AbstractFactory.AbstractFactory;
import EdificacionesNintendo.AceroStorage;
import EdificacionesNintendo.CristalStorage;
import EdificacionesNintendo.MushroomGenerator;
import NintendoArmy.Bayonetta;
import NintendoArmy.KoopaTroopas;
import NintendoResources.Acero;
import NintendoResources.Cristal;
import NintendoResources.Mushrooms;
import Playstation.Playstation;
import Xbox.Xbox;

/**
 *
 * @author fmolina
 */
public class NintendoFactory implements AbstractFactory{
    @Override
    public Nintendo getNintendo(String type){
        switch(type){
            case "Koopa":
                return new KoopaTroopas();
            case "Bayonetta":
                return new Bayonetta();
            case "Mushrooms":
                return new Mushrooms();   
            case "Acero":
                return new Acero();
            case "Cristal":
                return new Cristal(); 
            case "AceroStorage":
                return new AceroStorage();
            case "CristalStorage":
                return new CristalStorage();
            case "MushroomGenerator":
                return new MushroomGenerator();
        }
        return null;
    }
    
    @Override
    public Playstation getPlayStation(String type){
        return null;
    }
    
    @Override
    public Xbox getXbox(String type){
        return null;
    }
}
