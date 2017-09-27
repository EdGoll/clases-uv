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
		public JLabel mensaje;
		private JButton processBTN;
		private JPanel panelTitle, panelOut, panelBtn;
	
		public View(){
			super("GUI +Threads");
		}
		public void start(){
			out			=	new JTextArea(15,30);//SE CAMBIÓ EL VALOR DE 80 POR 15
			processBTN	= 	new JButton("Inicio");
			panelTitle  =	new JPanel();
			panelOut 	=	new JPanel();
			panelBtn	=	new JPanel();
			
			setSize(380,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
				/* PANEL TITULO*/
		
			panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
			panelTitle.add(new JLabel("Concurrencia"));
			add(panelTitle, BorderLayout.NORTH);
			
				/*PANEL OUT*/
		
			panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
			JScrollPane scrollPane= new JScrollPane(out, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			panelOut.add(scrollPane);
			add(panelOut, BorderLayout.CENTER);
			
				/*PANEL BOTONES*/
			
			panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
			processBTN.addActionListener(this);
			panelBtn.add(processBTN);
			add(panelBtn, BorderLayout.SOUTH);
						
			setVisible(true);//FALTABA PONER EL FRAME VISBLE
		}
		
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==processBTN) {
				ThreadToMorse a = new ThreadToMorse("ee",this);
				a.start();
				ThreadToASCII b= new ThreadToASCII("aa",this);
				b.start();
	
			}
		}
		public synchronized void escribir(String a){
			mensaje.setText(a);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new View();
		}
	}