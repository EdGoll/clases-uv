import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Random;

public class JuegoVentana extends JFrame {
    JButton botonA;
    JButton botonB;
    JButton botonC;
    JButton botonD;
    JButton botonE;
    JButton botonF;
    JButton botonG;
    JButton botonH;
    JButton botonI;
    ImageIcon blanco;
    ImageIcon circulo;
    ImageIcon cruz;
    GridBagConstraints panel;
    ItemListener ItemListener;
    boolean memoria;
    String jugador = "";
    String maquina = "";
    
    public JuegoVentana() {
        super("Juego Gato");
        this.blanco = new ImageIcon("blanco.png");
        this.circulo = new ImageIcon("circulo.png");
        this.cruz = new ImageIcon("cruz.png");
        JOptionPane.showMessageDialog(null, "Que comience el juego!!!", "Nueva Partida", JOptionPane.INFORMATION_MESSAGE);
        this.getContentPane().setLayout(new GridBagLayout());
        
        panel = new GridBagConstraints();
        
        botonA = new JButton(this.blanco);
        botonA.addActionListener(new Oyente());
        panel.gridx = 0; // El área de texto empieza en la columna cero.
        panel.gridy = 0; // El área de texto empieza en la fila cero
        panel.gridwidth = 1; // El área de texto ocupa dos columnas.
        panel.gridheight = 1; // El área de texto ocupa 2 filas.
        panel.fill = GridBagConstraints.BOTH;
        panel.weightx = 1.0;
        panel.weighty = 1.0;
        panel.insets = new Insets(2,2,2,2);
        this.getContentPane().add(botonA, panel);
        
        botonB = new JButton(this.blanco);
        botonB.addActionListener(new Oyente());
        panel.gridx = 1;
        panel.gridy = 0;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonB, panel);
        
