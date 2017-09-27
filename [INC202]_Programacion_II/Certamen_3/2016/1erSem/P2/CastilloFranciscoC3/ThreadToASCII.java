public class ThreadToASCII extends Thread {

    //Declaracion de variables
    private String palabra;
    View v;

    public ThreadToASCII(View v, String palabra) {
        //Se instancian los valores que entran por parametro con las variables propias de la clase
        this.palabra = palabra;
        this.v = v;
    }

    @Override
    public void run() {
        
        AAscii AA = new AAscii(palabra);//Se intancia la clase y se envia el parametro
        String palabraTraducida = AA.cambioAscii();//Se llama al metodo que realiza la traduccion y retorna la palabra traducida
        v.mostrarPalabra(palabraTraducida);//Se utiliza metodo de la clase View para mostrar la palabra en el JTextArea
        try {
            Thread.sleep(4000);//Duerme la hebra
        } catch (InterruptedException ex) {
            
        }
    }
}
