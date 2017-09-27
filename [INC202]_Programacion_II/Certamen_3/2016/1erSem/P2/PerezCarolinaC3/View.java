
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;




public class View extends JFrame implements ActionListener {
	public JTextArea out;
	private JButton processBtn;
	private JPanel panelTitle, panelOut, panelBtn;

	ThreadToMorse textmorse;
	ThreadToASCII textascii;
	
		public View (){
			super ("GUI+ Threads");
			
		}
		
	public void start (){
		out = new JTextArea(80,30);
		processBtn = new JButton ("Inicio");
		panelTitle = new JPanel();
		panelOut = new JPanel();
		panelBtn = new JPanel ();
		
		 
		
		setLayout ( new BorderLayout());
		
		panelTitle.setLayout(new FlowLayout (FlowLayout.CENTER,10,10));
		panelTitle.add(new JLabel("Concurrencia"));
		add(panelTitle, BorderLayout.NORTH);
		
		panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panelOut.add(out);
	
		add(panelOut,BorderLayout.CENTER); 
		
		processBtn.addActionListener(this); 
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panelBtn.add(processBtn);
		add (panelBtn,BorderLayout.SOUTH);
		
		JScrollPane  scroll= new JScrollPane(out); // scroll
		add(scroll);
		
		
		setSize (380,400);
		setVisible (true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public void EjecutarHebras (View v){
		String palabra = RandomWord.generate();
		
		textmorse = new ThreadToMorse(palabra,this);
		
		textascii = new ThreadToASCII(palabra,this);
		
		textmorse.start();
		textascii.start();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*ThreadToASCII ascii= new ThreadToASCII();
		 ThreadToMorse 	morse = new ThreadToMorse();
		
		ascii.start();
		morse.start();
		 */
		
		
	}
	
	
	
}
