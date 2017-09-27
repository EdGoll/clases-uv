import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
class MiVentana extends JFrame implements ActionListener {
	public MiVentana (){//constructor
		setTitle("Dibujando en el panel");
		setSize(300,150);
		Container contenido = getContentPane();
		//creo el panel para el dibujo
		panel = new Panel();
		panel.setBackground(Color.cyan);
		contenido.add(panel);
		//crear el boton "rectangulo"
		rectangulo = new JButton("Rectangulo");
		contenido.add(rectangulo, "West");
		rectangulo.addActionListener(this);
		//crear el boton "ovalo"
		ovalo = new JButton("Ovalo");
		contenido.add(ovalo, "East");
		ovalo.addActionListener(this);}
	public void actionPerformed(ActionEvent ev){
	if (ev.getSource()==rectangulo)
		panel.setRectangulo();
	if (ev.getSource()==ovalo)
			panel.setOvalo();	
		panel.repaint();}
	private Panel panel;
	private JButton rectangulo, ovalo;}

class Panel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if (ovalo) g.drawOval(80,20,120,60);
		if (rectangulo) g.drawRect(80,20,120,60);}
	public void setOvalo(){ovalo=true;rectangulo=false;}
	public void setRectangulo(){ovalo=false;rectangulo=true;}
	private boolean rectangulo=false,ovalo=false;}

public class MainPanelDibujo{
	public static void main (String args[]){
		MiVentana ven= new MiVentana();
		ven.setVisible(true);}}