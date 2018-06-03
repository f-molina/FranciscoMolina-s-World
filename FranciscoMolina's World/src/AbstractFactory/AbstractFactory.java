/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Edificaciones.Edificaciones;
import Razas.Razas;
import Recursos.Recursos;
import Vehiculos.Vehiculos;

/**
 *
 * @author fmolina
 */
public interface AbstractFactory {
    
    Razas getRazas(String type);
    Vehiculos getVehiculos(String type);
    Recursos getRecursos(String type);
    Edificaciones getEdificaciones(String type);
    
}
