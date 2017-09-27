
//para partes del codigo es necesario importar y tener un paquete llamado "paquete"

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
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
        super("GUI + Threads");
        //añadido para transformar a mayuscula palabra
        String palabra=null, palabra2=null; 
        palabra = paquete.RandomWord.generate();
        palabra2 = palabra.toUpperCase();
        
        
        //añadido para uso de hilos
       
        Thread ThreadToMorse = new Procesos("ThreadToMorse");
        ThreadToMorse.start();
        
        Thread ThreadToASCII = new Procesos("ThreadToASCII");          
        ThreadToASCII.start();
        
        
        //añadido para mostrar la interfaz
        setVisible(true);
    }
    
    public void start(){
        out = new JTextArea(80, 30);
        
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER); 
        
        //agrega los scroll
        JScrollPane Scroll;
        Scroll = new JScrollPane(out,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(Scroll);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize(380, 400);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
  /*  
    //Al presionar el boton
    public void actionPerformed(ActionEvent e){
        int a=1,b=1;
        
        if(e.getSource()==processBtn){
            //
            if(a=1){
                e = new ThreadToMorse ("ThreadToMorse"); 
                e.start();
            }
            if(b=1){
                c = new ThreadToASCII ("ThreadToASCII"); 
                new Thread(c).start();
            }
            
        }
    }


*/
