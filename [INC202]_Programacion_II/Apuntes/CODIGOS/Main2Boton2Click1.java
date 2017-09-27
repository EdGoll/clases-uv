
public void actionPerformed(ActionEvent ev){
if (ev.getSource()== miBoton1) 
System.out.println("Accion sobre el boton 1");
if (ev.getSource()== miBoton2) 
System.out.println("Accion sobre el boton 2");}

private JButton miBoton1, miBoton2;}
public class Main2Boton2Click{
	public static void main (String arg[]){
		Ve2Boton2Click venBC=new Ve2Boton2Click ();
		venBC.setVisible(true);}}
