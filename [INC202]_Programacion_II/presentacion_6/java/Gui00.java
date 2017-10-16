import javax.swing.JFrame;


public class Gui00 {
	
	public Gui00(){
		JFrame frame = new JFrame("Ejemplo 00");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui00 app = new Gui00();
	}

}
