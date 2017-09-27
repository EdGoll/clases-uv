
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

              
public class View extends JFrame implements ActionListener {
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane scroll;
    
    
    private Thread a;
    private Thread b;
    
    RandomWord ranword = new RandomWord();
    private int i;
    
    public View(){
        super("GUI+Threads");
    }

    public void start() {
        out = new JTextArea(10,30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        scroll = new JScrollPane(out);
      
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(scroll);
        add(panelOut, BorderLayout.CENTER);
        
        setLayout(new BorderLayout());
        setVisible(true);
               
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        scroll.setViewportView(out);
 
        setSize(380,400);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        		

        
    }
   
    @Override
   
    public void actionPerformed(ActionEvent e) {
		if (e.getSource() != processBtn ){
                 
                    ThreadMorse b = new ThreadMorse("Hebra Runnable :"+i);
                    Runnable ThreadMorse = null;
                    new Thread(ThreadMorse).start();
                    i++;
                }else{
                ThreadAsci a = new ThreadAsci("Hebra Runnable :"+i);
                    a = new ThreadAsci("hebra ",this);
                    a.start();
                    i++;
                }
	}
	
	public synchronized void escribir(String a){
		processBtn.setText(a);
	}
    
}
