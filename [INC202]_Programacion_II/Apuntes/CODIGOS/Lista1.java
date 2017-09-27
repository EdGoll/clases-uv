
public void valueChanged(ListSelectionEvent ev){
if (!ev.getValueIsAdjusting()){
System.out.println("Accion sobre la lista");
Object [] valores = lista.getSelectedValues();
for (int i =0;i<valores.length;i++)
System.out.println((String) valores[i]);
}}

private String [] colores ={"rojo","verde","amarillo", "azul", "otro"};
private JList lista;}

public class Lista{
	public static void main (String args[]){
		MiVentana ven= new MiVentana();
		ven.setVisible(true);}}