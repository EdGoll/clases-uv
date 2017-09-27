import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tablero extends JFrame {
    JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    JButton boton3 = new JButton();
    JButton boton4 = new JButton();
    JButton boton5 = new JButton();
    JButton boton6 = new JButton();
    JButton boton7 = new JButton();
    JButton boton8 = new JButton();
    JButton boton9 = new JButton();
    String[][] tablero=new String[4][4];
    int fila, columna;
    public Tablero() {
        initComponents();
        IniciarTablero();
    }
    
    private void IniciarTablero(){
        tablero[1][1]="-";
        tablero[1][2]="-";
        tablero[1][3]="-";
        tablero[2][1]="-";
        tablero[2][2]="-";
        tablero[2][3]="-";
        tablero[3][1]="-";
        tablero[3][2]="-";
        tablero[3][3]="-";
    }

    private void initComponents() {
        setTitle("Juego Gato");
        JOptionPane.showMessageDialog(null, "Que Comienze el juego!!","Nuevo Juego",JOptionPane.INFORMATION_MESSAGE); 
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //boton1
        boton1.setBackground(new Color(0,0,0));
        boton1.setFont(new Font("Arial black", 0, 74));
        boton1.addActionListener(this::boton1ActionPerformed);
        //boton2
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Arial black", 0, 74));
        boton2.addActionListener(this::boton2ActionPerformed);
        //boton3
        boton3.setBackground(new Color(0,0,0));
        boton3.setFont(new Font("Arial black", 0, 74));
        boton3.addActionListener(this::boton3ActionPerformed);
        //boton4
        boton4.setBackground(new Color(255,255,255));
        boton4.setFont(new Font("Arial black", 0, 74));
        boton4.addActionListener(this::boton4ActionPerformed);
        //boton5
        boton5.setBackground(new Color(0,0,0));
        boton5.setFont(new Font("Arial black", 0, 74));
        boton5.addActionListener(this::boton5ActionPerformed);
        //boton6
        boton6.setBackground(new Color(255, 255, 255));
        boton6.setFont(new Font("Arial black", 0, 74));
        boton6.addActionListener(this::boton6ActionPerformed);
        //boton7
        boton7.setBackground(new Color(0,0,0));
        boton7.setFont(new Font("Arial black", 0, 74));
        boton7.addActionListener(this::boton7ActionPerformed);
        //boton8
        boton8.setBackground(new Color(255, 255, 255));
        boton8.setFont(new Font("Arial black", 0, 74));
        boton8.addActionListener(this::boton8ActionPerformed);
        //boton9
        boton9.setBackground(new Color(0,0,0));
        boton9.setFont(new Font("Arial black", 0, 74));
        boton9.addActionListener(this::boton9ActionPerformed);

       	setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,3,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        add(panel,BorderLayout.CENTER);
    }
    //boton1
    private void boton1ActionPerformed(ActionEvent evt) {
        if((boton1.getText().equals(""))){
            tablero[1][1]="X";
            impTablero();
            Maquina m=new Maquina();
            boton1.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();
            Evaluar(m);
        }
    }
    //boton2
    private void boton2ActionPerformed(ActionEvent evt) {
        if((boton2.getText().equals(""))){
            tablero[1][2]="X";
            impTablero();
            Maquina m=new Maquina();
            boton2.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero(); 
            Evaluar(m);
        }
    }
    //boton3
    private void boton3ActionPerformed(ActionEvent evt) {
        if((boton3.getText().equals(""))){
            tablero[1][3]="X";
            impTablero();
            Maquina m=new Maquina();
            boton3.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();
            Evaluar(m);
        }
    }
    //boton4
    private void boton4ActionPerformed(ActionEvent evt) {
        if((boton4.getText().equals(""))){
            tablero[2][1]="X";
            impTablero();
            Maquina m=new Maquina();
            boton4.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero(); 
            Evaluar(m);
        }
    }
    //boton5
    private void boton5ActionPerformed(ActionEvent evt) {
        if((boton5.getText().equals(""))){
            tablero[2][2]="X";
            impTablero();
            Maquina m=new Maquina();
            boton5.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();           
            Evaluar(m);
        }
    }
    //boton6
    private void boton6ActionPerformed(ActionEvent evt) {
        if((boton6.getText().equals(""))){
            tablero[2][3]="X";
            impTablero();
            Maquina m= new Maquina();
            boton6.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();            
            Evaluar(m);
        }
    }

    private void boton7ActionPerformed(ActionEvent evt) {
        if((boton7.getText().equals(""))){
            tablero[3][1]="X";
            impTablero();
            Maquina m=new Maquina();
            boton7.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();            
            Evaluar(m);
        }
    }
    //boton7
    private void boton8ActionPerformed(ActionEvent evt) {
        if((boton8.getText().equals(""))){
            tablero[3][2]="X";
            impTablero();
            Maquina m=new Maquina();
            boton8.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();        
            Evaluar(m);
        }
    }
    //boton8
    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if((boton9.getText().equals(""))){
            tablero[3][3]="X";
            impTablero();
            Maquina m=new Maquina();
            boton9.setEnabled(false);
            m.Artificial(0, 1, this);
            tablero[fila][columna]="O";
            impTablero();            
            Evaluar(m);
        }
    }
    //Aqui se evalua quien sale ganador o si hay un empate
    public void Evaluar(Maquina m){
        switch (m.eval(this)) {
            case -1:
                JOptionPane.showMessageDialog(null, "Felicitaciones,ganaste esta partida !!!","Resultado",JOptionPane.INFORMATION_MESSAGE);
                bloquear();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Lastima,perdiste esta partida !!!","Resultado",JOptionPane.INFORMATION_MESSAGE);
                bloquear();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "No lograste vencer. Empataste esta partida !!!","Resultado",JOptionPane.INFORMATION_MESSAGE);
                bloquear();
                break;
            default:
                break;
        }
    }
    //Aqui la maquina presiona una casilla del tablero
    public void impTablero(){
        if(!tablero[1][1].equals("-")){
            boton1.setText(tablero[1][1]);boton1.setEnabled(false);
        }
        if(!tablero[1][2].equals("-")){
            boton2.setText(tablero[1][2]);boton2.setEnabled(false);
        }
        if(!tablero[1][3].equals("-")){
            boton3.setText(tablero[1][3]);boton3.setEnabled(false);
        }
        if(!tablero[2][1].equals("-")){
            boton4.setText(tablero[2][1]);boton4.setEnabled(false);
        }
        if(!tablero[2][2].equals("-")){
            boton5.setText(tablero[2][2]);boton5.setEnabled(false);
        }
        if(!tablero[2][3].equals("-")){
            boton6.setText(tablero[2][3]);boton6.setEnabled(false);
        }
        if(!tablero[3][1].equals("-")){
            boton7.setText(tablero[3][1]);boton7.setEnabled(false);
        }
        if(!tablero[3][2].equals("-")){
            boton8.setText(tablero[3][2]);boton8.setEnabled(false);
        }
        if(!tablero[3][3].equals("-")){
            boton9.setText(tablero[3][3]);boton9.setEnabled(false);
        }
                
    }
    public static void main(String args[]) {
        new Tablero().setVisible(true);
    }
    /*Aqui se bloquean las casillas para que luego de que termine el juego no
    puedan seguir jugando*/
    public void bloquear(){
        boton1.setEnabled(false);boton2.setEnabled(false);boton3.setEnabled(false);
        boton4.setEnabled(false);boton5.setEnabled(false);boton6.setEnabled(false);
        boton7.setEnabled(false);boton8.setEnabled(false);boton9.setEnabled(false);
    }
}