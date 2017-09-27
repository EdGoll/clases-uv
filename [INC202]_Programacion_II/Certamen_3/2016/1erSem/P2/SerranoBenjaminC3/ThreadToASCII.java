public class ThreadToASCII extends Thread {

    private String palabra;
    View vw;

    public ThreadToASCII(View vw) {

        this.palabra = RandomWord.generate();
        this.vw = vw;
    }

    @Override
    public void run() {
        while(true){
            TraductorASCII ta = new TraductorASCII(palabra);
            String palabraTraducida = ta.Traductor(palabra);
            vw.out.append(palabraTraducida + System.getProperty("line.separator"));
        }
    }
}