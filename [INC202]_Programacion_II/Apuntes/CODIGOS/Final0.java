import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class MiVentana extends JFrame implements ActionListener,ItemListener, FocusListener{

static public final String[] nomColores=
{"cyan","rojo","verde","amarillo","azul"};
static public final Color[] colores=
	{Color.cyan,Color.red,Color.green,Color.yellow,Color.blue};
