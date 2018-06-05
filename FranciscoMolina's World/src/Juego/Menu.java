/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Edificaciones.Edificaciones;
import Razas.Razas;
import Recursos.Recursos;
import java.util.Scanner;

/**
 *
 * @author fmolina
 */
public class Menu {

    public void Menu1() {
        AbstractFactory raza = FactoryProducer.getFactory("Razas");
        AbstractFactory vehiculo = FactoryProducer.getFactory("Vehiculos");
        AbstractFactory edificacion = FactoryProducer.getFactory("Edificaciones");
        AbstractFactory recurso = FactoryProducer.getFactory("Recursos");
        
        Edificaciones ed = edificacion.getEdificaciones("Extractor Pocion");
        int health=0;      
        Recursos Madera = recurso.getRecursos("Madera");
        Recursos Metal = recurso.getRecursos("Metal");
        Recursos Pocion = recurso.getRecursos("Pocion");
        int cant = 0;
        System.out.println("----------------------RECURSOS---------------------");
        System.out.println("madera: "+Madera.contador(cant)+" "+"metal: "+Metal.contador(cant)
        +" "+"pocion: "+Pocion.contador(cant));
        
        
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
        Razas r = raza.getRazas("Vikingos");
        Razas r1 = raza.getRazas("Mongoles");
        System.out.println("danio: "+r.attack(danio));
        System.out.println("defensa: "+r1.life(health));
        total = r.attack(danio)-r1.life(health);
        System.out.println("Ataque realizado: "+total);
                    System.out.println(r1.life(total));
        
        
        break;
                    
                    
            }

        }while(opc!=4);
        
    }

    
}
