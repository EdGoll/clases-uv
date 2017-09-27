import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class MiVentana extends JFrame implements ActionListener,ItemListener, FocusListener{

static public final String[] nomColores=
{"cyan","rojo","verde","amarillo","azul"};
static public final Color[] colores=
	{Color.cyan,Color.red,Color.green,Color.yellow,Color.blue};

public MiVentana(){
setTitle("Figuras");
setSize(450,300);
Container contenido = getContentPane();
//panel para dibujo
panDib=new PanelDibujo();
contenido.add(panDib);
panDib.setBackground(Color.cyan);
//panel para comandos
panCom=new JPanel();
contenido.add(panCom,"South");
//elegir color
comboColorFondo=new JComboBox(nomColores);
panCom.add(comboColorFondo);
comboColorFondo.addItemListener(this);
//elegir dimensiones
JLabel dim=new JLabel("Dimensiones");
panCom.add(dim);
txtLargo = new JTextField("100",5);
txtLargo.addActionListener(this);
txtLargo.addFocusListener(this);
panCom.add(txtLargo);
txtAncho = new JTextField("100",5);
txtAncho.addActionListener(this);
txtAncho.addFocusListener(this);
panCom.add(txtAncho);
// elegir formas
ovalo = new JCheckBox("Ovalo");
panCom.add(ovalo);
ovalo.addActionListener(this);
rectangulo = new JCheckBox("Rectangulo");
panCom.add(rectangulo);
rectangulo.addActionListener(this);
setDefaultCloseOperation (EXIT_ON_CLOSE);}


public void actionPerformed(ActionEvent ev){
if (ev.getSource()==txtLargo) setLargo();
if (ev.getSource()==txtAncho) setAncho();
if (ev.getSource()==ovalo) panDib.setOvalo(ovalo.isSelected());
if (ev.getSource()==rectangulo) panDib.setRectangulo(rectangulo.isSelected());
panDib.repaint();}


public void focusLost (FocusEvent e){
if (e.getSource() == txtLargo){setLargo();
System.out.println("perdida de foco en largo");
panDib.repaint();}
if (e.getSource() == txtAncho){setAncho();
System.out.println("perdida de foco en ancho");
panDib.repaint();}}

public void focusGained (FocusEvent e){}

private void setLargo(){
String cad = txtLargo.getText();
System.out.println("largo" + cad);
panDib.setLargo(Integer.parseInt(cad));}

private void setAncho(){
String cad = txtAncho.getText();
System.out.println("ancho" + cad);
panDib.setAncho(Integer.parseInt(cad));}

public void itemStateChanged(ItemEvent e){
String color=(String) comboColorFondo.getSelectedItem();
panDib.setColor(color);}

private PanelDibujo panDib;
private JPanel panCom;
private JComboBox comboColorFondo;
private JTextField txtAncho, txtLargo;
private JCheckBox ovalo, rectangulo;
}

class PanelDibujo extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(ovalo) g.drawOval(10,10,10+largo,10+ancho);
		if(rectangulo) g.drawRect(10,10,10+largo,10+ancho);}
	public void setRectangulo (boolean b){rectangulo=b;}
	public void setOvalo (boolean b){ovalo=b;}
	public void setLargo (int l){largo=l;}
	public void setAncho (int a){ancho=a;}
	public void setColor (String c){
		for (int i=0;i<MiVentana.nomColores.length;i++)
			if(c==MiVentana.nomColores[i])
				setBackground(MiVentana.colores[i]);}
	private boolean rectangulo = false,ovalo=false;
	private int largo=50, ancho=50;}
public class Final {
	public static void main (String arg []){
		MiVentana ven=new MiVentana();
		ven.setVisible(true);
	}}
 





