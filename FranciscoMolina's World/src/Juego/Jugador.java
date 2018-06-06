/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Nintendo.Nintendo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Jugador {
    
    public String nombre1, nombre2;
    public int madera;
    public int metal;
    public int pocion;
    public int turn = 0;
    
    public ArrayList<String> jugador = new ArrayList();

    public Jugador() {
    }
    public Jugador(String nombre1, String nombre2, int madera, int metal, int pocion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.madera = madera;
        this.metal = metal;
        this.pocion = pocion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getPocion() {
        return pocion;
    }

    public void setPocion(int pocion) {
        this.pocion = pocion;
    }

    public ArrayList<String> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<String> jugador) {
        this.jugador = jugador;
    }
    
    public void addJugador(){
        Jugador j = new Jugador();
        Menu m = new Menu();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        j.setNombre1(player1);
        jugador.add(player1);
        System.out.println("Jugador1: "+j.getNombre1());
        m.MenuRaza();
    }
    
    public void addJugador2(){
        Menu m = new Menu();
        Jugador j = new Jugador();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String player2 = leer.nextLine();
        j.setNombre1(player2);
        jugador.add(player2);
        System.out.println("Jugador1: "+j.getNombre2());
        m.MenuRaza();
    }
    
    public int getTurn(){
        return turn;
        
    }
    
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