        botonC = new JButton(this.blanco);
        botonC.addActionListener(new Oyente());
        panel.gridx = 2;
        panel.gridy = 0;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonC, panel);
        
        botonD = new JButton(this.blanco);
        botonD.addActionListener(new Oyente());
        panel.gridx = 0;
        panel.gridy = 1;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonD, panel);
        
        botonE = new JButton(this.blanco);
        botonE.addActionListener(new Oyente());
        panel.gridx = 1;
        panel.gridy = 1;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonE, panel);
        
        botonF = new JButton(this.blanco);
        botonF.addActionListener(new Oyente());
        panel.gridx = 2;
        panel.gridy = 1;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonF, panel);
        
        botonG = new JButton(this.blanco);
        botonG.addActionListener(new Oyente());
        panel.gridx = 0;
        panel.gridy = 2;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonG, panel);
        
        botonH = new JButton(this.blanco);
        botonH.addActionListener(new Oyente());
        panel.gridx = 1;
        panel.gridy = 2;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonH, panel);
        
        botonI = new JButton(this.blanco);
        botonI.addActionListener(new Oyente());
        panel.gridx = 2;
        panel.gridy = 2;
        panel.gridwidth = 1;
        panel.gridheight = 1;
        this.getContentPane().add(botonI, panel);
        
        Random r = new Random();
        memoria = r.nextBoolean();
        
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void resultado() {
        for(int i = 1; i < 9; i += 3) {
            if(jugador.contains(String.valueOf(i)) & jugador.contains(String.valueOf(i + 1)) & jugador.contains(String.valueOf(i + 2))) {
                JOptionPane.showMessageDialog(null, "Felicitaciones, ganaste la partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if(maquina.contains(String.valueOf(i)) & maquina.contains(String.valueOf(i + 1)) & maquina.contains(String.valueOf(i + 2))) {
                JOptionPane.showMessageDialog(null, "Lástima, perdiste esta partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        for(int i = 1; i <= 3; i++) {
            if(jugador.contains(String.valueOf(i)) & jugador.contains(String.valueOf(i + 3)) & jugador.contains(String.valueOf(i + 6))) {
                JOptionPane.showMessageDialog(null, "Felicitaciones, ganaste la partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if(maquina.contains(String.valueOf(i)) & maquina.contains(String.valueOf(i + 3)) & maquina.contains(String.valueOf(i + 6))) {
                JOptionPane.showMessageDialog(null, "Lástima, perdiste esta partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        if(jugador.contains("1") & jugador.contains("5") & jugador.contains("9")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ganaste la partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(maquina.contains("1") & maquina.contains("5") & maquina.contains("9")) {
            JOptionPane.showMessageDialog(null, "Lástima, perdiste esta partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(jugador.contains("3") & jugador.contains("5") & jugador.contains("7")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ganaste la partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(maquina.contains("3") & maquina.contains("5") & maquina.contains("7")) {
            JOptionPane.showMessageDialog(null, "Lástima, perdiste esta partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        String temp = jugador + maquina;
        if(temp.contains("1") && temp.contains("2") && temp.contains("3") && temp.contains("4") && temp.contains("5") && temp.contains("6") && temp.contains("7") && temp.contains("8") && temp.contains("9")) {
            JOptionPane.showMessageDialog(null, "No lograste vencer. Empataste esta partida !!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        JuegoVentana gato = new JuegoVentana();
    }
    
    class Oyente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(botonA) & (!jugador.contains("1") & !maquina.contains("1"))) {
                jugador += "1 ";
                if(memoria) {
                    botonA.setIcon(circulo);
                }
                else if(!memoria) {
                    botonA.setIcon(cruz);
                }
                botonA.setEnabled(false);
            }
            if(e.getSource().equals(botonB) & (!jugador.contains("2") & !maquina.contains("2"))) {
                jugador += "2 ";
                if(memoria) {
                    botonB.setIcon(circulo);
                }
                else if(!memoria) {
                    botonB.setIcon(cruz);
                }
                botonB.setEnabled(false);
            }
            if(e.getSource().equals(botonC) & (!jugador.contains("3") & !maquina.contains("3"))) {
                jugador += "3 ";
                if(memoria) {
                    botonC.setIcon(circulo);
                }
                else if(!memoria) {
                    botonC.setIcon(cruz);
                }
                botonC.setEnabled(false);
            }
            if(e.getSource().equals(botonD) & (!jugador.contains("4") & !maquina.contains("4"))) {
                jugador += "4 ";
                if(memoria) {
                    botonD.setIcon(circulo);
                }
                else if(!memoria) {
                    botonD.setIcon(cruz);
                }
                botonD.setEnabled(false);
            }
            if(e.getSource().equals(botonE) & (!jugador.contains("5") & !maquina.contains("5"))) {
                jugador += "5 ";
                if(memoria) {
                    botonE.setIcon(circulo);
                }
                else if(!memoria) {
                    botonE.setIcon(cruz);
                }
                botonE.setEnabled(false);
            }
            if(e.getSource().equals(botonF) & (!jugador.contains("6") & !maquina.contains("6"))) {
                jugador += "6 ";
                if(memoria) {
                    botonF.setIcon(circulo);
                }
                else if(!memoria) {
                    botonF.setIcon(cruz);
                }
                botonF.setEnabled(false);
            }
            if(e.getSource().equals(botonG) & (!jugador.contains("7") & !maquina.contains("7"))) {
                jugador += "7 ";
                if(memoria) {
                    botonG.setIcon(circulo);
                }
                else if(!memoria) {
                    botonG.setIcon(cruz);
                }
                botonG.setEnabled(false);
            }
            if(e.getSource().equals(botonH) & (!jugador.contains("8") & !maquina.contains("8"))) {
                jugador += "8 ";
                if(memoria) {
                    botonH.setIcon(circulo);
                }
                else if(!memoria) {
                    botonH.setIcon(cruz);
                }
                botonH.setEnabled(false);
            }
            if(e.getSource().equals(botonI) & (!jugador.contains("9") & !maquina.contains("9"))) {
                jugador += "9 ";
                if(memoria) {
                    botonI.setIcon(circulo);
                }
                else if(!memoria) {
                    botonI.setIcon(cruz);
                }
                botonI.setEnabled(false);
            }
            resultado();
            while(true) {
                Random r = new Random();
                int n = r.nextInt(8) + 1;
                if(n == 1 & (!jugador.contains("1") & !maquina.contains("1"))) {
                    maquina += "1 ";
                    if(memoria) {
                        botonA.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonA.setIcon(circulo);
                    }
                    botonA.setEnabled(false);
                    break;
                }
                if(n == 2 & (!jugador.contains("2") & !maquina.contains("2"))) {
                    maquina += "2 ";
                    if(memoria) {
                        botonB.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonB.setIcon(circulo);
                    }
                    botonB.setEnabled(false);
                    break;
                }
                if(n == 3 & (!jugador.contains("3") & !maquina.contains("3"))) {
                    maquina += "3 ";
                    if(memoria) {
                        botonC.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonC.setIcon(circulo);
                    }
                    botonC.setEnabled(false);
                    break;
                }
                if(n == 4 & (!jugador.contains("4") & !maquina.contains("4"))) {
                    maquina += "4 ";
                    if(memoria) {
                        botonD.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonD.setIcon(circulo);
                    }
                    botonD.setEnabled(false);
                    break;
                }
                if(n == 5 & (!jugador.contains("5") & !maquina.contains("5"))) {
                    maquina += "5 ";
                    if(memoria) {
                        botonE.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonE.setIcon(circulo);
                    }
                    botonE.setEnabled(false);
                    break;
                }
                if(n == 6 & (!jugador.contains("6") & !maquina.contains("6"))) {
                    maquina += "6 ";
                    if(memoria) {
                        botonF.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonF.setIcon(circulo);
                    }
                    botonF.setEnabled(false);
                    break;
                }
                if(n == 7 & (!jugador.contains("7") & !maquina.contains("7"))) {
                    maquina += "7 ";
                    if(memoria) {
                        botonG.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonG.setIcon(circulo);
                    }
                    botonG.setEnabled(false);
                    break;
                }
                if(n == 8 & (!jugador.contains("8") & !maquina.contains("8"))) {
                    maquina += "8 ";
                    if(memoria) {
                        botonH.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonH.setIcon(circulo);
                    }
                    botonH.setEnabled(false);
                    break;
                }
                if(n == 9 & (!jugador.contains("9") & !maquina.contains("9"))) {
                    maquina += "9 ";
                    if(memoria) {
                        botonI.setIcon(cruz);
                    }
                    else if(!memoria) {
                        botonI.setIcon(circulo);
                    }
                    botonI.setEnabled(false);
                    break;
                }
            }
        resultado();
        }
    }
}