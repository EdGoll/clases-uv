

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Interfaz extends JFrame implements ActionListener {
       
    private DefaultListModel modelo1=new DefaultListModel();
    private DefaultListModel modelo2=new DefaultListModel();
    private DefaultListModel modelo=new DefaultListModel();
    private JScrollPane scrollPane1,scrollPane2 ,scrollPane;
    private JButton Btn1 ;
    private JTextField Texto;
    private JLabel Label,Label1,Label2,Label3;
    private JList List1, List2,List;
    private String Palabra,PalabraTraducida;
    private AMorse Amorse;
    private AASCII AASCII;
    
    public Interfaz(AMorse AMorse,AASCII AASCII){
        this.Amorse=AMorse;
        this.AASCII=AASCII;
        iniciar();
    }
    private void iniciar(){
        setLayout(null);
        
        Label=new JLabel("Ingrese texto");
        Label.setBounds(20,30,100,20);
        
        Label1=new JLabel("Texto");
        Label1.setBounds(150,380,100,20);
        
        Label2=new JLabel("A Morse");
        Label2.setBounds(400,380,100,20);
        
        Label3=new JLabel("A ASCII");
        Label3.setBounds(620,380,100,20);
        
        Btn1=new JButton("Traducir");
        Btn1.setBounds(350,430,100,20);
        Btn1.addActionListener(this);
              
        Texto=new JTextField(30);
        Texto.setBounds(150,30,150,20);
        
        List =new JList();
        List.setModel(modelo);
        
        List1 =new JList();
        List1.setModel(modelo1);
        
        List2=new JList();
        List2.setModel(modelo2);
        
        scrollPane = new JScrollPane(List);
        scrollPane.setBounds(80,70,200,300);
        
        scrollPane1 = new JScrollPane(List1);
        scrollPane1.setBounds(320,70,200,300);
        
        scrollPane2 = new JScrollPane(List2);
        scrollPane2.setBounds(550,70,200,300);
        
        add(Label);
        add(Label1);
        add(Label2);
        add(Label3);
        add(Btn1);
        add(Texto);
        add(scrollPane1);
        add(scrollPane2);
        add(scrollPane);
        
        setSize(800,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void AMorse(String palabra){
        PalabraTraducida=Amorse.traducir(palabra);
        modelo1.addElement(PalabraTraducida);
        List1.setModel(modelo1);               
    }
    private void AASCII(String palabra){
        PalabraTraducida=AASCII.traducir(palabra);
        modelo2.addElement(PalabraTraducida);
        List2.setModel(modelo2);               
    }
    private void palabra(String palabra){
        modelo.addElement(palabra);
        List.setModel(modelo);   
    }
    private String  mayuscula(String palabra){
        String palabramayuscula="";
        for(int i=0;i<palabra.length();i++){
            char nn = Character.toUpperCase(palabra.charAt(i));
            palabramayuscula=palabramayuscula + nn;
        }
    return palabramayuscula;    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==Btn1){  
            if(Texto.getText().length()==0){
                JOptionPane.showMessageDialog(null,"no hay ingresado texto a traducir" ,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                Palabra=mayuscula(Texto.getText());
                AMorse(Palabra);
                AASCII(Palabra);
                palabra(Palabra);
                scrollPane1.setViewportView(List1);
                scrollPane2.setViewportView(List2);
                scrollPane.setViewportView(List);
            }
        }
                
    }
    
}
