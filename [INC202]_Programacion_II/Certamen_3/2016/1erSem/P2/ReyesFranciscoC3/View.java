



import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class View extends JFrame implements ActionListener{
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle,panelOut,panelBtn;
    private JScrollPane scroll ;
    
    public View (){
        super("Gui + Threads");
    }
    
    public void start(){
        out = new JTextArea(80,30);
        processBtn = new JButton("inicio");
        processBtn.addActionListener(this);
        scroll = new JScrollPane(out);
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        panelOut.add(scroll);
        add(scroll,BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        add(panelBtn,BorderLayout.SOUTH);
        scroll.setViewportView(out);
        
        pack();
        setSize(380, 400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
          
    	@Override
	public void actionPerformed(ActionEvent evento) {
                    ThreadToMorse  ttm = new ThreadToMorse(this);
                    ThreadToASCII tta = new ThreadToASCII(this);
                        ttm.start();
                        tta.start();
                    
	}

        
        public synchronized String frase(){ 
            String palabra=" ";
            palabra= RandomWord.generate();
            palabra = palabra.toUpperCase();
            return palabra;
        }
}
