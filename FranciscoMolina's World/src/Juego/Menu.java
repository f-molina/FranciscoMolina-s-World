/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Nintendo.Nintendo;
import Playstation.Playstation;
import Xbox.Xbox;
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Menu {
    
    AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
    AbstractFactory plays = FactoryProducer.getFactory("Playstation");

    public void MenuNintendo() {
        AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
        Nintendo n = nintendo.getNintendo("Acero");
        Nintendo n1 = nintendo.getNintendo("Cristal");
        Nintendo n2 = nintendo.getNintendo("Mushrooms");
        int health=0;      
        int cant = 0;
        System.out.println("----------------------RECURSOS---------------------");
        n.construir();
        n1.construir();
        n2.construir();
        
        int opc=0;
        do{
            System.out.println("\n********FRANCISCO-MOLINA'S WORLD********");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Construir");
            System.out.println("4. Terminar turno");
            
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    int total=0;
                    int danio=0;
        //Razas r = raza.getRazas("Vikingos");
        //Razas r1 = raza.getRazas("Mongoles");
        /*System.out.println("danio: "+r.attack(danio));
        System.out.println("defensa: "+r1.life(health));
        total = r.attack(danio)-r1.life(health);
        System.out.println("Ataque realizado: "+total);
                    System.out.println(r1.life(total));*/
        break;       
            }

        }while(opc!=4); 
    }  
    
    public void MenuPlay() {
        AbstractFactory play = FactoryProducer.getFactory("Playstation");
        Playstation p = play.getPlayStation("Titanio");
        Playstation p1 = play.getPlayStation("Ecos");
        Playstation p2 = play.getPlayStation("Carbon");

        int health=0;      
        int cant = 0;
        System.out.println("----------------------RECURSOS---------------------");
        p.construir();
        p1.construir();
        p2.construir();
        
        int opc=0;
        do{
            System.out.println("\n********FRANCISCO-MOLINA'S WORLD********");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Construir");
            System.out.println("4. Terminar turno");
            
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    int total=0;
                    int danio=0;
                    Playstation plays = play.getPlayStation("Kratos");
                    Nintendo nint = nintendo.getNintendo("Bayonetta");
                    /*System.out.println("antes: "+plays.getLife());
                    plays.setLife(850);
                    System.out.println("despues: "+plays.getLife());*/
                    System.out.println("antes: "+nint.getLife());
                    total = nint.getLife()-plays.getAttack();
                    System.out.println("danio: "+total);
                    nint.setLife(total);
                    System.out.println("despues: "+nint.getLife());
        break;       
            }

        }while(opc!=4); 
    }  
    
    public void MenuXbox(){
        AbstractFactory xbox = FactoryProducer.getFactory("Xbox");
        Xbox x = xbox.getXbox("Adamantium");
        Xbox x1 = xbox.getXbox("Energia");
        Xbox x2 = xbox.getXbox("Polvora");

        int health=0;      
        int cant = 0;
        System.out.println("----------------------RECURSOS---------------------");
        x.construir();
        x1.construir();
        x2.construir();
        
        int opc=0;
        do{
            System.out.println("\n********FRANCISCO-MOLINA'S WORLD********");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Construir");
            System.out.println("4. Terminar turno");
            
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    int total=0;
                    int danio=0;
                break;
            }

        }while(opc!=4); 
    }  
}
