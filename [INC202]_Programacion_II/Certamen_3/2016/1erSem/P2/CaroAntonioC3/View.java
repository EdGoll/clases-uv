

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
	private JPanel panelTitle ,panelOut ,panelBtn; 
	private JScrollPane scrol1 ;
	public View() {
		super("GUI + Threads");
	}
	public synchronized void ver(String a){
		try{
		out.setText(out.getText()+"\n" + a);
		}catch(Exception e){
			
		}
	}
	public void start() {
		out = new JTextArea(80,30);
		processBtn = new JButton("Inicio");
		panelTitle = new JPanel();
		panelOut = new JPanel();
		panelBtn = new JPanel();//instancion los objetos de la interfas
		scrol1 = new JScrollPane();
		setLayout(new BorderLayout(80,30));//le seteo un Layout
		
		panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10 ,10));
		panelTitle.add(new JLabel("Concurrencia"));
		add(panelTitle, BorderLayout.NORTH);
		
		panelOut.setLayout(new BorderLayout());
		out.setEditable(false);
		scrol1.setViewportView(out);
		panelOut.add(scrol1 , BorderLayout.CENTER);
		add(panelOut, BorderLayout.CENTER);
		
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10 ,10));
		processBtn.addActionListener(this);
		panelBtn.add(processBtn);
		add(panelBtn, BorderLayout.SOUTH);//agrego cada panel
		
		setSize(380,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	

@Override
public final void actionPerformed(ActionEvent ii) {
	ThreadToMorse dd = new ThreadToMorse(this);
	ThreaToASCII da = new ThreaToASCII(this);
	dd.start();
	da.start();
	
}
}
