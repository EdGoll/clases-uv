

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {

    public JTextArea pant1,pant2;
    private JButton boton;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane panelScroll,panelScroll2;
    
    
    public void start() {
        
        pant1 = new JTextArea(10, 10);
        pant2 = new JTextArea(10, 10);
        boton = new JButton("Iniciar!");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        panelScroll = new JScrollPane(pant1);
        panelScroll2 = new JScrollPane(pant2);
        setLayout(new BorderLayout());
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelTitle.add(new JLabel("Traductor de Morse y Ascii"));
        add(panelTitle, BorderLayout.NORTH);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(panelScroll,BorderLayout.CENTER);
        panelOut.add(panelScroll2,BorderLayout.SOUTH);
        add(panelOut, BorderLayout.CENTER);
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        boton.addActionListener(new palabra());
        panelBtn.add(boton);
        add(panelBtn, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class palabra implements ActionListener {

        @Override
       
        
       
          public void actionPerformed(ActionEvent ae) {
                AMorse am = new AMorse(pant1.getText());
          
         
               
			if( pant1.getText().equals("")) {
				JOptionPane.showMessageDialog(
					null,
					"Debe incluir un texto antes de copiar",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			} else {
				am.CargarTexto(pant1.getText());
                                pant2.setText(am.traducirTexto(pant1.getText()));
			}
		}

        
        }

    
    
}
