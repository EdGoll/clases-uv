
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


public class View extends JFrame implements ActionListener{

    RandomWord rnd;
    private ThreadToMorse tm;
    private ThreadToASCII ta;
    private JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane scroll; 
    
    public View(){
        super("GUI + Threads");
    }
    
    public synchronized void start(){
                
        out = new JTextArea(80,30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut= new JPanel();
        panelBtn = new JPanel();
        scroll = new JScrollPane(out);
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));        
        panelOut.add(scroll);
        add(scroll,BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        add(panelBtn,BorderLayout.SOUTH);
        scroll.setViewportView(out);
//        scroll.getVerticalScrollBar().setUnitIncrement(10);
        
        processBtn.addActionListener(this);
        
        setSize(380,400);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
        
    }
    
    @Override
        public void actionPerformed(ActionEvent evento){
            rnd = new RandomWord();
            String palabra = RandomWord.generate();
            if (evento.getSource()== processBtn){
                
                tm = new ThreadToMorse(this);
                ta= new ThreadToASCII(this);
                
                tm.start();
                ta.start();
        
//                try {
//                     tm.join();
//                     ta.join();
//                } catch (InterruptedException ex) {
//            
//                }
            }
        }
        
    public synchronized String palabra(){
        String word = rnd.generate();
        return word;
    }  
        
    public synchronized void morse(String traduccion){
        out.append(traduccion + System.getProperty("line.separator"));


    }
    public synchronized void ASCII(String traduccion){
        out.append(traduccion + System.getProperty("line.separator"));
    }

}
