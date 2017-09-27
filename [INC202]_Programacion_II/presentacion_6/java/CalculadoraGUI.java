
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CalculadoraGUI {

    public CalculadoraGUI() {
        initComponents();
    }

    private void initComponents() {
        JPanel gui = new JPanel(new BorderLayout(5, 5));
        //gui.setBorder(new EmptyBorder(4, 4, 4, 4));

        //JPanel panelScreen = new JPanel(new GridLayout(0,1));

        //JTextArea screen = new JTextArea(1, 25);
		JTextField screen = new JTextField();
        gui.add(screen, BorderLayout.NORTH);
        //panelScreen.add(screen);

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(gui);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3, 4, 4));

        JButton oneButton = new JButton("1");
		oneButton.setSize(25,25);
        panelButtons.add(oneButton);

        JButton twoButton = new JButton("2");
        panelButtons.add(twoButton);

        JButton threeButton = new JButton("3");
        panelButtons.add(threeButton);

        JButton fourButton = new JButton("4");
        panelButtons.add(fourButton);

        JButton fiveButton = new JButton("5");
        panelButtons.add(fiveButton);

        JButton sixButton = new JButton("6");
        panelButtons.add(sixButton);

        JButton sevenButton = new JButton("7");
        panelButtons.add(sevenButton);

        JButton eightButton = new JButton("8");
        panelButtons.add(eightButton);

        JButton nineButton = new JButton("9");
        panelButtons.add(nineButton);

        JButton zeroButton = new JButton("0");
        panelButtons.add(zeroButton);

        JButton dotButton = new JButton(".");
        panelButtons.add(dotButton);

        JButton resultButton = new JButton("=");
        panelButtons.add(resultButton);

        //frame.getContentPane().add(new JSeparator(), BorderLayout.CENTER);

        gui.add(panelButtons, BorderLayout.CENTER);
        //frame.setBounds(50, 50, 500, 500);
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CalculadoraGUI calculadoraGUI = new CalculadoraGUI();
    }
}