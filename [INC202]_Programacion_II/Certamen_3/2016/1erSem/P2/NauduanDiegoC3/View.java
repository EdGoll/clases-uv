
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

    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private String texto = "";
    
    public View(){
        super ("GUI + Threads");
    }
    
    public void start(){
        out = new JTextArea(17, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle,BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        out.setLineWrap(true);
        panelOut.add(new JScrollPane(out));
        add(panelOut, BorderLayout.CENTER);
        
        processBtn.addActionListener((ActionListener) this);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380, 410);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                
        ThreadToMorse ttm = new ThreadToMorse(this);
        ThreadToASCII tta = new ThreadToASCII(this);
        ttm.start();
        tta.start();
    }

    public synchronized void escribir(String codigo){
        
        texto+=codigo+"\n";
        out.setText(texto);
        out.update(out.getGraphics());
    }
}
