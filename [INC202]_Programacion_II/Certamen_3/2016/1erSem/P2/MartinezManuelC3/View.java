import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.OptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame{
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private String textoSuma=""; // variable que almacenará el total del texto

    public View(){
        super("GUI + Threads");
    }

    public void start(){
        
        out = new JTextArea(24,30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        JScrollPane scroll = new JScrollPane(out);

        setLayout(new BorderLayout());

        out.setEditable(false);


        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);

        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        //panelOut.add(scroll);
        add(scroll, BorderLayout.CENTER); //<-- ENTRA AQUI :D

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);

        processBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                    empezarHilos();
                    System.out.println("Hasta aqui todo bien");
            }
        });

        add(panelBtn, BorderLayout.SOUTH);
        
        setVisible(true);
        setSize(380,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
     public void empezarHilos(){ // con recursividad
        while(true){
            //ThreadToASCII tta = new ThreadToASCII(rw); 
            ThreadToMorse ttm = new ThreadToMorse(this);
            ThreadToASCII tta = new ThreadToASCII(this);
            ttm.start();
            tta.start();

            try{
                ttm.join();
                tta.join();
            }catch(Exception ex){}
        }
    }

    

    public synchronized void ingresarPalabra(String palabraRandom){
        textoSuma+=palabraRandom +"\n";
        out.setText(textoSuma);
        out.update(out.getGraphics()); //Si el JTextArea no quiere Imprimir!
        System.out.println("Supuestamente, palabra ingresada: "+palabraRandom);
    }





    


}



