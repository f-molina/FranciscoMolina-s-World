/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;
import CentroMando.CentroMando;
/*import java.util.ArrayList;
import java.util.Iterator;*/
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Jugador {
    
    public String nombre;
    public CentroMando cm;
    public Resource res1, res2, res3;

    public Jugador(String nombre, CentroMando cm, Resource res1, Resource res2, Resource res3) {
        this.nombre = nombre;
        this.cm = cm;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
    }

    public Resource getRes1() {
        return res1;
    }

    public void setRes1(Resource res1) {
        this.res1 = res1;
    }

    public Resource getRes2() {
        return res2;
    }

    public void setRes2(Resource res2) {
        this.res2 = res2;
    }

    public Resource getRes3() {
        return res3;
    }

    public void setRes3(Resource res3) {
        this.res3 = res3;
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
    
    public Jugador() {
    }
    
    public void addJugador(){
        CentroMando m1 = new CentroMando();
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Resource r3 = new Resource();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        Jugador j1 = new Jugador(player1, m1, r1, r2, r3);
        /*ArrayList<Jugador> jug1 = new ArrayList<Jugador>();
        jug1.add(j1);
        Iterator<Jugador> it = jug1.iterator();
        while(it.hasNext()){
            Jugador elemento = it.next();
            System.out.println("hola:"+elemento);
        }*/
        System.out.println("Jugador 1: "+j1.getNombre()+"\nVida centro mando: "+j1.getCm().getHealth());
        Menu me = new Menu(j1);
        me.MenuRaza(j1); 
    }
    
    public void addJugador2(){
        CentroMando m2 = new CentroMando();
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Resource r3 = new Resource();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String player2 = leer.nextLine();
        Jugador j2 = new Jugador(player2, m2, r1, r2, r3);
        System.out.println("Jugador 2: "+j2.getNombre()+" Vida centro mando: "+j2.cm.getHealth());
        Menu m = new Menu(j2);
        m.MenuRaza(j2);

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
