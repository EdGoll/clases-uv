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






