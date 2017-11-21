package vista;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class DataTable extends JFrame{
	
	private	JTable table;
	
	public DataTable() {

		inicializarTabla();
		setLayout(new BorderLayout(5, 10));
		add(this.add(new JScrollPane(table)), BorderLayout.CENTER);
		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	private void inicializarTabla() {
		DefaultTableModel dtm = new DefaultTableModel(new Object[] { "id", "edad"},
				0);
		table = new JTable(dtm) {
		      public void tableChanged(TableModelEvent e) {
		          super.tableChanged(e);
		          repaint();
		      }
		};
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DataTable();
			}
		});
	}
}
