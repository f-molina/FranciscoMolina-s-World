/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

import AbstractFactory.AbstractFactory;
import EdificacionesNintendo.AceroStorage;
import EdificacionesNintendo.CristalStorage;
import EdificacionesNintendo.LuigisMansion;
import EdificacionesNintendo.MushroomGenerator;
import EdificacionesNintendo.PokemonGym;
import EdificacionesNintendo.StarFoxBase;
import NintendoArmy.Bayonetta;
import NintendoArmy.KoopaTroopas;
import NintendoVehicles.Arwing;
import NintendoVehicles.Tanque;
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
            case "AceroStorage":
                return new AceroStorage();
            case "CristalStorage":
                return new CristalStorage();
            case "MushroomGenerator":
                return new MushroomGenerator();
            case "LuigisMansion":
                return new LuigisMansion();
            case "PokemonGym":
                return new PokemonGym();
            case "Starfox":
                return new StarFoxBase();
            case "Arwing":
                return new Arwing();
            case "Tanque":
                return new Tanque();
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
