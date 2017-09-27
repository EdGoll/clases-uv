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

	public JTextArea out;
	private JButton processBtn;
	private JPanel panelTitle, panelOut, panelBtn;
	
	public View() {
		super("GUI + Threads");
	}
	
	public void start(){
		out = new JTextArea(17, 30);
		processBtn = new JButton("Inicio");
		panelTitle = new JPanel();
		panelOut = new JPanel();
		panelBtn = new JPanel();
		
		setLayout(new BorderLayout());
		
		panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelTitle.add(new JLabel("Concurrencia"));
		add(panelTitle, BorderLayout.NORTH);
		
		panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0 ,0));
		JScrollPane scrllOut = new JScrollPane(out, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelOut.add(scrllOut);
		add(panelOut, BorderLayout.CENTER);
		
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		processBtn.addActionListener(this);
		panelBtn.add(processBtn);
		add(panelBtn, BorderLayout.SOUTH);
		
		setSize(380, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public synchronized void agregarLinea(String linea){
		out.append(linea+"\n");
	}
	
	public synchronized String peticion(){
		return RandomWord.generate();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ThreadToASCII threadToASCII = new ThreadToASCII("Proceso ASCII",this);
		ThreadToMorse threadToMorse = new ThreadToMorse("Proceso Morse",this);
		threadToASCII.start();
		threadToMorse.start();
	}

}
