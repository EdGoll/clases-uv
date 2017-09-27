import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class View extends JFrame implements ActionListener  {
	public JTextArea out;
	private JButton processBtn;
	private JPanel panelTitle,panelOut,panelBtn;
	public View() {
		super ("GUI + Threads");
	}
	public void start(){
		out= new JTextArea(15,30);
		processBtn= new JButton("Inicio");
		panelTitle = new JPanel();
		panelOut = new JPanel();
		panelBtn= new JPanel();
		
	  
		setLayout(new BorderLayout());
		panelTitle.setLayout(new  FlowLayout(FlowLayout.CENTER,10,10));
		panelTitle.add(new JLabel("Concurrencia "));
		add(panelTitle, BorderLayout.NORTH);
		
		panelOut.setLayout(new  FlowLayout(FlowLayout.CENTER,10,10));
		panelOut.add(out);
		add(panelOut, BorderLayout.CENTER);
		
	
		
		panelBtn.setLayout(new  FlowLayout(FlowLayout.CENTER,10,10));
		panelBtn.add(processBtn);
		add(panelBtn, BorderLayout.SOUTH);
		panelOut.add(new JScrollPane(out, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		processBtn.addActionListener(this);
		setSize(380,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
	   
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		RandomWord palabra =new RandomWord();
		String r = palabra.generate();
		ThreadToASCII myObject = new ThreadToASCII(r);
		ThreadToMorse myObject2 = new ThreadToMorse(r);
		    
		myObject.start();
		myObject2.start();	
		
	}
	public synchronized void escribir(String r){
		out.append(r+ "/n");;
	}
	
}
	

