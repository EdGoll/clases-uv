
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.ScrollPaneConstants.*;


public class View extends JFrame implements ActionListener{
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelBtn;
    private JScrollPane panelOut;
    private ThreadToASCII hebraASCII;
    private ThreadToMorse hebraMorse;
    private boolean hebrasCreadas = false;
    private boolean hebrasSuspendidas = false;
    
    
    public View(){
        super("GUI + Threads");    
    }
    
    public void start(){
        out = new JTextArea(10, 30);
        out.setEditable(false);
        processBtn = new JButton("Inicio");
        processBtn.addActionListener(this);
        panelTitle = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout(5, 2));
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia "));
        add(panelTitle, BorderLayout.NORTH);
        
        
        panelOut = new JScrollPane(out 
                ,VERTICAL_SCROLLBAR_AS_NEEDED 
                ,HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setMinimumSize(new Dimension(300, 400));
        //setSize(380, 400);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
    }

    public synchronized void agregarLinea(String a){        
        out.setText(out.getText() + a + "\n");
        out.setCaretPosition(out.getDocument().getLength());        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!hebrasCreadas) {
            hebraASCII = new ThreadToASCII("ASCII", this);
            hebraASCII.start();
        
            hebraMorse = new ThreadToMorse("MORSE", this);
            hebraMorse.start();
            hebrasCreadas = true;
            processBtn.setText("Pausar");
        }
        else{
            if(!hebrasSuspendidas){
                hebraASCII.suspend();
                hebraMorse.suspend();
                hebrasSuspendidas = !hebrasSuspendidas;
                processBtn.setText("Continuar");
            }
            else{
                hebraASCII.resume();
                hebraMorse.resume();
                hebrasSuspendidas = !hebrasSuspendidas;
                processBtn.setText("Pausar");
            }
                
        }
    }
}
