import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ventana extends JFrame
{
     private JTextField txtNombre= new JTextField(15);
     private JButton btnMayuscula= new JButton("Mayuscula"); 
     private JButton btnMinuscula= new JButton("Minuscula");
     private JButton btnOcultar= new JButton("Ocultar");


    public Ventana(){
        super("Mi ventana en Clases");
        distribuirComponentes();
        btnOcultar.addActionListener(new OcultarHandler(this));
        btnMayuscula.addActionListener(this.new MayusculaHandler()); 
        btnMinuscula.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             String valorN = txtNombre.getText();
             txtNombre.setText(valorN.toLowerCase());
            }
        
        }); 
        pack();
    }
   
    
    private class MayusculaHandler implements ActionListener{
    
    public void actionPerformed(ActionEvent ae){
        //System.out.println("se ha presionado el boton....");
        String valorN = txtNombre.getText();
        txtNombre.setText(valorN.toUpperCase());
    }
    
    
    }
    private void distribuirComponentes(){
        setLayout(new FlowLayout());
        add(new JLabel("Nombre   :"));
        add(txtNombre );
        add(btnMayuscula );
        add(btnMinuscula );
        add(btnOcultar );
    
    }
    public void mostrar(){
       setVisible(true);
       }
    public void ocultar(){
        setVisible(false);
    }
}
