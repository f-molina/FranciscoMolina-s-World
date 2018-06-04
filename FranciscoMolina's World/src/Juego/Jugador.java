/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Recursos.Recursos;
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
    AbstractFactory raza = FactoryProducer.getFactory("Razas");
    AbstractFactory vehiculo = FactoryProducer.getFactory("Vehiculos");
    AbstractFactory edificacion = FactoryProducer.getFactory("Edificaciones");
    AbstractFactory recurso = FactoryProducer.getFactory("Recursos");

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
        Scanner leer = new Scanner(System.in);
        Recursos Madera = recurso.getRecursos("Madera");
        Recursos Metal = recurso.getRecursos("Metal");
        Recursos Pocion = recurso.getRecursos("Pocion");
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        System.out.println("Elige tu raza: ");
        String r = leer.nextLine();
        if(r.equalsIgnoreCase("Vikingos")){
            raza.getRazas("Vikingos");
            System.out.println("success");
        }else{
            System.out.println("no lo he hecho todavia lol");
        }
        jugador.add(player1);
        /*System.out.println("Jugador 2,, digite su nombre: ");
        String player2 = leer.nextLine();
        System.out.println("Elige tu raza: ");
        String r1 = leer.nextLine();
        if(r1.equals("Vikingos")){
            raza.getRazas("Vikingos");
            System.out.println("success");
        }else{
            System.out.println("no lo he hecho todavia lol");
        }
        jugador.add(player2);
        System.out.println("Jugador1: "+player1 + " " + "Jugador2: "+player2);*/
        System.out.println("Jugador1: "+player1);
    }
    
    public int getTurn(){
        return turn;
        
    }
    
    /*public void finTurno(){
        
        for(Jugador j : jugador )
            j.getTurn();  
    }*/
    
    public void addMadera(int cantidad){
        madera += cantidad;
    }
    
    public void addMetal(int cantidad){
        metal += cantidad;
    }
    
    public void addPocion(int cantidad){
        pocion += cantidad;
    }   
}
