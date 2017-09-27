/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


    public class View extends JFrame{
        public JTextArea out;
        private JButton processBtn;
        private JPanel panelTitle , panelOut , panelBtn;
        
        public View(){
            super("GUI + Threads");
        }
    public void start(){
            out = new JTextArea(80,30);
            processBtn = new JButton("inicio");
            panelTitle = new JPanel();
            panelOut = new JPanel();
            panelBtn = new JPanel();
            
            setLayout(new BorderLayout());
            
            panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            panelTitle.add(new JLabel("Concurrencia"));
            add(panelTitle, BorderLayout.NORTH);
            
            panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
            panelOut.add(out);
            add(panelOut, BorderLayout.CENTER);
            
            panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            panelBtn.add(processBtn);
            //processBtn.addActionListener(new OyenteBoton);
            add(panelBtn, BorderLayout.SOUTH);
            
            setSize(380, 400);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            

        } 

    private static class OyenteBoton {

        public OyenteBoton() {
            
        }
    }
    }

