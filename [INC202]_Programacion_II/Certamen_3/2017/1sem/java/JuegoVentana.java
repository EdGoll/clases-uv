import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JuegoGato extends JFrame {

    private final JButton[][] casillas = new JButton[3][3];
    private Juego juego;

    public JuegoGato() {
        super("Juego Gato");
        iniciarPartida();
        setLayout(new GridLayout(3, 3));
        setSize(440, 440);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void iniciarPartida() {
        juego = new Juego();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new JButton();
                casillas[i][j].setBackground(Color.BLACK);
                casillas[i][j].setIcon(new ImageIcon("images/blanco.png"));
                casillas[i][j].setName("[" + i + "," + j + "]");
                casillas[i][j].addActionListener(new OyenteBotonJuego());
                add(casillas[i][j]);
            }
        }
        JOptionPane.showMessageDialog(this, "Que comience el juego !!!", "Nueva partida",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new JuegoGato();
    }

    class OyenteBotonJuego implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (juego.jugar(((JButton) e.getSource()))) {
                case Juego.GANA:
                    JOptionPane.showMessageDialog(null, "Felicitaciones, ganaste esta partida !!!", "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(JFrame.EXIT_ON_CLOSE);
                case Juego.PIERDE:
                    JOptionPane.showMessageDialog(null, "Lástima, perdiste esta partida !!!", "Resultado",
                            JOptionPane.ERROR_MESSAGE);

                    System.exit(JFrame.EXIT_ON_CLOSE);
                case Juego.EMPATE:
                    JOptionPane.showMessageDialog(null, "No lograste vencer. Empataste esta partida !!!", "Resultado",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(JFrame.EXIT_ON_CLOSE);
                case Juego.SIGUE:
                    break;
            }
        }
    }

    class Juego {

        private String jugador, maquina;
        private final String path = "imagenes/", extensionImagen = ".png";
        protected static final int GANA = 1, PIERDE = -1, EMPATE = 0, SIGUE = 2;
        private int jugada;
        private final Random r;

        public Juego() {
            jugada = 0;
            r = new Random();
        }

        private void validarPirmeraJugada(String botonPresionado) {
            if (jugada == 0) {
                if (r.nextBoolean()) {
                    jugador = "cruz";
                    maquina = "circulo";
                } else {
                    jugador = "circulo";
                    maquina = "cruz";
                }
            }
        }

        private void juegaJugador(JButton botonPresionado) {
            validarPirmeraJugada(botonPresionado.getName());
            if (botonPresionado.isEnabled()) {
                botonPresionado.setIcon(new ImageIcon(path + jugador + extensionImagen));
                botonPresionado.setName(jugador);
                botonPresionado.setEnabled(false);
                jugada++;
            }
        }

        private void juegaMaquina() {
            int i, j;
            do {
                i = r.nextInt(3);
                j = r.nextInt(3);
            } while (!casillas[i][j].isEnabled());
            casillas[i][j].setIcon(new ImageIcon(path + maquina + extensionImagen));
            casillas[i][j].setName(maquina);
            casillas[i][j].setEnabled(false);
            jugada++;
        }

        private boolean validarJuego(String player) {
            if ((casillas[0][0].getName().equals(player)) && (casillas[0][1].getName().equals(player))
                    && (casillas[0][2].getName().equals(player))) {
                return true;
            }
            if ((casillas[1][0].getName().equals(player)) && (casillas[1][1].getName().equals(player))
                    && (casillas[1][2].getName().equals(player))) {
                return true;
            }
            if ((casillas[2][0].getName().equals(player)) && (casillas[2][1].getName().equals(player))
                    && (casillas[2][2].getName().equals(player))) {
                return true;
            }
            if ((casillas[0][0].getName().equals(player)) && (casillas[1][0].getName().equals(player))
                    && (casillas[2][0].getName().equals(player))) {
                return true;
            }
            if ((casillas[0][1].getName().equals(player)) && (casillas[1][1].getName().equals(player))
                    && (casillas[2][1].getName().equals(player))) {
                return true;
            }
            if ((casillas[0][2].getName().equals(player)) && (casillas[1][2].getName().equals(player))
                    && (casillas[2][2].getName().equals(player))) {
                return true;
            }
            if ((casillas[0][0].getName().equals(player)) && (casillas[1][1].getName().equals(player))
                    && (casillas[2][2].getName().equals(player))) {
                return true;
            }
            if ((casillas[0][2].getName().equals(player)) && (casillas[1][1].getName().equals(player))
                    && (casillas[2][0].getName().equals(player))) {
                return true;
            }
            return false;
        }

        public int jugar(JButton botonPresionado) {

            juegaJugador(botonPresionado);

            if (validarJuego(jugador)) {
                return GANA;
            } else if (jugada < 9) {
                juegaMaquina();
                if (validarJuego(maquina)) {
                    return PIERDE;
                } else {
                    return SIGUE;
                }
            } else {
                return EMPATE;
            }
        }
    }
}
