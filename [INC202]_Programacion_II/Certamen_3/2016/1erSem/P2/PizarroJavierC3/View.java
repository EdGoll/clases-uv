
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {

    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    ThreadToMorse t1morse;
    ThreadToASCII t2ascii;
    private JScrollPane sc;
    private RandomWord r;

    public View() {
        super("GUI + Threads");
    }

    public void start() {
        out = new JTextArea(80, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        sc = new JScrollPane();

        setLayout(new BorderLayout());
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        sc.setViewportView(panelOut.add(out));
        processBtn.addActionListener(new accion(this));
        add(sc, BorderLayout.WEST);
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        setSize(380, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    class accion implements ActionListener {

        private View view;

        public accion(View view) {
            this.view = view;
        }

        @Override
        public void actionPerformed(ActionEvent ev) {
            view.startt(view);
        }
    }

    public void startt(View view) {
        r = new RandomWord();
        t1morse = new ThreadToMorse(view, r);
        t1morse.start();
        t2ascii = new ThreadToASCII(view, r);
        t2ascii.start();
    }

    public synchronized void Write(String letra) {
        out.append("\n" + letra + "\n");
    }

    public class ThreadToMorse extends Thread {

        private final View view;
        private RandomWord rnd;

        public ThreadToMorse(View view, RandomWord rnd) {
            this.view = view;
            this.rnd = rnd;
        }
        Traductor t = new Traductor();

        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1100);
                    view.Write("Traduccion Morse: " + t.morse(rnd.generate().toUpperCase()));
                } catch (Exception e) {
                }
            }
        }

    }

    public class ThreadToASCII extends Thread {

        private final View view;
        private final RandomWord rnd;

        public ThreadToASCII(View view, RandomWord rnd) {
            this.view = view;
            this.rnd = rnd;

        }
        Traductor t = new Traductor();

        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1100);
                    view.Write("Traducciom Ascii: " + t.ascii(rnd.generate().toUpperCase()));
                } catch (Exception e) {
                }
            }
        }
    }

}
