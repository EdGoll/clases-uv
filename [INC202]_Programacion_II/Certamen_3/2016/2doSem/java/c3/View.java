import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame {

    private JTextField id = new JTextField(32), nombre = new JTextField(32), apellido = new JTextField(32);
    private JButton boton = new JButton("Validar");
    private JPanel panelTitulo = new JPanel(), panelBtn = new JPanel(), panelForm = new JPanel();

    public View() {
        super("View");
    }

    public void inicio() {
        setLayout(new BorderLayout());

        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitulo.add(new JLabel("Registro de datos"));
        add(panelTitulo, BorderLayout.NORTH);

        panelForm.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelForm.add(new JLabel("ID Persona:"));
        panelForm.add(id);
        panelForm.add(new JLabel("Nombre:    "));
        panelForm.add(nombre);
        panelForm.add(new JLabel("Apellidos:  "));
        panelForm.add(apellido);
        add(panelForm, BorderLayout.CENTER);

        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        boton.addActionListener(new ProcessListener());
        panelBtn.add(boton);
        add(panelBtn, BorderLayout.SOUTH);

        setSize(480, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class ProcessListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID Vacio", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nombre Vacio", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (apellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Apellido Vacio", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        View v = new View();
        v.inicio();
    }
}