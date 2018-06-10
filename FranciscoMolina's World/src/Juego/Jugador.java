/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;
import CentroMando.CentroMando;
import NintendoResources.Acero;
import NintendoResources.Cristal;
import NintendoResources.Mushrooms;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Jugador {
    
    public String nombre;
    public CentroMando cm;
    public  ArrayList<Acero> r1;
    public  ArrayList<Cristal> r2;
    public  ArrayList<Mushrooms> r3;
    
    public Acero a;
    public Cristal c;
    public Mushrooms m;

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

    public Acero getA() {
        return a;
    }

    public void setA(Acero a) {
        this.a = a;
    }

    public Cristal getC() {
        return c;
    }

    public void setC(Cristal c) {
        this.c = c;
    }

    public Mushrooms getM() {
        return m;
    }

    public void setM(Mushrooms m) {
        this.m = m;
    }

    public Jugador(String nombre, CentroMando cm, Acero a, Cristal c, Mushrooms m) {
        this.nombre = nombre;
        this.cm = cm;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Jugador() {
    }

    /*public Jugador(String nombre, CentroMando cm, ArrayList<Acero> r1, ArrayList<Cristal> r2, ArrayList<Mushrooms> r3) {
        this.nombre = nombre;
        this.cm = cm;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
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

    public ArrayList<Acero> getR1() {
        return r1;
    }

    public void setR1(ArrayList<Acero> r1) {
        this.r1 = r1;
    }

    public ArrayList<Cristal> getR2() {
        return r2;
    }

    public void setR2(ArrayList<Cristal> r2) {
        this.r2 = r2;
    }

    public ArrayList<Mushrooms> getR3() {
        return r3;
    }

    public void setR3(ArrayList<Mushrooms> r3) {
        this.r3 = r3;
    }   */
    
    public void addJugador(){
        CentroMando m1 = new CentroMando();
        Acero a = new Acero();
        Cristal c = new Cristal();
        Mushrooms m = new Mushrooms();
        /*ArrayList<Acero> r1 =new ArrayList<Acero>();
        ArrayList<Cristal> r2 =new ArrayList<Cristal>();
        ArrayList<Mushrooms> r3 =new ArrayList<Mushrooms>();*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        Jugador j1 = new Jugador(player1, m1, a, c, m);
        System.out.println("Jugador 1: "+j1.getNombre()+"\nVida centro mando: "+j1.cm.getHealth());
        Menu me = new Menu(j1);
        me.MenuRaza();
    }
    
    public void addJugador2(){
        CentroMando m2 = new CentroMando();
        int cantidad=0;
        Acero a = new Acero();
        Cristal c = new Cristal();
        Mushrooms mu = new Mushrooms();
        ArrayList<Acero> r1 =new ArrayList<Acero>();
        ArrayList<Cristal> r2 =new ArrayList<Cristal>();
        ArrayList<Mushrooms> r3 =new ArrayList<Mushrooms>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String player2 = leer.nextLine();
        Jugador j2 = new Jugador(player2, m2, a, c, mu);
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
