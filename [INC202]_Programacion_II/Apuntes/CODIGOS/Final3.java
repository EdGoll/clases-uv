private void setLargo(){
String cad = txtLargo.getText();
System.out.println("largo" + cad);
panDib.setLargo(Integer.parseInt(cad));}

private void setAncho(){
String cad = txtAncho.getText();
System.out.println("ancho" + cad);
panDib.setAncho(Integer.parseInt(cad));}

public void itemStateChanged(ItemEvent e){
String color=(String) comboColorFondo.getSelectedItem();
panDib.setColor(color);}

private PanelDibujo panDib;
private JPanel panCom;
private JComboBox comboColorFondo;
private JTextField txtAncho, txtLargo;
private JCheckBox ovalo, rectangulo;
}

