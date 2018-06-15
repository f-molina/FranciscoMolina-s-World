/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Juego.Jugador;
import java.util.Scanner;
/**
 *
 * @author fmolina
 */
public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador();
        System.out.println("\n********FRANCISCO MOLINA'S WORLD********\n");
        System.out.println("INSTRUCCIONES\n");
        System.out.println("Eliga sabiamente su raza, cada una tiene sus fortalezas y debilidades");
        System.out.println("Nintendo Army: Poseen las edificaciones mas fuertes, pero su milicia es debil");
        System.out.println("PlayStation Army: Poseen la milicia mas fuerte de todas, pero el costo de edificaciones y milicia es muy alto");
        System.out.println("Xbox Army: Poseen los mejores vehiculos para atacar, pero sus edificaciones son debiles\n");
        System.out.println("ATENCION!!!: Por reglas del juego, el primer jugador debe agregar al segundo desde el menu en su primer turno\nasi como el jugador 2 debe pasar su primer turno para poder dar inicio a la batalla.");
        System.out.println("Si hace caso omiso a las indicaciones, se le infectara la maquina con Ransomware.");
        System.out.println("\nAcepta las indicaciones y llamadas de atencion?(S/N)");
        Scanner leer = new Scanner(System.in);
        String t = leer.next();
        if(t.equalsIgnoreCase("s")){
            try {  
            Thread.sleep(1000);                
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        } 
        j.addJugador();
        j.addJugador2();
        }else{
            System.exit(0);
        }
        
    }
}
