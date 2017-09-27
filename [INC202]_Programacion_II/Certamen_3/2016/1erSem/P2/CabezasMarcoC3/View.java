
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class View extends JFrame implements ActionListener{
    public  JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane Barra;

    public View(){
        super("GUI + Threads");
    }

    public void start(){
        out = new JTextArea(80,30);
        processBtn = new JButton("Inicio");
        processBtn.addActionListener(this);
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();

        setLayout(new BorderLayout());

        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        out.setLineWrap(true);
        out.setWrapStyleWord(true);
        Barra = new JScrollPane(out,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelOut.add(Barra);
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==processBtn) {
        	
        }
    }
  
}
