/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;
import AbstractFactory.AbstractFactory;
import Conversion.Conversion;
/**
 *
 * @author fmolina
 */
public class OperacionesFactory implements AbstractFactory {
    
    @Override
    public Aritmetica getAritmetica(String type){
        switch(type){
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
            case "Resta":
                return new Resta();
            case "Suma":
                return new Suma();    
        }
        return null;
    }
    
    @Override
    public Conversion getConversion(String type){
        return null;
    }
}