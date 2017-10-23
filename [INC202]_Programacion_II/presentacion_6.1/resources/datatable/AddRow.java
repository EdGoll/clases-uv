public void agregarFila(Persona p) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.addRow(new Object[] {
        p.getId(), p.getEdad(), p.getNivelEduc(),
        p.getActividad(), p.getRentaFija(),
        p.getLimMaxCredito(), p.getDeudaActual(),
        p.getPorcentUsoCredito(), p.getNumCompraMesActual(),
        p.getNumCompraMesActual_1(), p.getNumCompraMesActual_2(),
        p.getNumCompraMesActual_3(),  p.getEstadoActual(),
        p.getCantHistAtrasosPago(), p.getCompra()
    });

}
