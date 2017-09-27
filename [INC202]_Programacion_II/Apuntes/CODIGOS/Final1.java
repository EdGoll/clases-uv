public MiVentana(){
setTitle("Figuras");
setSize(450,300);
Container contenido = getContentPane();
//panel para dibujo
panDib=new PanelDibujo();
contenido.add(panDib);
panDib.setBackground(Color.cyan);
//panel para comandos
panCom=new JPanel();
contenido.add(panCom,"South");
//elegir color
comboColorFondo=new JComboBox(nomColores);
panCom.add(comboColorFondo);
comboColorFondo.addItemListener(this);
//elegir dimensiones
JLabel dim=new JLabel("Dimensiones");
panCom.add(dim);
txtLargo = new JTextField("100",5);
txtLargo.addActionListener(this);
txtLargo.addFocusListener(this);
panCom.add(txtLargo);
txtAncho = new JTextField("100",5);
txtAncho.addActionListener(this);
txtAncho.addFocusListener(this);
panCom.add(txtAncho);
