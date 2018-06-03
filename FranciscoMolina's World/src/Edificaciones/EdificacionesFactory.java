/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import AbstractFactory.AbstractFactory;
import Razas.Razas;
import Recursos.Recursos;
import Vehiculos.Vehiculos;

/**
 *
 * @author fmolina
 */
public class EdificacionesFactory implements AbstractFactory {
    
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
        return null;
    }
    
    @Override
    public Edificaciones getEdificaciones(String type){
        switch(type){
            case "Extractor Pocion":
                return new ExtractorPocion();
            case "Recolector Metal":
                return new RecolectorMetal();  
            case "Recolector Madera":
                return new RecolectorMadera();
        }
        return null;
    }
    
}
