/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import AbstractFactory.AbstractFactory;
import Edificaciones.Edificaciones;
import Razas.Razas;
import Vehiculos.Vehiculos;

/**
 *
 * @author fmolina
 */
public class RecursosFactory implements AbstractFactory{
    
    @Override
    public Razas getRazas(String type){
        return null;
    }
    
    @Override
    public Vehiculos getVehiculos(String type){
        return null;
    }
    
    @Override
    public Recursos getRecursos(String type){
        
        switch(type){
            case "Madera":
                return new Madera();
            case "Metal":
                return new Metal();  
            case "Pocion":
                return new Pocion();      
        }
        return null;
    }
    
    @Override
    public Edificaciones getEdificaciones(String type){
        return null;
    }
    
}
