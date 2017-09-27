}
public void actionPerformed(ActionEvent event) {
if(event.getSource() == botonMas) 
{count++;} 
else {count--;} 
label.setText(Integer.toString(count));}

private int count = 0; 
private JLabel label; 
private JButton botonMenos; 
private JButton botonMas;}
public class Exemple11{
	public static void main (String args[]){
		Ejemplo ven= new Ejemplo();
		ven.setVisible(true);}}