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

    public Menu() {
    }
    
    public Menu(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
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
    Nintendo nint3 = nintendo.getNintendo("LuigisMansion");
    Nintendo nint4 = nintendo.getNintendo("PokemonGym");
    Nintendo nint5 = nintendo.getNintendo("Starfox");
    Nintendo nint6 = nintendo.getNintendo("Arwing");
    Nintendo nint7 = nintendo.getNintendo("Tanque");
    Nintendo nint8 = nintendo.getNintendo("Koopa");
    Nintendo nint9 = nintendo.getNintendo("Bayonetta");
    
    public void MenuRaza(Jugador jugador){
        Menu menu = new Menu(jugador);
        
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("\nEliga su raza\n");
        System.out.println("1. Nintendo Army");
        System.out.println("2. PlayStation Army");
        System.out.println("3. Xbox Army\n");
        System.out.println("Digite una opcion: ");
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Eligio nintendo");
                menu.MenuNintendo(jugador);
            break;
            
            case 2:
                System.out.println("Eligio play");
                menu.MenuPlay(jugador);
            break;
            
            case 3:
                System.out.println("Eligio xbox");
                menu.MenuXbox(jugador);
            break;
            
            default:
                System.out.println("eligio nintendo");
                menu.MenuNintendo(jugador);
        }
    }

    public void MenuNintendo(Jugador jugador) {
        int opc=0;
        String answer;
        do{
            System.out.println("----------------------RECURSOS---------------------");
            System.out.println("Acero: "+getJugador().getCm().getRecurso1());
            System.out.println("Cristal: "+getJugador().getCm().getRecurso2());
            System.out.println("Mushrooms: "+getJugador().getCm().getRecurso3());
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
                    System.out.println("Que desea atacar?, 1.milicia o 2.Jefe?");
                    answer = leer.next();
                    if(answer.equals("1")){
                        
                    }else{
                        
                    }
                    nint8.getAttack();
                break; 
                case 2:
                break;
                case 3:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                    System.out.println("Cuesta 50 acero, 50 cristal. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                break;    
                case 4:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                    System.out.println("Cuesta 75 cristal, 75 mushroom. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint1.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                break;
                case 5:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                    System.out.println("Cuesta 150 cristal, 150 mushroom. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint2.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                break;
                case 6:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                    System.out.println("Cuesta 25 cristal, 25 mushroom. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint3.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                break;
                case 7:
                    System.out.println("Cuesta 100 cristal, 100 mushroom. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint4.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 8:
                    System.out.println("Cuesta 25 cristal, 25 mushroom. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint5.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 9:
                    System.out.println("isEmpty: "+getJugador().getV1().isEmpty());
                    System.out.println("size: "+getJugador().getV1().size());
                    System.out.println("Cuesta 150 acero, 150 cristal. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint6.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 10:
                    System.out.println("Cuesta 125 cristal, 125 acero. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint7.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 11:
                    System.out.println("Cuesta 100 cristal, 100 acero. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint8.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 12:
                    System.out.println("Cuesta 200 mushroom, 200 acero. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        nint9.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 13:
                    System.out.println("hola: "+nint.recoger());
                    break;
                case 15:
                    int c1 = getJugador().getCm().getCapacidad1();
                    int c2 = getJugador().getCm().getCapacidad2();
                    int c3 = getJugador().getCm().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm().getRecurso1() >= res && getJugador().getCm().getRecurso2() >= res && getJugador().getCm().getRecurso3() >= res){
                        getJugador().getCm().upgrade();
                        System.out.println("Recurso 1: "+getJugador().getCm().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm().getRecurso2());
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                    break;
            }

        }while(opc!=16); 
    }  
    
    public void MenuPlay(Jugador jugador) {
        int opc=0;
        do{
            System.out.println("----------------------RECURSOS---------------------");
            System.out.println("Titanio: "+getJugador().getCm().getRecurso1());
            System.out.println("Carbon: "+getJugador().getCm().getRecurso2());
            System.out.println("Ecos: "+getJugador().getCm().getRecurso3());
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
                break;
                    case 2:
                break;
                case 4:
                    break;
                case 15:
                    int c1 = getJugador().getCm().getCapacidad1();
                    int c2 = getJugador().getCm().getCapacidad2();
                    int c3 = getJugador().getCm().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm().getRecurso1() >= res && getJugador().getCm().getRecurso2() >= res && getJugador().getCm().getRecurso3() >= res){
                        getJugador().getCm().upgrade();
                        System.out.println("Recurso 1: "+getJugador().getCm().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm().getRecurso2());
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
                
                case 16:
                    Menu m = new Menu(jugador);
                    m.MenuNintendo(jugador);
                break;  
            }

        }while(opc!=17); 
    }  
    
    public void MenuXbox(Jugador jugador){
        int opc=0;
        do{
            System.out.println("----------------------RECURSOS---------------------");
            System.out.println("Adamantium: "+getJugador().getCm().getRecurso1());
            System.out.println("Polvora: "+getJugador().getCm().getRecurso2());
            System.out.println("Energia: "+getJugador().getCm().getRecurso3());
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
                case 15:
                    int c1 = getJugador().getCm().getCapacidad1();
                    int c2 = getJugador().getCm().getCapacidad2();
                    int c3 = getJugador().getCm().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm().getRecurso1() >= res && getJugador().getCm().getRecurso2() >= res && getJugador().getCm().getRecurso3() >= res){
                        getJugador().getCm().upgrade();
                        System.out.println("Recurso 1: "+getJugador().getCm().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm().getRecurso2());
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
            }

        }while(opc!=16); 
    }  
}
