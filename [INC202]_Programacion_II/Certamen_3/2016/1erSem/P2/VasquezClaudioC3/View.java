
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class  View extends JFrame {
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    // elementos agregados 
    private JScrollPane scroll;
    private RandomWord random;
    ThreadToMorse morse;
    ThreadToASCII ascii;
    
    public View(){
        super("GUI + Threads");
    }
    
    public void start(){
        out = new JTextArea(80, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        // Scroll agregado a la clase View
        scroll = new JScrollPane();
                
        setLayout(new BorderLayout());
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        // scroll le agrego el panelout que contieneel Jtexarea "out"
        scroll.setViewportView(panelOut.add(out));
        processBtn.addActionListener(new boton(this));
       
        add(scroll, BorderLayout.CENTER);
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        setSize(380, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public void IniciarThread(View v){
      
        morse = new ThreadToMorse(v);
        ascii =new ThreadToASCII(v);
        morse.start();
        ascii.start();   
        System.out.println("Hebras creadas e iniciadas");
    }
    public synchronized void Write(String a){
        out.append(a+"\n");
    } 

}
class boton implements ActionListener{
    
    private View v;
    public boton(View v){
        this.v = v;
    } 
    @Override
    public void actionPerformed(ActionEvent evento) {
        v.IniciarThread(v);
    }
}
