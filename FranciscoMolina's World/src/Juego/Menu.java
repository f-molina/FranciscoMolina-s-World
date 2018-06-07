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
    //abstracts
    AbstractFactory nintendo = FactoryProducer.getFactory("Nintendo");
    AbstractFactory play = FactoryProducer.getFactory("Playstation");
    AbstractFactory xbox = FactoryProducer.getFactory("Xbox");
    
    //recursos play
    Playstation p = play.getPlayStation("Titanio");
    Playstation p1 = play.getPlayStation("Ecos");
    Playstation p2 = play.getPlayStation("Carbon");
    
    //recursos nintendo    
    Nintendo n = nintendo.getNintendo("Acero");
    Nintendo n1 = nintendo.getNintendo("Cristal");
    Nintendo n2 = nintendo.getNintendo("Mushrooms");
    
    //recursos xbox
    Xbox x = xbox.getXbox("Adamantium");
    Xbox x1 = xbox.getXbox("Energia");
    Xbox x2 = xbox.getXbox("Polvora");
    
    //edificaciones nintendo
    Nintendo nint = nintendo.getNintendo("AceroStorage");
    Nintendo nint1 = nintendo.getNintendo("CristalStorage");
    Nintendo nint2 = nintendo.getNintendo("MushroomGenerator");
    
    public void MenuRaza(){
        Menu menu = new Menu();
        Scanner leer = new Scanner(System.in);
        int opc;
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
        int cantidad=0;
        do{
            System.out.println("----------------------RECURSOS---------------------");
            System.out.println("Acero: "+nint.getCantidad());
            System.out.println("Cristal: "+nint.getCantidad());
            System.out.println("Mushrooms: "+nint2.getCantidad());
            System.out.println("\n********FRANCISCO-MOLINA'S WORLD********");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Construir Acero Storage");
            System.out.println("4. Construir Cristal Storage");
            System.out.println("5. Construir Mushroom Generator");
            System.out.println("6. Construir Luigis Mansion");
            System.out.println("7. Construir Pokemon Gym");
            System.out.println("8. Construir StarFox Base");
            System.out.println("9. Construir Arwing");
            System.out.println("10. Construir Tanque");
            System.out.println("11. Entrenar Koopa Troopas");
            System.out.println("12. Entrenar Bayonetta");
            System.out.println("13. Recoger Acero");
            System.out.println("14. Recoger Cristal");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            
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
                break;
                case 3:
                    nint.construir(cantidad);
                break;    
                case 4:
                    nint1.construir(cantidad);
                break;
                case 5:
                    nint2.construir(cantidad);
                break;
            }

        }while(opc!=16); 
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
            System.out.println("3. Construir Titanio Storage");
            System.out.println("4. Construir Carbon Storage");
            System.out.println("5. Construir Ecos Producer");
            System.out.println("6. Construir Bonfire");
            System.out.println("7. Construir Aircraft");
            System.out.println("8. Construir Puerto");
            System.out.println("9. Construir Submarino");
            System.out.println("10. Construir Xwing");
            System.out.println("11. Entrenar Hunters");
            System.out.println("12. Entrenar Kratos");
            System.out.println("13. Recoger Titanio");
            System.out.println("14. Recoger carbon");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            
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
                    total = nint.getLife()-plays.getAttack();
                    System.out.println("ataque successful");
                    nint.setLife(total);
                    System.out.println("Nueva vida AceroStorage: "+nint.getLife());
                    break;
                    case 2:
                        System.out.println(":vidaL: "+nint.getLife());
                break;
                case 4:
                    Menu m = new Menu();
                    m.MenuNintendo();
                    break;
            }

        }while(opc!=16); 
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
            System.out.println("3. Construir Adamantium Storage");
            System.out.println("4. Construir Polvora Storage");
            System.out.println("5. Construir Energia Generator");
            System.out.println("6. Construir Campo");
            System.out.println("7. Construir Fabrica");
            System.out.println("8. Construir Mothership");
            System.out.println("9. Construir Armoured Train");
            System.out.println("10. Construir AT-AT Walker");
            System.out.println("11. Entrenar Locust");
            System.out.println("12. Entrenar Master Chief");
            System.out.println("13. Recoger Adamantium");
            System.out.println("14. Recoger Polvora");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            
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

        }while(opc!=16); 
    }  
}
