/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author fmolina
 */
public class Pocion implements Recursos{
    
    public int cantidad = 150;
    
    @Override
    public int contador(int cantidad){
        return cantidad;
    }
    
}
