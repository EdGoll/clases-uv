public void actionPerformed(ActionEvent ev) {
System.out.println("accion combo");
Object valor = combo.getSelectedItem();
System.out.println((String) valor);}

public void itemStateChanged(ItemEvent ev) {
if (ev.getStateChange() == ItemEvent.SELECTED){
System.out.println("item combo");
Object valor = combo.getSelectedItem();
System.out.println((String) valor);}}
private String [] colores= {"rojo","verde","azul","negro","blanco"};
private JComboBox combo;}

public class EjemploCombo{
	public static void main (String args[]){
		Combo ven= new Combo();
		ven.setVisible(true);}}