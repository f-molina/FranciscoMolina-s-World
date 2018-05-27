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
import Operaciones.*;

/**
 *
 * @author fmolina
 */
public class Ventana extends JPanel {
    
    public int WIDTH = 600, widthTF = 120, widthB = 120;
    public int HEIGHT = 600, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3;
    public JButton multi, divi, rest, sum;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(380,40,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(220,300,widthTF,heightTF));
        
        multi = new JButton("Multiplicacion");
        multi.setBounds(new Rectangle(50,115,widthB,heightB));
        
        divi = new JButton("Division");
        divi.setBounds(new Rectangle(180,115,widthB,heightB));
        
        rest = new JButton("Resta");
        rest.setBounds(new Rectangle(310,115,widthB,heightB));
        
        sum = new JButton("Suma");
        sum.setBounds(new Rectangle(440,115,widthB,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        multi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Multiplicacion m = new Multiplicacion();
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = m.operacion(num1, num2);
                String result = String.valueOf(res);
                textF3.setText(result);
            }
        });
        
        divi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Division d = new Division();
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = d.operacion(num1, num2);
                String result = String.valueOf(res);
                textF3.setText(result);
            }
        });
        
        rest.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Resta r = new Resta();
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = r.operacion(num1, num2);
                String result = String.valueOf(res);
                textF3.setText(result);
            }
        });
        
        sum.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Suma s = new Suma();
                String text1 = textF1.getText();
                double num1 = Double.parseDouble(text1);
                String text2 = textF2.getText();
                double num2 = Double.parseDouble(text2);
                double res = s.operacion(num1, num2);
                String result = String.valueOf(res);
                textF3.setText(result);
            }
        });
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(multi);
        add(divi);
        add(rest);
        add(sum);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
}
