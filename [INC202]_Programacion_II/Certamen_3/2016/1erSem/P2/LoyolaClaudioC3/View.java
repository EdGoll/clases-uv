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

public class View extends JFrame{
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    public View(){
        super("GUI + threads");
    }
    public void start(){ 
        out = new JTextArea(25, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        JScrollPane scroll = new JScrollPane(out);

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
        
        processBtn.addActionListener(new actionThreads());
        
        setSize(440, 550);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public synchronized String generar(){       
        return RandomWord.generate();
    }
    class actionThreads implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e){  
            threadMorse a = new threadMorse();
            threadAscii b = new threadAscii();
            a.start();
            b.start();
    }
    }
}