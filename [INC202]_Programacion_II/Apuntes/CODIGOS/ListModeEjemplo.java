
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListModeEjemplo extends JPanel implements ListSelectionListener {
	
	JList list;
	
	DefaultListModel model;
	String []Color;
	int counter = 15;
	
	public ListModeEjemplo() {
		setLayout(new BorderLayout());
		//model = new DefaultListModel();
		list = new JList(color);
		JScrollPane pane = new JScrollPane(list);
		JButton addButton = new JButton("Add Element");
		JButton removeButton = new JButton("Remove Element");
		addActionListener(this);
		for (int i = 0; i < 15; i++)
			color[i]=("Element " + i);
		list.addListSelectionListener(this);}
	
		//addButton.addActionListener(new ActionListener() {
			public void valueChanged(ListSelectionEvent ev){
				if (!ev.getValueIsAdjusting()){
					System.out.println("Accion sobre la lista");
					Object [] valores = lista.getSelectedValues();
					for (int i =0;i<valores.length;i++)
						System.out.println((String) valores[i]);
					String varu=((String) valores[i]);
					varu.removeElementAt(list.getSelectedIndex());
					list.addActionListener(this);
				}}
			
			
		/*	
			public void actionPerformed(ActionEvent e) {
				model.addElement("Element " + counter);
				counter++;
			}
		});
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (model.getSize() > 0)
					model.removeElementAt(0);
			}
		});
		*/
		add(pane, BorderLayout.NORTH);
		add(addButton, BorderLayout.WEST);
		add(removeButton, BorderLayout.EAST);
	}
	
	public static void main(String s[]) {
		JFrame frame = new JFrame("List Model Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ListModeEjemplo());
		frame.setSize(260, 200);
		frame.setVisible(true);
	}
}

