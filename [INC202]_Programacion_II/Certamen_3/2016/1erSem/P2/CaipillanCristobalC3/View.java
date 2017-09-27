

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class View extends JFrame implements ActionListener{
		public JTextArea out;
		private JButton processBtn;
		private JPanel panelTitle,panelOut,panelBtn;
		
		public View(){
			super ("GUI + Threads");
		}
		public void start(){
			out =new JTextArea(15,30);
			processBtn =new JButton("Inicio");
			panelTitle=new JPanel();
			panelOut =new JPanel();
			panelBtn =new JPanel();
			processBtn.addActionListener(this);
			setLayout(new BorderLayout());
			
			//panel titulo
			panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
			panelTitle.add(new JLabel("Concurrencia"));
			add(panelTitle,BorderLayout.NORTH);
			
			//scroll
			JScrollPane scroll=new JScrollPane(out,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			panelOut.add(scroll);
			//panel out
			
			panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
			//panelOut.add(out);
			add(panelOut,BorderLayout.CENTER);
			
			//panel boton
			panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
			panelBtn.add(processBtn);
			add(panelBtn,BorderLayout.SOUTH);
			
			setSize(380,400);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==processBtn){
				ThreadToASCII a=new ThreadToASCII(this);
				
				ThreadToMorse b=new ThreadToMorse(this);
				b.start();
				a.start();
			}
		}
	
		public synchronized void llamar(String a){
				out.append("\n"+a);
		}
		
		
		
		
		
		
		
}
