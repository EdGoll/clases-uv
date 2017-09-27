import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CopiaTexto extends JFrame {
	private JLabel lblValor, lblCopia;
	private JButton btnCopiar;
	private JTextField txtValor, txtCopia;
	private JComboBox cbbListado;

	public CopiaTexto() {
		super("Copia Texto");
		init();
		setSize(600,70);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void init() {
		lblValor = new JLabel("Valor");
		lblCopia = new JLabel("Copia");
		btnCopiar = new JButton("Copiar");
		btnCopiar.addActionListener(new CopiarListner());
		txtValor = new JTextField(16);
		txtCopia = new JTextField(16);
		cbbListado = new JComboBox();
		llenado();
		cbbListado.addItemListener(new ListadoListener());
		setLayout(new FlowLayout());

		add(lblValor);
		add(txtValor);
		add(btnCopiar);
		add(lblCopia);
		add(txtCopia);
		add(cbbListado);
	}

	private void llenado() {
		List<String> lineas = FuenteDatos.leerArchivo("Comuna.csv");
		StringTokenizer st;
		List<Comuna> comunas = new ArrayList<>();
		Comuna c;
		if(lineas != null && !lineas.isEmpty()) {
			for (String l : lineas) {
				st = new StringTokenizer(l, ";");
				if(st.hasMoreElements()) {
					c = new Comuna();
					c.setIdComuna(st.nextToken());
					c.setNombreComuna(st.nextToken());
					c.setIdProvincia(st.nextToken());
					comunas.add(c);
				}
			}
			for (Comuna co : comunas) {
				cbbListado.addItem(co);
			}
		}
	}

	public static void main(String[] args) {
		CopiaTexto ct = new CopiaTexto();
	}

	class CopiarListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(txtValor.getText().equals("")) {
				JOptionPane.showMessageDialog(
					null,
					"Debe incluir un texto antes de copiar",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			} else {
				txtCopia.setText(txtValor.getText());
			}
		}
	}

	class ListadoListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent ie) {
			txtCopia.setText((String)cbbListado.getSelectedItem());
		}
	}
}















