/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import Operaciones.OperacionesFactory;
import Conversion.FactoryConversion;
/**
 *
 * @author fmolina
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Aritmetica":
                return new OperacionesFactory();
            case "Conversion":
                return new FactoryConversion();
        }
        return null;
    }
    
}
