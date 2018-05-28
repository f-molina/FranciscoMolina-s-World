/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

/**
 *
 * @author fmolina
 */
public class Binario implements Conversion {
    
    @Override
    public String conversor(int n) {
        String b = "";
        if(n>0){
            while(n>0){
                if(n%2 == 0){
                    b="0"+b;
                }
                else{
                    b = "1"+b;
                }
                n= (int) n/2;
            }
        }
        else if(n==0){
            b="0";
        }
        else{
            b="Error";
        }
        return b;
    }
}
