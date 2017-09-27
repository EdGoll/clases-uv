

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class View extends JFrame implements ActionListener {
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle , panelOut , panelBtn;
    private JScrollPane scroll ;
    String palabramorse,palabraASCII ;
    AMorse ThreadToMorse ;
    ASCII ThreadToASCII ;
    Random random ;
    
    public View(){
        super("GUI +Threads");
    }
    
    public void start(){
        out = new JTextArea(30,30);
        processBtn = new JButton("iniciar");
        processBtn.addActionListener(this);
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        scroll = new JScrollPane(out);
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle,BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panelOut.add(scroll);     
        out.setEditable(false);
        add(panelOut,BorderLayout.CENTER);
       
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        add(panelBtn,BorderLayout.SOUTH);
        
        setSize(500,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
                 
    }
    
    public synchronized String  mayuscula(String palabra){
        String palabramayuscula="";
        for(int i=0;i<palabra.length();i++){
            char nn = Character.toUpperCase(palabra.charAt(i));
            palabramayuscula=palabramayuscula + nn;
        }
    return palabramayuscula;    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ThreadToMorse =new AMorse("ThreadToMorse",this);
        ThreadToASCII = new ASCII("ThreadToASCII",this);  
        random= new Random();
 
        if(random.nextBoolean()==true){
            ThreadToMorse.start();
            palabramorse=ThreadToMorse.getpalabra();
            out.append(palabramorse);
            out.append("\n"); 
        }
        else{
            ThreadToASCII.start();
            palabraASCII=ThreadToASCII.getpalabra();
            out.append(palabraASCII);
            out.append("\n");
        }

    } 

}
