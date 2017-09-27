import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;

public class View extends JFrame {
	public static JTextArea out;
	int RP = 0;
	private JButton processBtn;
	private JPanel panelTitle, panelOut, panelBtn;
	ThreadToASCII ASC = new ThreadToASCII();
	ThreadToMorse mor = new ThreadToMorse();
	Thread t1 = new Thread(ASC);
	Thread t2 = new Thread(mor);

	public View() {
		super("GUI + Threads");
	}

	public void start() {

		out = new JTextArea(20, 25);

		JScrollPane scrollPane = new JScrollPane(out); // se instancia un scroll
														// panell al cual se le
														// anade un text area

		processBtn = new JButton("inicio");
		panelTitle = new JPanel();
		panelOut = new JPanel();
		panelBtn = new JPanel();

		setLayout(new BorderLayout());

		panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelTitle.add(new JLabel("Concurrencia"));
		add(panelTitle, BorderLayout.NORTH);

		panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		panelOut.add(scrollPane);
		add(panelOut, BorderLayout.CENTER);
		processBtn.addActionListener(new Oyenteboton());
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelBtn.add(processBtn);
		add(panelBtn, BorderLayout.SOUTH);

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ex) {

		}

		setVisible(true);
		setSize(380, 450);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public class ThreadToMorse implements Runnable {
		private String RW;

		private final static String newline = "\n";// se creo la variable para
													// el salto de linea
		Conversor c = new Conversor();

		@Override
		public void run() {

			while (true)

				try {
					RandomWord rw = new RandomWord(); // instancia a la clase
														// que crea las palabras
					this.RW = rw.generate();
					Thread.sleep(1000);// duerme o pausa el hilo por el tiempo
										// en milisegundos
					View.Whrite(RW.toUpperCase());
					View.Whrite(c.morse(RW.toUpperCase()));
					// out.append(RW.toUpperCase() + newline);//imprime las
					// letras en el text area
					// out.append(c.morse(RW.toUpperCase()) + newline);

				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
		}

	}

	public class ThreadToASCII implements Runnable {
		private String RW;
		View v;

		private final static String newline = "\n";// se creo la variable para
													// el salto de linea
		public View t;
		Conversor c = new Conversor();

		@Override
		public void run() {

			while (true) {
				try {
					RandomWord rw = new RandomWord(); // instancia a la clase
														// que crea las palabras
					this.RW = rw.generate();
					Thread.sleep(1050);// duerme o pausa el hilo por el tiempo
										// en milisegundos
					View.Whrite(RW.toUpperCase());
					View.Whrite(c.ascci(RW.toUpperCase()));

					// out.append(RW.toUpperCase() + newline);//imprime las
					// letras en el text area
					// out.append(c.ascci(RW.toUpperCase()) + newline);

				} catch (InterruptedException ex) {

				}
			}
		}

	}

	class Oyenteboton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			RP = 1;
			t2.start();
			t1.start();

		}

	}

	public static synchronized void Whrite(String a) {// metodo sincronizado
														// para evitar que los
														// dos hilos se impriman
														// simultaneamente o
														// haya un error en la
														// informacion
		out.append(a + "\n");
	}
}
