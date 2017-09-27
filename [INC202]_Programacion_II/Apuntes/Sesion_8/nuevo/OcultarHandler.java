import java.awt.event.*;
public class OcultarHandler implements ActionListener
{
    private Ventana ventana;
    public OcultarHandler(Ventana ventana){
     this.ventana=ventana;
    }
    public void actionPerformed(ActionEvent ae){
        //System.out.println("se ha presionado el boton....");
        ventana.ocultar();
    }
}
