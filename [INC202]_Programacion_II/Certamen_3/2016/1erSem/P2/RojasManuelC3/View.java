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

public class View extends JFrame {
    
    public JTextArea out;
    private JScrollPane scroll;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    
    public View(){
        super("GUI + Threads");  
    }
    
    public void start(){
        out = new JTextArea(80,30);
        scroll = new JScrollPane(out);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
               
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(scroll);
        
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        
        
        processBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        public void processBtnActionPerformed(ActionEvent e) {
            WordToTransform wtt = new WordToTransform();
            ThreadToASCII ta = new ThreadToASCII(wtt, this);
            ThreadToMorse tm = new ThreadToMorse(wtt, this);
            ta.start();
            tm.start();
            try {
               ta.join();
               tm.join();
            } catch (Exception ex) {
            }
        }
        
    }
