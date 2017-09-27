import java.awt.BorderLayout;
import java.awt.Dimension;
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
        out.setEditable(false);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        processBtn.addActionListener(new oyenteBoton());
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class oyenteBoton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Convert c = new Convert();
            threadToMorse ttm = new threadToMorse(c);
            threadToASCII tta = new threadToASCII(c);
            ttm.start();
            tta.start();
        
            try {
                ttm.join();
                tta.join();
            } 
            catch(InterruptedException ex) {
            }
        }
    }   
}
