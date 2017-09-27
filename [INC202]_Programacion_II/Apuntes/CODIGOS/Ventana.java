import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent y MouseListener

class VentanaMia extends JFrame implements MouseListener{
public VentanaMia (){
setTitle("Ventana con click");
setBounds(10,20,300,200);
addMouseListener(this); //la ventana sera su propio
//escuchador de eventos Mouse
setDefaultCloseOperation(EXIT_ON_CLOSE);	
}
public void mouseClicked(MouseEvent ev){ 
//metodo para click 
System.out.println("click en la ventana");
}
public void mousePressed(MouseEvent ev){}
public void mouseReleased(MouseEvent ev){}
public void mouseEntered(MouseEvent ev){}
public void mouseExited(MouseEvent ev){}
}
public class Ventana{
public static void main (String arg[]){
VentanaMia ven=new VentanaMia();
ven.setVisible(true);
}}
