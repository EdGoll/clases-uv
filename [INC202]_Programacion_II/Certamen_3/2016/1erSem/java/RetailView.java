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

public class RetailView extends JFrame implements ActionListener {

    public JTextArea in, out;
    private JButton processBtn;
    private JPanel panelTitle, panelIn, panelOut, panelBtn;
    private JScrollPane scrollPaneIn, scrollPaneOut;

    SimulacionCliente sc;
    ThreadRetailIngreso tri;
    ThreadRetailEgreso tre;

    public RetailView() {
        super("GUI + Threads");
    }

    public void start() {

        in = new JTextArea(10, 15);
        out = new JTextArea(10, 15);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelIn = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        scrollPaneIn = new JScrollPane(in);
        scrollPaneOut = new JScrollPane(out);

        setLayout(new BorderLayout());

        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);

        panelIn.setLayout(new BorderLayout(10, 10));
        panelIn.add(new JLabel("                    IN"), BorderLayout.NORTH);
        panelIn.add(scrollPaneIn, BorderLayout.CENTER);
        add(panelIn, BorderLayout.WEST);

        panelOut.setLayout(new BorderLayout(10, 10));
        panelOut.add(new JLabel("                    OUT"), BorderLayout.NORTH);
        panelOut.add(scrollPaneOut, BorderLayout.CENTER);
        add(panelOut, BorderLayout.EAST);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        processBtn.addActionListener(this);
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);

        setSize(380, 400);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (processBtn.getText().equals("Inicio")) {
            processBtn.setText("Fin");
            sc = new SimulacionCliente();
            tri = new ThreadRetailIngreso(sc, this);
            tre = new ThreadRetailEgreso(sc, this);
            tri.start();
            tre.start();
        } else {
            processBtn.setText("Inicio");
            try {
                tri.join();
                tre.join();
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
