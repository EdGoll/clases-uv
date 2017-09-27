class VentanaMia extends JFrame implements MouseListener{
	public VentanaMia (){
		setTitle("Ventana con click");
		setBounds(10,20,300,200);
		addMouseListener(this); //la ventana sera su propio
		//escuchador de eventos Mouse
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}