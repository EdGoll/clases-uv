package vista;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

import controlador.GestionDeudores;
import modelo.Persona;

public class TableExample extends JFrame{
	
	private	JTable table;
	private GestionDeudores deudores;
	MenuBar barra = new MenuBar();	
	Menu programa = new Menu("Programa");
	Menu ayuda = new Menu("Ayuda");
	Menu guardar = new Menu("Guardar");
	ButtonGroup group = new ButtonGroup();
	ItemListener itemListener;
	JPanel btnPanel;
	JPanel formPanel;
	PersonaForm perForm = new PersonaForm();
	int idPersonaActualizar=0;
	
	
	public TableExample() {
		deudores = new GestionDeudores();
		this.crearBarraMenu();
		this.crearPaneles();
		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	private void crearPaneles() {
		crearFormPersona();
		inicializarTabla();
		crearBotones() ;
		for (Persona p : deudores.getListaPersona()) {	
			agregarFila(p);
		}
		setLayout(new BorderLayout(5, 10));
		add(this.add(new JScrollPane(table)), BorderLayout.CENTER);
		add(formPanel, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.SOUTH);
	}
	
	private void crearFormPersona() {
		
		formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(8, 2, 5, 5));
		formPanel.add(new JLabel(" Edad: "));
		formPanel.add(perForm.getEdadTf() );
		formPanel.add(new JLabel(" Nivel Educacional: "));
		//formPanel.add(perForm.getNivelEducTf() );comboBoxNivelEduc
		formPanel.add(perForm.getComboBoxNivelEduc());
		formPanel.add(new JLabel(" Actividad: "));
		//formPanel.add(perForm.getActividadTf() );
		formPanel.add(perForm.getComboBoxActividad());
		formPanel.add(new JLabel(" Renta Fija: "));
		formPanel.add(perForm.getRentaFijaTf() );
		formPanel.add(new JLabel(" Lim Maximo de Credito "));
		formPanel.add(perForm.getLimMaxCreditoTf() );
		formPanel.add(new JLabel(" Deuda Actual: "));
		formPanel.add(perForm.getDeudaActualTf() );
		formPanel.add(new JLabel(" % de Uso de Credito: "));
		//formPanel.add(perForm.getPorcentUsoCreditoTf() );
		formPanel.add(perForm.getComboBoxPorcetUsoCred());
		formPanel.add(new JLabel(" N° Compras Mes Actual: "));
		formPanel.add(perForm.getNumCompraMesActualTf() );
		formPanel.add(new JLabel(" N° Compras Mes -1 : "));
		formPanel.add(perForm.getNumCompraMesActual_1Tf() );
		formPanel.add(new JLabel(" N° Compras Mes -2: "));
		formPanel.add(perForm.getNumCompraMesActual_2Tf() );
		formPanel.add(new JLabel(" N° Compras Mes -3: "));
		formPanel.add(perForm.getNumCompraMesActual_3Tf() );
		formPanel.add(new JLabel(" Estado Actual: "));
		//formPanel.add(perForm.getEstadoActualTf() );
		formPanel.add(perForm.getComboBoxEstActual());
		formPanel.add(new JLabel(" Cant de Atrasos de Pago: "));
		formPanel.add(perForm.getCantHistAtrasosPagoTf() );
		formPanel.add(new JLabel(" Compra: "));
		//formPanel.add(perForm.getCompraTf() );
		formPanel.add(perForm.getComboBoxCompra());
	}
	
