/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;
import CentroMando.CentroMando;
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Jugador {
    
    public String nombre;
    public CentroMando cm;

    public Jugador() {
    }
    public Jugador(String nombre, CentroMando cm) {
        this.nombre = nombre;
        this.cm = cm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroMando getCm() {
        return cm;
    }

    public void setCm(CentroMando cm) {
        this.cm = cm;
    }
    
    public void addJugador(){
        CentroMando m1 = new CentroMando();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        Jugador j1 = new Jugador(player1, m1);
        System.out.println("Jugador 1: "+j1.getNombre()+" Vida centro mando: "+j1.cm.getHealth());
        Menu m = new Menu(j1);
        m.MenuRaza();
    }
    
    public void addJugador2(){
        CentroMando m2 = new CentroMando();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String player2 = leer.nextLine();
        Jugador j2 = new Jugador(player2, m2);
        System.out.println("Jugador 2: "+j2.getNombre()+" Vida centro mando: "+j2.cm.getHealth());
        Menu m = new Menu(j2);
        m.MenuRaza();

    }
    
    /*public int getTurn(){
        return turn;
        
    }*/
    
    /*public void addMadera(int cantidad){
        madera += cantidad;
    }
    
    public void addMetal(int cantidad){
        metal += cantidad;
    }
    
    public void addPocion(int cantidad){
        pocion += cantidad;
    }   */
}
