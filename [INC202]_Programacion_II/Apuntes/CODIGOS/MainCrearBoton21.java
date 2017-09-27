public void actionPerformed(ActionEvent ev){
System.out.print("Estado de los botones : ");
for (int i=0;i<tabBoton.length;i++)
System.out.print(tabBoton[i].isEnabled() + "  ");
System.out.println();
JButton fuente = (JButton) ev.getSource();
System.out.println("Ahora desactivamos el boton " + fuente.getActionCommand());
fuente.setEnabled(false);	}
private JButton tabBoton[];}
public class Main1CrearBoton2{
	public static void main (String arg[]){
		Scanner kyd=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de botones");
		int nbotones=kyd.nextInt();
		VentBotonDin1 venBD=new VentBotonDin1(nbotones);
		venBD.setVisible(true);}}
