/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;
import AbstractFactory.AbstractFactory;
import Operaciones.Aritmetica;

/**
 *
 * @author fmolina
 */
public class FactoryConversion implements AbstractFactory{
    
    @Override
    public Aritmetica getAritmetica(String type){
        return null;
    }
    
    @Override
    public Conversion getConversion(String type){
        switch(type){
            case "Binario":
                return new Binario();
        }
        return null;
    }
    
}
