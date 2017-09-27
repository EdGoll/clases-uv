import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaTrans extends JFrame {
	
	private JButton btnTrans, btnLimpiar;
	private JTextField txtNum;
	private JLabel lblNumRomano;

	public VistaTrans() {
		super("Transformacion");
		initComponents();
		setSize(450,75);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initComponents() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		txtNum = new JTextField(8);
		add(txtNum);
		lblNumRomano = new JLabel();
		add(lblNumRomano);
		btnTrans = new JButton("Transformar");
		btnTrans.addActionListener(new OyenteBoton());
		add(btnTrans);
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new OyenteBoton());
		add(btnLimpiar);
	}

	private void limpiar() {
		txtNum.setText("");
		lblNumRomano.setText("");
	}

	public static void main(String[] args) {
		new VistaTrans();
	}

	class OyenteBoton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource().equals(btnTrans)) {
				try {
					lblNumRomano.setText(
						NumberTrans.toRoman(Integer.parseInt(txtNum.getText())));
				} catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "El dato ingresado es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
					limpiar();
				}
			} else {
				limpiar();
			}
		}
	}
}