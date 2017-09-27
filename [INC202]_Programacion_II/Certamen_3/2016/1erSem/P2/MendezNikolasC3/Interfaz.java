
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Interfaz extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	public static ThreadToMorse h1;
	public static ThreadToASCII h2;
	 
	private JButton crearh1 = new JButton("START");
	private JLabel lblh1 = new JLabel("GENERAR");
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane;
	public JTextArea t1 = new JTextArea();
	
	String text;
	
	
	public Interfaz(){
		
		setLayout(null);
		setComponent();
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	
	}

	public void setComponent(){
		
		//boton
		
		panel.setLayout(null);
		panel.setBounds(0, 0, 400, 300);
		crearh1.setBounds(140, 43, 89, 23);
		crearh1.addActionListener(this);
		panel.add(crearh1);
		
		//Label
		
		lblh1.setBounds(155, 18, 70, 14);
		panel.add(lblh1);
		
		
		// scroll txt
		scrollPane = new JScrollPane(t1);
		scrollPane.setBounds(52, 108, 266, 101);
		panel.add(scrollPane);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)  {
		//if(e.getSource().equals(crearh1)){
			h1 = new ThreadToMorse();
			h1.start();
			
			/*try {
				h1.join(); // no me funciona se pega el programa pero creo q no es necesario pq tengo el synchronized q implemente abajo
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		*/
		
			h2 = new ThreadToASCII();
			h2.start();
			/*try {
				h2.join(); // no me funciona se pega el programa
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}*/

		//}
		
	}
		
	public synchronized void escribir(String a){
		t1.append(a);
	}
	}


