/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author fojomars
 */
public class Componentes {

    JFrame marco;
    JPanel panel1, panel2;
    JButton premer, limpiar, boton;
    JLabel label1, label2;
    JTextField text1;
    JPasswordField pw;
    JList list;
    JTextArea area;
    
    public void crearMarco(){
        marco = new JFrame("Boletín 24");
        marco.setSize(800, 600);
        // Elementos panel 1
        panel1 = new JPanel();
        panel1.setSize(700, 300);
        label1 = new JLabel("NOME: ");
        label2 = new JLabel("PASSWORD: ");
        text1 = new JTextField();
        pw = new JPasswordField();
        premer = new JButton("PREMER");
        limpiar = new JButton("LIMPAR");
        label1.setBounds(250, 50, 100, 30);
        label2.setBounds(250, 100, 150, 30);
        text1.setBounds(350, 50, 150, 30);
        pw.setBounds(350, 100, 150, 30);
        premer.setBounds(250, 200, 100, 50);
        limpiar.setBounds(450, 200, 100, 50);
        panel1.setLayout(null);
        panel1.setBackground(Color.red);
        // AÑADIMOS LOS ELEMENTOS AL PANEL 1
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(text1);
        panel1.add(pw);
        panel1.add(premer);
        panel1.add(limpiar);
        
        // Elementos panel 2
        panel2 = new JPanel();
        panel2.setSize(700, 300);
        String[] ele = {"Dam1","Asir","Web"};
        list = new JList(ele);
        boton = new JButton("BOTON");
        area = new JTextArea();
        list.setBounds(150, 350, 130, 250);
        boton.setBounds(350, 380, 100, 50);
        area.setBounds(550, 350, 130, 250);
        panel2.setLayout(null);
        panel2.setBackground(Color.cyan);
        // AÑADIMOS LOS ELEMENTOS AL PANEL 2
        panel2.add(list);
        panel2.add(boton);
        panel2.add(area);
        
        marco.add(panel1);
        marco.add(panel2);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
