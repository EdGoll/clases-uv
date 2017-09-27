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

public class View extends JFrame implements ActionListener {

    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane ruedita;
    private ThreadToMorse ttm;
    private ThreadToASCII tta;
    private String palabra;

    public View() {
        super("GUI + Threads");
    }

    public void start() {
        out = new JTextArea(50, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        ruedita = new JScrollPane(out);

        setLayout(new BorderLayout());

        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        ruedita.add(out);
        ruedita.setViewportView(out);
        panelOut.add(ruedita);
        add(panelOut, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);

        processBtn.addActionListener(this);

        setSize(380, 200);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            
            ttm = new ThreadToMorse(this);
            ttm.start();
            tta = new ThreadToASCII(this);
            tta.start();

        
    }
}