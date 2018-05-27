/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author fmolina
 */
public class OperacionesFactory {
    
    public static Aritmetica getAritmetica(OpcionAritmetica opc){
        switch(opc){
            case Multiplicacion:
                return new Multiplicacion();
            case Division:
                return new Division();
            case Resta:
                return new Resta();
            case Suma:
                return new Suma();    
        }
        return null;
    }

}
