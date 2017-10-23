class EliminarBotonListener implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e){
    int row = table.getSelectedRow();
    String id = table.getModel().getValueAt(row, <Numero de columna a extraer>).toString();
    ...
  }
}
