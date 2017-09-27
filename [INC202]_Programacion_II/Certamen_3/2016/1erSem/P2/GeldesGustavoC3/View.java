

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame implements ActionListener{
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private ThreadToMorse vista;
    private ThreadToASCII vista2;
    private JScrollPane scroll;
    int i = 1;
    
    public View(){
        super("GUI + Threads");
    }

    public void start(){
        out = new JTextArea(80,30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        scroll = new JScrollPane();
        
        setLayout(new BorderLayout());    
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.add(out);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        scroll.setViewportView(out);
        panelOut.add(scroll);
        add(panelOut, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        processBtn.addActionListener(this);
        
        setSize(380,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    @Override
        public void actionPerformed(ActionEvent e){
            vista= new ThreadToMorse(this);
            vista.start();
            vista2= new ThreadToASCII(this);
            vista2.start();
        }
        public synchronized void escribir(String a){
		out.setText(out.getText() +"\n" + a);
	}


    
    }
    
