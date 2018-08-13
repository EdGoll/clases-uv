	import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.SwingUtilities;
	import javax.swing.table.DefaultTableModel;

	public class TablaIU extends JFrame{

	    private JButton pj1;
	    private JButton pj2;
	    private JTextField[] columnas;
	    private JTable tabla;
	    private JPanel panelSuperior;
	    private JScrollPane panelScroll;
	    private JScrollPane panelScroll2;
	    private DefaultTableModel dtm;
	    
	    public TablaIU(){
	        inicializarTabla();
	        inicializarIU();
	    }
	    
	    public void inicializarTabla(){
	        dtm = new DefaultTableModel(null,new String[]{"ataque","daño"});
	        tabla = new JTable(dtm);
	    }
	    
	    public void inicializarIU(){
	        setTitle("Tabla");
	        setSize(300, 300);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        panelScroll = new JScrollPane(tabla);
	        
	        add(panelScroll,BorderLayout.CENTER);
	        
	        panelSuperior = new JPanel();
	        panelSuperior.setLayout(new GridLayout(1,2));
	        (pj1 = new JButton("Guerrero")).addActionListener(e->{
	            dtm.addRow(new String[]{columnas[0].getText(),columnas[1].getText()});
	        });
	        (pj2 = new JButton("Mago")).addActionListener(e->{
	            dtm.addRow(new String[]{columnas[0].getText(),columnas[1].getText()});
	        });
	        panelSuperior.add(pj1);
	        panelSuperior.add(pj2);
	        columnas = new JTextField[2];
	        for(int i=0;i<2;i++){
	            columnas[i] = new JTextField();
	            panelSuperior.add(columnas[i]);
	        }
	        add(panelSuperior,BorderLayout.NORTH);
	        setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new TablaIU();
	            }
	        });
	    }
	    
	}
