import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Gato extends JFrame{
    
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton[] boton={b1, b2, b3, b4, b5, b6, b7, b8, b9};
    private int[] ocupado, usuario, IA;
    private int disponibles;
    private String icono1, icono2;
    
    public Gato(){
        super("Gato");
        setSize(400, 400);
        ocupado=new int[9];
        usuario=new int[9];
        IA=new int[9];
        parte1();
        parte2();
        azarIconoInicial();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void parte1(){
        for(int x=0;x<9;x++){
                ocupado[x]=0;
        }
        for(int x=0;x<9;x++){
                usuario[x]=0;
        }
        for(int x=0;x<9;x++){
                IA[x]=0;
        }
        for(int x=0;x<9;x++){
            boton[x]=new JButton();
            boton[x].setIcon(new ImageIcon("blanco.png"));
            boton[x].addActionListener(new GatoOyente());
        }
    }
    
    private void parte2(){
        setLayout(new GridLayout(3, 3));
        for(int x=0;x<9;x++){
            add(boton[x]);
        }
        setVisible(true);
    }
    
    private void azarIconoInicial(){
        Random r=new Random();
        String[] iconos={"cruz.png", "circulo.png"};
        int azar1=r.nextInt(2);
        int azar2=0;
        if(azar1==1){
            azar2=0;
        }
        if(azar1==0){
            azar2=1;
        }
        icono1=iconos[azar1];
        icono2=iconos[azar2];
    }
    
    private void azarBotonIA(){
        Random r=new Random();
        int ocupados=1;
        for(int x=0;x<9;x++){
            ocupados=ocupados+ocupado[x];
        }
        disponibles=10-ocupados;
        if(ocupados<=8){
            int nIA=r.nextInt(9);
            while(ocupado[nIA]==1){
                nIA=r.nextInt(9);
            }
            boton[nIA].setIcon(new ImageIcon(icono2));
            ocupado[nIA]=1;
            IA[nIA]=1;
        }
    }
  
    private void proceso0(){
        if(((usuario[0]==1)&&(usuario[1]==1)&&(usuario[2]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        if(((usuario[0]==1)&&(usuario[3]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
                }
        if(((usuario[0]==1)&&(usuario[4]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso1(){
        if(((usuario[0]==1)&&(usuario[1]==1)&&(usuario[2]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[1]==1)&&(usuario[4]==1)&&(usuario[7]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso2(){
        if(((usuario[0]==1)&&(usuario[1]==1)&&(usuario[2]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[2]==1)&&(usuario[5]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[2]==1)&&(usuario[4]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso3(){
        if(((usuario[0]==1)&&(usuario[3]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }   
        if(((usuario[3]==1)&&(usuario[4]==1)&&(usuario[5]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso4(){
        if(((usuario[3]==1)&&(usuario[4]==1)&&(usuario[5]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[1]==1)&&(usuario[4]==1)&&(usuario[7]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[2]==1)&&(usuario[4]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[0]==1)&&(usuario[4]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso5(){
        if(((usuario[3]==1)&&(usuario[4]==1)&&(usuario[5]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[2]==1)&&(usuario[5]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso6(){
        if(((usuario[6]==1)&&(usuario[7]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[0]==1)&&(usuario[3]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
                }
        if(((usuario[2]==1)&&(usuario[4]==1)&&(usuario[6]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    private void proceso7(){
        if(((usuario[6]==1)&&(usuario[7]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[1]==1)&&(usuario[4]==1)&&(usuario[7]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
    }
    
    private void proceso8(){
        if(((usuario[6]==1)&&(usuario[7]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[2]==1)&&(usuario[5]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(((usuario[0]==1)&&(usuario[4]==1)&&(usuario[8]==1))){
            JOptionPane.showMessageDialog(null, "¡Haz ganado!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    class GatoOyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            //boton 0
            if(evento.getSource().equals(boton[0])){
                if(ocupado[0]==0){
                    boton[0].setIcon(new ImageIcon(icono1));
                    ocupado[0]=1;
                    usuario[0]=1;
                    proceso0();
                    azarBotonIA();
                } 
            }
            //boton 1
            if(evento.getSource().equals(boton[1])){
                if(ocupado[1]==0){
                    boton[1].setIcon(new ImageIcon(icono1));
                    ocupado[1]=1;
                    usuario[1]=1;
                    proceso1();
                    azarBotonIA();
                } 
            }
            //boton 2
            if(evento.getSource().equals(boton[2])){
                if(ocupado[2]==0){
                    boton[2].setIcon(new ImageIcon(icono1));
                    ocupado[2]=1;
                    usuario[2]=1;
                    proceso2();
                    azarBotonIA();
                } 
            }
            //boton 3
            if(evento.getSource().equals(boton[3])){
                if(ocupado[3]==0){
                    boton[3].setIcon(new ImageIcon(icono1));
                    ocupado[3]=1;
                    usuario[3]=1;
                    proceso3();
                    azarBotonIA();
                } 
            }
            //boton 4
            if(evento.getSource().equals(boton[4])){
                if(ocupado[4]==0){
                    boton[4].setIcon(new ImageIcon(icono1));
                    ocupado[4]=1;
                    usuario[4]=1;
                    proceso4();
                    azarBotonIA();
                } 
            }
            //boton 5
            if(evento.getSource().equals(boton[5])){
                if(ocupado[5]==0){
                    boton[5].setIcon(new ImageIcon(icono1));
                    ocupado[5]=1;
                    usuario[5]=1;
                    proceso5();
                    azarBotonIA();
                } 
            }
            //boton 6
            if(evento.getSource().equals(boton[6])){
                if(ocupado[6]==0){
                    boton[6].setIcon(new ImageIcon(icono1));
                    ocupado[6]=1;
                    usuario[6]=1;
                    proceso6();
                    azarBotonIA();
                } 
            }
            //boton 7
            if(evento.getSource().equals(boton[7])){
                if(ocupado[7]==0){
                    boton[7].setIcon(new ImageIcon(icono1));
                    ocupado[7]=1;
                    usuario[7]=1;
                    proceso7();
                    azarBotonIA();
                } 
            }
            //boton 8
            if(evento.getSource().equals(boton[8])){
                if(ocupado[8]==0){
                    boton[8].setIcon(new ImageIcon(icono1));
                    ocupado[8]=1;
                    usuario[8]=1;
                    proceso8();
                    azarBotonIA();
                } 
            }
            if(((IA[0]==1)&&(IA[1]==1)&&(IA[2]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[3]==1)&&(IA[4]==1)&&(IA[5]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[6]==1)&&(IA[7]==1)&&(IA[8]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[0]==1)&&(IA[3]==1)&&(IA[6]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[1]==1)&&(IA[4]==1)&&(IA[7]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[2]==1)&&(IA[5]==1)&&(IA[8]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[0]==1)&&(IA[4]==1)&&(IA[8]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(((IA[2]==1)&&(IA[4]==1)&&(IA[6]==1))){
                JOptionPane.showMessageDialog(null, "¡Haz perdido!", "¡Aviso!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            if(disponibles==0){
                JOptionPane.showMessageDialog(null, "¡Ha sido un empate!", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }
}
