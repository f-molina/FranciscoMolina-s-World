/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import AbstractFactory.AbstractFactory;
import Vehiculos.Vehiculos;

/**
 *
 * @author fmolina
 */
public class RazasFactory implements AbstractFactory {
    
    @Override
    public Razas getRazas(String type){
        
        switch(type){
            case "Vikingos":
                return new Vikingos();
            case "Mongoles":
                return new Mongoles();
            case "Romanos":
                return new Romanos();    
        }
        return null;
    }
    
    @Override
    public Vehiculos getVehiculos(String type){
        return null;
    }
    
}
