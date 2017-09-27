public void actionPerformed(ActionEvent ev) {
System.out.println("accion combo - ");
Object valor = combo.getSelectedItem();
int rango = combo.getSelectedIndex();
if (rango==-1){
System.out.println("ingreso de un nuevo valor " + valor);
combo.addItem(valor);}
else {
System.out.println("selecciona un valor existente " + valor + "de rango " + rango);}
}

private String [] colores= {"rojo","verde","azul","negro","blanco"};
private JComboBox combo;}

public class EjemploComboDin{
	public static void main (String args[]){
		Combo ven= new Combo();
		ven.setVisible(true);}}