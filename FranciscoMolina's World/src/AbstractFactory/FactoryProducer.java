/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Edificaciones.EdificacionesFactory;
import Razas.RazasFactory;
import Vehiculos.VehiculosFactory;

/**
 *
 * @author fmolina
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Razas":
                return new RazasFactory();
            case "Vehiculos":
                return new VehiculosFactory(); 
            /*case "Recursos":
                return new RecursosFactory();*/
            case "Edificaciones":
                return new EdificacionesFactory();
        }
        return null;
    }
    
}
