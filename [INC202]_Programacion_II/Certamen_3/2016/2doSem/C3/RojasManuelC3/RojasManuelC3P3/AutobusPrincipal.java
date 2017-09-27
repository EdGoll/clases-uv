public class AutobusPrincipal {

    public static void main(String[] args) {

        Autobus a = new Autobus(45);
        SubirThread i = new SubirThread(a);
        BajarThread s = new BajarThread(a);
        i.start();
        s.start();
    }

}
