
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {

    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane panelScroll;
    private JLabel nomasafp;
    
    public View() {
        super("GUI + Threads");

    }

    public void start() {
        out = new JTextArea(14, 32);
        processBtn = new JButton("Iniciar!");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        panelScroll = new JScrollPane(out);
        setLayout(new BorderLayout());
        
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(panelScroll);
        add(panelOut, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        processBtn.addActionListener(new palabra());
        nomasafp=new JLabel(new ImageIcon("afp.jpg"));
        panelBtn.add(nomasafp);
        processBtn.setBackground(new java.awt.Color(0, 0, 0));
        processBtn.setForeground(new java.awt.Color(0, 255, 255));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);

        
        setResizable(false);
        setLocationRelativeTo(null);    ///Centrar Ventana
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class palabra implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Susurrador su = new Susurrador();   //Instancia clase con metodos synchronized y los hilos
            ThreadToMorse tm = new ThreadToMorse(su, this);     //
            ThreadToASCII ta = new ThreadToASCII(su, this);

            tm.start();
            ta.start();
           
            }
        
        //Metodo  para agregar la palabra ya traducida al JTextArea
        public void agregarTexto(String palabaTraducida) {
            out.setText(out.getText() + palabaTraducida);
        }

    }
    
}
