/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import AbstractFactory.AbstractFactory;
import Edificaciones.Edificaciones;
import Razas.Razas;
import Recursos.Recursos;

/**
 *
 * @author fmolina
 */
public class VehiculosFactory implements AbstractFactory{
    
    @Override
    public Razas getRazas(String type){
        return null;
    }
    
    @Override
    public Vehiculos getVehiculos(String type){
        
        switch(type){
            case "Caballo":
                return new Caballo();
            case "Barco":
                return new Barco();    
        }
        return null;
    }
    
    @Override
    public Recursos getRecursos(String type){
        return null;
    }
    
    @Override
    public Edificaciones getEdificaciones(String type){
        return null;
    }
    
}
