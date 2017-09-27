

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;





public class View extends JFrame{
    public JTextArea out;
    public JButton processBtn;
    public JPanel panelTitle,panelOut,panelBtn;
    public JScrollPane scroll;
    public String aux;
    protected String concadenacion;

    public View(){
        super("GUI+Threads");
    }

    public void start(){
        out = new JTextArea(15,30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();

        scroll = new JScrollPane(out);

        setLayout(new BorderLayout());

        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("concurrencia"));
        add(panelTitle , BorderLayout.NORTH);

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
       // panelOut.add(out);
        add(scroll, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        processBtn.addActionListener(new OyenteBoton());
        panelBtn.add(processBtn);
        add(panelBtn , BorderLayout.SOUTH);





        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public synchronized void escribir(String R){
        //try{
        concadenacion+=R+"\n";
        out.setText(concadenacion);
        out.update(out.getGraphics());
       // }catch(Exception e){}
    }

    public class OyenteBoton implements ActionListener{
        ThreadToMorse morse;
        ThreadToASCII ASCII;

        @Override
        public void actionPerformed(ActionEvent e) {

           morse = new ThreadToMorse(new View());
           ASCII = new ThreadToASCII(new View());

            morse.start();
            ASCII.start();

        }

    }
}
