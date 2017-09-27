

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
import javax.swing.ScrollPaneConstants;



public class View extends JFrame implements ActionListener {
    public  JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane scrl;
    
    public View(){
        super("GUI + Threads");
    }
    
    public void start(){
        out= new JTextArea(80,30);
        processBtn = new JButton("Inicio");
        panelTitle= new JPanel();
        panelOut= new JPanel(); 
        panelBtn= new JPanel();
        
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
        
        panelOut.add(out);
        scrl= new JScrollPane(out);
        scrl.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panelOut.add(scrl);
		out.setEditable(false);
        add(panelOut, BorderLayout.CENTER);
        
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        processBtn.addActionListener((this));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    
        @Override
        final public void actionPerformed (ActionEvent e){
            ThreadAscii th = new ThreadAscii(this);
            ThreadMorse tm = new ThreadMorse(this);
            th.start();
            tm.start();
        }
    
    
    public synchronized void write(String a){
        out.setText(out.getText() + "\n" + a);
    }
}
