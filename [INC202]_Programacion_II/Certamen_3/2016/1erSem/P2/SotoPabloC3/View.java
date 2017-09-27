

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

public class  View extends JFrame implements ActionListener{
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private Thread1 t1;
    private Thread2 t2;
    private RandomWord rd;
   
    
    public View(){
        super("GUI + Threads");
    }
    
    public void start(){
       
        out = new JTextArea(80, 30);
        JScrollPane jp=new JScrollPane(out);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        processBtn.addActionListener(this);
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(jp);
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380, 400);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){

           if(e.getSource()==processBtn){
               rd=new RandomWord();
               t1=new Thread1(this,rd);
               new Thread(t1).start();
               
               t2=new Thread2(this,rd);
               new Thread(t2).start();
               
           }
        
    }
    
    protected synchronized void th1(String b){
        
       out.append(b+"\n");
        
    }
    
   
    
    
    
    
    
      
 
}