	private void inicializarTabla() {
		DefaultTableModel dtm = new DefaultTableModel(new Object[] { "id", "edad", "nivelEduc", "actividad", "rentaFija",
				"limMaxCredito", "deudaActual", "porcentUsoCredito", "numCompraMesActual", "numCompraMesActual_1",
				"numCompraMesActual_2", "numCompraMesActual_3", "estadoActual", "cantHistAtrasosPago", "compra" },
				0);
		table = new JTable(dtm) {
		      public void tableChanged(TableModelEvent e) {
		          super.tableChanged(e);
		          repaint();
		      }
		};
		//llena formulario con valores seleccionados desde tabla
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
		        System.out.println(table.getSelectedRow());
		        if(table.getSelectedRow()>=0) {
		        	idPersonaActualizar = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
		            System.out.println(idPersonaActualizar);
		            Persona per = deudores.buscar(idPersonaActualizar);
		            System.out.println(per.toString());
		            perForm.setPersonaForm(per);
	        	}
	        }
	    });
	}
	
	private void crearBotones() {
		btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(1, 1, 5, 5));
		JButton btnAgregar = new JButton("Agregar");	
		btnAgregar.addActionListener(new AgregarBotonListener());
		btnPanel.add(btnAgregar);
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new EliminarBotonListener());
		btnPanel.add(btnEliminar);
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActualizarBotonListener());
		btnPanel.add(btnActualizar);	
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new LimpiarBotonListener());
		btnPanel.add(btnLimpiar);
	}

	private void crearBarraMenu() {
		setMenuBar(barra);
		barra.add(programa);
		barra.add(ayuda);
		programa.add("Nuevo");
		programa.add("Abrir");
		programa.addSeparator();
		programa.add(guardar);
		guardar.add("Guardar");
		guardar.add("Guardar Como...");
		guardar.add("Guardar Todo");
		programa.addSeparator();
		programa.add("Salir");
		ayuda.add("Ayuda General");
		ayuda.addSeparator();
		ayuda.add("Acerca de...");
	}

	public void agregarFila(Persona p) {			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { 
					p.getId(), p.getEdad(), p.getNivelEduc(), p.getActividad(), p.getRentaFija(),
					p.getLimMaxCredito(), p.getDeudaActual(), p.getPorcentUsoCredito(), p.getNumCompraMesActual(),
					p.getNumCompraMesActual_1(), p.getNumCompraMesActual_2(), p.getNumCompraMesActual_3(),
					p.getEstadoActual(), p.getCantHistAtrasosPago(), p.getCompra()
			});
		
	}

	public void actualizarTabla() {
		//table.repaint();
		//table.setModel(null);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.fireTableRowsUpdated(1, 1);
		table.repaint();
//		for (Persona p : deudores.getListaPersona()) {	
//			agregarFila(p);
//		}
	}
	
	class AgregarBotonListener implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("Agregar");
			Persona per = perForm.getPersonaForm();
			Integer ultimoIdIngresado=Integer.parseInt(table.getValueAt(table.getRowCount()-1, 0).toString()); 			
			System.out.println(ultimoIdIngresado);
			per.setId(ultimoIdIngresado+1);
			deudores.crear(per);
			agregarFila(per);
			actualizarTabla();
		}
	}
	
	class EliminarBotonListener implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e){
			int row = table.getSelectedRow();
			if(row>=0) {
				System.out.println("Eliminar row->"+row);
				String id = table.getModel().getValueAt(row, 0).toString();
				System.out.println("Eliminar->"+id);
				deudores.eliminar(Integer.parseInt(id));
				
				DefaultTableModel dm = (DefaultTableModel) table.getModel();
				dm.removeRow(row);
				dm.fireTableDataChanged();
				perForm.limpiarForm();
			}
			
		}
	}
	
	class ActualizarBotonListener implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("Actualizar");
			Persona per = perForm.getPersonaForm();	
			per.setId(idPersonaActualizar);
			deudores.actualizar(per);
						
			for(int fila=0;fila<table.getRowCount();fila++) {
				if(Integer.parseInt(table.getValueAt(fila, 0).toString())==per.getId()) {
					DefaultTableModel dm = (DefaultTableModel) table.getModel();
					dm.setValueAt(per.getEdad(), fila, 1);
					dm.setValueAt(per.getNivelEduc(), fila, 2);
					dm.setValueAt(per.getActividad(), fila, 3);
					dm.setValueAt(per.getRentaFija(), fila, 4);
					dm.setValueAt(per.getLimMaxCredito(), fila, 5);
					dm.setValueAt(per.getDeudaActual(), fila, 6);
					dm.setValueAt(per.getPorcentUsoCredito(), fila, 7);
					dm.setValueAt(per.getNumCompraMesActual(), fila, 8);
					dm.setValueAt(per.getNumCompraMesActual_1(), fila, 9);
					dm.setValueAt(per.getNumCompraMesActual_2(), fila, 10);
					dm.setValueAt(per.getNumCompraMesActual_3(), fila, 11);
					dm.setValueAt(per.getEstadoActual(), fila, 12);
					dm.setValueAt(per.getCantHistAtrasosPago(), fila, 13);
					dm.setValueAt(per.getCompra(), fila, 14);					
					break;
				}
			}
			
		}
	}	
	
	class LimpiarBotonListener implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("Limpiar");
			perForm.limpiarForm();
		}
	}	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TableExample();
			}
		});
	}
	
}