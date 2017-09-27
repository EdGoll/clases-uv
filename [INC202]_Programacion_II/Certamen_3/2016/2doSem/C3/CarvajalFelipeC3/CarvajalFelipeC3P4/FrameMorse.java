
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameMorse extends JFrame {
    JTextField CodigoMorse = new JTextField();
    JLabel CodigoAscii = new JLabel();
    TraductorMorse morse = new TraductorMorse();
    
    public FrameMorse(){
        super("Traductor Morse-ASCII");
        setSize(400, 200);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        CodigoMorse.setBounds(0, 10, 375, 25);
         CodigoAscii.setBounds(0, 125,375, 25);
         
        add(CodigoMorse);
        add(CodigoAscii);
        
        JButton change = new JButton("Cambiar");
        change.setBounds(50, 50, 150, 25);
        change.addActionListener(new Cambiar());
        
        add(change);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    private  class Cambiar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CodigoAscii.setText(morse.TransformMorseToASCII(CodigoMorse.getText()));
           // System.out.println(morse.TransformMorseToASCII(CodigoMorse.getText()));
            System.out.println("CAMBIO!!!");
        }
    }
    
}
