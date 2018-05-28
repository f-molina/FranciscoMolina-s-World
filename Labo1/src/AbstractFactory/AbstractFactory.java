/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import Operaciones.Aritmetica;
import Conversion.Conversion;
/**
 *
 * @author fmolina
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Conversion getConversion(String type);
}
