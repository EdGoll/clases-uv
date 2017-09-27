

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    
    public View(){
        super("GUI + Threads");  
    }
    
    public void start(){
        out = new JTextArea(80,30);
        processBtn = new JButton("Inicio");
        processBtn.addActionListener(new OyenteBoton()); //AGREGUE ACCION AL BOTON
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        out.setEditable(false);
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER);
        JScrollPane sp = new JScrollPane(out); //Incorporacion del Scrollpane..
        add(sp);
        out.setText(RandomWord.generate());
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    //ACION BOTON
    class OyenteBoton implements ActionListener{
    	@Override
		public void actionPerformed(ActionEvent e){
    		if(e.getSource()==processBtn){
    			String palabra = RandomWord.generate(); //con esto obtengo la palabra ranbom
    			
    			traductor trslt = new traductor();
    			
    			traductor2 trslt2 = new traductor2 (palabra);
    			Thread t = new Thread(trslt2);
    			t.start();
    			
    			traductor3 trslt3 = new traductor3 (palabra);
    			Thread t2 = new Thread(trslt3);
    			t2.start();
    			
    		}
    	}
    }
  
}