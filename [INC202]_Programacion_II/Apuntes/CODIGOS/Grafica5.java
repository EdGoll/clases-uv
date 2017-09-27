class Ventana extends JFrame implements MouseListener
public Ventana (){
setTitle("Ventana con click");
setBounds(10,20,300,200);
addMouseListener(this); //la ventana sera su propio
//escuchador de eventos Mouse

public void mouseClicked(MouseEvent ev){ 
//metodo para click 

}
public void mousePressed(MouseEvent ev){...}
public void mouseReleased(MouseEvent ev){...}
public void mouseEntered(MouseEvent ev){...}
public void mouseExited(MouseEvent ev){...}}