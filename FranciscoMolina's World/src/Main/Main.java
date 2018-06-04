/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Edificaciones.Edificaciones;
import Juego.Jugador;
import Juego.Menu;


/**
 *
 * @author fmolina
 */
public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador();
        j.addJugador();
        Menu m = new Menu();
        m.Menu1();
    }
    
    
    
}
