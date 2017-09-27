//Hector Toro 19.268.713-6

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	public  JTextArea out;
	private JButton processBtn;
	private JPanel panelTitle, panelOut,panelBtn;
	private JScrollPane outScroll;
	
	public View(){
		super("GUI + Threads");
	}
	
	public void start(){
		
		out 		= new JTextArea(15,30);
		processBtn 	= new JButton("Inicio");
		panelTitle	= new JPanel();
		panelOut	= new JPanel();
		panelBtn	= new JPanel();
		outScroll	= new JScrollPane(out,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		setLayout(new BorderLayout());
		
		panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelTitle.add(new JLabel("Concurrencia"));
		add(panelTitle,BorderLayout.NORTH);
		
		panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(panelOut,BorderLayout.CENTER);
		panelOut.add(outScroll);
		add(panelOut,BorderLayout.CENTER);
		
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelBtn.add(processBtn);
		add(panelBtn,BorderLayout.SOUTH);
		processBtn.addActionListener(this);
		
		setSize(380,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== processBtn){
			ThreadToASCII threadToASCII = new ThreadToASCII(this);
			ThreadToMorse threadToMorse = new ThreadToMorse(this);
			threadToMorse.start();
			threadToASCII.start();
			
		}
	}
	public synchronized  void setValor(String valor){
		//System.out.println("\n"+valor);
		out.append("\n"+valor);
	}
	public synchronized static  String generar(){
		return RandomWord.generate();
	}
}
