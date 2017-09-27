
public class Susurrador {

    private String traduccion = "";

    public synchronized String getTradu() {
        return traduccion;  //para que las otras clases puedan obtener la traduccion
    }

    public synchronized void AMorse(String palabra) throws InterruptedException {

        AMorse am = new AMorse(palabra);    //Metodo(s) llamado por el hilo de Morse con  parametro la palabra generada, instanceando una clase AMorse, enviandole  la palabra

        this.traduccion = am.CargarTexto(palabra);  //hace variable de la clase, la palabra ya traducida
        notify();
    }

    public synchronized void AAscii(String palabra) throws InterruptedException {
        AAscii aa = new AAscii(palabra);

        this.traduccion = aa.CargarTexto(palabra);
        System.out.println(traduccion);
        notify();
    }
   
}
