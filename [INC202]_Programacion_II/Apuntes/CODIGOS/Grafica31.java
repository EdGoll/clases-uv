System.out.println("Ingrese el nuevo titulo : (0 si desea salir) ");
String titulo = leer.next();
ven.setSize(largo,ancho);
ven.setTitle(titulo);
if (color.equals("rojo")){
ven.setBackground(Color.red);}
if (color.equals("verde")){
ven.setBackground(Color.green);}
if (color.equals("azul")){
ven.setBackground(Color.blue);}
ven.setVisible(true);
if (titulo.equals("0"))
break;	}}}