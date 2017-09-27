

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author JOJE
 */
 
public class InterfazGrafica extends JFrame {
public String Palabra="";
public int a;   

    InterfazGrafica(){
        
        //System.out.println("c"); //Prueba de instanciacion
       
        setTitle("interfaz"); //nombre de ventana
        setBounds(10, 10, 770, 130); //Fijamos el tamaño
       
        Lamina1 milamina1=new Lamina1();
        Lamina2 milamina2=new Lamina2();
        Lamina3 milamina3=new Lamina3();
        //FlowLayout dispo=new FlowLayout(FlowLayout.LEFT, 50, 20);         
        //milamina.setLayout(dispo); 
        
        //milamina.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(milamina1, BorderLayout.NORTH);
        add(milamina2, BorderLayout.CENTER);
        add(milamina3, BorderLayout.SOUTH);
       
    }

    
    //IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII LAMINA DEL NORTE IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
    class Lamina1 extends JPanel{
    
        public Lamina1(){        
            Lamina11 milamina11=new Lamina11();
            add(milamina11, BorderLayout.EAST);
            Lamina12 milamina12=new Lamina12();
            add(milamina12, BorderLayout.CENTER);
           // Lamina13 milamina13=new Lamina13();
            //add(milamina13, BorderLayout.WEST);
        }
    }//Label Listo
    class Lamina11 extends JPanel{
        JLabel jl1; 
        public Lamina11(){        
            setLayout(new BorderLayout());
            jl1 = new JLabel("Escribir aqui la palabra a traducir:");
            add(jl1, BorderLayout.NORTH);                
        }  
    }
    
    class Lamina12 extends JPanel{//Esta lamina se encuentra dentro de la lamina1
        JTextField campo1;
        public Lamina12(){        
            setLayout(new BorderLayout());
            campo1 = new JTextField(30);
            add(campo1, BorderLayout.WEST); 
            JButton boton=new JButton("Traducir");//decidi probar con el boton aqui
            add(boton, BorderLayout.EAST);
            boton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String input = campo1.getText();//Mi variable input contiene lo escrito en el JTextField
                    //System.out.println(input); //pruebas con variables
                    //System.out.println(Palabra);
                    a=1;
                    String C, D;
                    Palabra = input;
                    //campo1.setText(input);
                    Morse M = new Morse(Palabra);
                    C=M.PalabraFinal(); 
                    System.out.println(C); //Prueba
                    
                    ASCII A = new ASCII(Palabra);
                    D=A.PalabraFinal(); 
                    System.out.println(D);
                }
                
            }
            
            );//
        }
        
    }
    /* class clasefiov implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //llamar a clase traducir 
           
            
            System.out.println("Hola");
        }
        
    }*/
    /*class Lamina13 extends JPanel{//Esta lamina se encuentra dentro de la lamina1
        public Lamina13(){         
            setLayout(new BorderLayout());
            JButton boton=new JButton("Traducir");
            add(boton, BorderLayout.EAST);
            boton.addActionListener(ca);
        }
    }*/
    //Mi cabeza exploto 
    //IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII LAMINA DEL CENTRO IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
    class Lamina2 extends JPanel{    
        public Lamina2(){        
            Lamina21 milamina21=new Lamina21();
            add(milamina21, BorderLayout.WEST);
            Lamina22 milamina22=new Lamina22();
            add(milamina22, BorderLayout.CENTER);               
        }   
    }
    //Label Listo
    class Lamina21 extends JPanel{
        public Lamina21(){    
            JLabel jl1;
            setLayout(new BorderLayout());
            jl1 = new JLabel("Traduccion a Morse:                         ");
            add(jl1, BorderLayout.WEST);                                    
        }
    }
    class Lamina22 extends JPanel{
        JTextField campo1;
        public Lamina22(){        
            setLayout(new BorderLayout());
            campo1 = new JTextField(30);
            add(campo1, BorderLayout.WEST); 
            //campo1.setText(input);
            //if(a==1){
                System.out.println(Palabra);
                campo1.setText(Palabra);
            //} 
        }
    }
  //IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII LAMINA DEL SUR IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
    class Lamina3 extends JPanel{    
        public Lamina3(){        
            Lamina31 milamina31=new Lamina31();
            add(milamina31, BorderLayout.WEST);
            Lamina32 milamina32=new Lamina32();
            add(milamina32, BorderLayout.NORTH);               
        }   
    }
    //Label Listo
    class Lamina31 extends JPanel{
        public Lamina31(){    
            JLabel jl1;
            setLayout(new BorderLayout());
            jl1 = new JLabel("Traduccion a ASCII:                           ");
            add(jl1, BorderLayout.WEST);                                    
        }
    }
    class Lamina32 extends JPanel{
        JTextField campo1;
        public Lamina32(){        
            setLayout(new BorderLayout());
            campo1 = new JTextField(30);
            add(campo1, BorderLayout.WEST);
            //if(a==1){
                
                campo1.setText(Palabra);
            //}    
        }
    }
}
