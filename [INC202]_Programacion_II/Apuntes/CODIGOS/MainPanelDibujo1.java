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