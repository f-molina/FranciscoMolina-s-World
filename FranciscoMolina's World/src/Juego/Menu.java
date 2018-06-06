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
    
    public Jugador jugador;
    
    public Menu(){
    }

    public Menu(Jugador jugador) {
        this.jugador = jugador;
    }
    
    AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
    AbstractFactory play = FactoryProducer.getFactory("Playstation");
    AbstractFactory xbox = FactoryProducer.getFactory("Xbox");
    
    Playstation p = play.getPlayStation("Titanio");
    Playstation p1 = play.getPlayStation("Ecos");
    Playstation p2 = play.getPlayStation("Carbon");
    Nintendo nint = nintendo.getNintendo("AceroStorage");
        
    Nintendo n = nintendo.getNintendo("Acero");
    Nintendo n1 = nintendo.getNintendo("Cristal");
    Nintendo n2 = nintendo.getNintendo("Mushrooms");
    
    Xbox x = xbox.getXbox("Adamantium");
    Xbox x1 = xbox.getXbox("Energia");
    Xbox x2 = xbox.getXbox("Polvora");
    
    public void MenuRaza(){
        Menu menu = new Menu();
        Scanner leer = new Scanner(System.in);
        int opc =0;
        System.out.println("Eliga su raza:\n");
        System.out.println("1. Nintendo Army");
        System.out.println("2. PlayStation Army");
        System.out.println("3. Xbox Army\n");
        System.out.println("Digite una opcion: ");
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Eligio nintendo");
                menu.MenuNintendo();
            break;
            
            case 2:
                System.out.println("Eligio play");
                menu.MenuPlay();
            break;
            
            case 3:
                System.out.println("Eligio xbox");
                menu.MenuXbox();
            break;
            
            default:
                System.out.println("eligio nintendo");
                menu.MenuNintendo();
        }
    }

    public void MenuNintendo() {
        
        int opc=0;
        do{
            System.out.println("----------------------RECURSOS---------------------");
            n.getCantidad();
            n1.getCantidad();
            n2.getCantidad();
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
                break; 
                case 2:
                    System.out.println("vda: "+nint.getLife());
                break;
                case 3:
                    System.out.println("Se creo AceroStorage con vida: "+nint.getLife());
                break;    
            }

        }while(opc!=4); 
    }  
    
    public void MenuPlay() {

        System.out.println("----------------------RECURSOS---------------------");
        p.getCantidad();
        p1.getCantidad();
        p2.getCantidad();
        
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
                    Playstation plays = play.getPlayStation("Kratos");
                    int total;
                    System.out.println("Vida AceroStorage: "+nint.getLife());
                    //total = nint.getLife()-plays.getAttack();
                    System.out.println("ataque successful");
                    //nint.setLife(total);
                    System.out.println("Nueva vida AceroStorage: "+nint.getLife());
                    break;
                    case 2:
                        System.out.println(":vidaL: "+nint.getLife());
                break;
                case 4:
                    Menu m = new Menu();
                    m.MenuNintendo();
                    break;
                /*case 1:
                    int total=0;
                    int danio=0;
                    Playstation plays = play.getPlayStation("Kratos");
                    Nintendo nint = nintendo.getNintendo("Bayonetta");
                    System.out.println("antes: "+nint.getLife());
                    total = nint.getLife()-plays.getAttack();
                    System.out.println("danio: "+total);
                    nint.setLife(total);
                    System.out.println("despues: "+nint.getLife());
        break;    */   
            }

        }while(opc!=5); 
    }  
    
    public void MenuXbox(){

        System.out.println("----------------------RECURSOS---------------------");
        x.getCantidad();
        x1.getCantidad();
        x2.getCantidad();
        
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
                break;
            }

        }while(opc!=4); 
    }  
}
