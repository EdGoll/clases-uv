public void actionPerformed(ActionEvent ev){
if (ev.getSource()==txtLargo) setLargo();
if (ev.getSource()==txtAncho) setAncho();
if (ev.getSource()==ovalo) panDib.setOvalo(ovalo.isSelected());
if (ev.getSource()==rectangulo) panDib.setRectangulo(rectangulo.isSelected());
panDib.repaint();}

public void focusLost (FocusEvent e){
if (e.getSource() == txtLargo){setLargo();
System.out.println("perdida de foco en largo");
panDib.repaint();}
if (e.getSource() == txtAncho){setAncho();
System.out.println("perdida de foco en ancho");
panDib.repaint();}}

public void focusGained (FocusEvent e){}

