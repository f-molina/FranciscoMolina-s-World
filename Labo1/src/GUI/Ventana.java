/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Operaciones.Aritmetica;
import Conversion.Conversion;
import javax.swing.JLabel;

/**
 *
 * @author fmolina
 */
public class Ventana extends JPanel {
    
    public int WIDTH = 600, widthTF = 120, widthB = 120;
    public int HEIGHT = 500, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3, textF4, textF5;
    public JButton multi, divi, rest, sum, binario;
    public JLabel n1, n2, n3, resultado, resultado1, t1, t2;
    
    AbstractFactory factory = FactoryProducer.getFactory("Aritmetica");
    AbstractFactory factory1 = FactoryProducer.getFactory("Conversion");

    public Ventana(){
        t1 = new JLabel();
        t1.setText("ARITMETICA");
        t1.setBounds(250,5,70,30);
        
        t2 = new JLabel();
        t2.setText("CONVERSION");
        t2.setBounds(250,235,100,30);
        
        n1 = new JLabel();
        n1.setText("Numero 1: ");
        n1.setBounds(20,40,70,30);
        
        n2 = new JLabel();
        n2.setText("Numero 2: ");
        n2.setBounds(300,40,70,30);
        
        n3 = new JLabel();
        n3.setText("Numero: ");
        n3.setBounds(180,260,150,80);
        //res binario
        resultado = new JLabel();
        resultado.setText("Resultado: ");
        resultado.setBounds(165,410,70,30);
        
        resultado1 = new JLabel();
        resultado1.setText("Resultado: ");
        resultado1.setBounds(165,180,70,30);
        
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(380,40,widthTF,heightTF));
        //resultado conversion
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(250,410,widthTF,heightTF));
        //rsultado operaciones
        textF5 = new JTextField();
        textF5.setBounds(new Rectangle(250,180,widthTF,heightTF));
        //caja binario
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(250,290,widthTF,heightTF));
        
        multi = new JButton("Multiplicacion");
        multi.setBounds(new Rectangle(50,115,widthB,heightB));
        
        divi = new JButton("Division");
        divi.setBounds(new Rectangle(180,115,widthB,heightB));
        
        rest = new JButton("Resta");
        rest.setBounds(new Rectangle(310,115,widthB,heightB));
        
        sum = new JButton("Suma");
        sum.setBounds(new Rectangle(440,115,widthB,heightB));
        
        binario = new JButton("Binario");
        binario.setBounds(new Rectangle(250,350,widthB,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);
        textF5.setEditable(false);
        
        multi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Aritmetica Multiplicacion = factory.getAritmetica("Multiplicacion");
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = Multiplicacion.operacion(num1, num2);
                String result = String.valueOf(res);
                textF5.setText(result);
            }
        });
        
        divi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Aritmetica Division = factory.getAritmetica("Division");
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = Division.operacion(num1, num2);
                String result = String.valueOf(res);
                textF5.setText(result);
            }
        });
        
        rest.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Aritmetica Resta = factory.getAritmetica("Resta");
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = Resta.operacion(num1, num2);
                String result = String.valueOf(res);
                textF5.setText(result);
            }
        });
        
        sum.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Aritmetica Suma = factory.getAritmetica("Suma");
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = Suma.operacion(num1, num2);
                String result = String.valueOf(res);
                textF5.setText(result);
            }
        });
        
        binario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int n;
                n = Integer.parseInt(textF4.getText());
                Conversion Binario = factory1.getConversion("Binario");
                textF3.setText(Binario.conversor(n));
            }
        });
        add(t1);
        add(t2);
        add(n1);
        add(n2);
        add(n3);
        add(resultado);
        add(resultado1);
        add(textF1);
        add(textF2);
        add(textF3);
        add(textF4);
        add(textF5);
        add(multi);
        add(divi);
        add(rest);
        add(sum);
        add(binario);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
}