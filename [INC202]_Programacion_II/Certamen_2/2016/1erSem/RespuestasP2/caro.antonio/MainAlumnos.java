
public class MainAlumnos {
    public MainAlumnos(){
        NotasImp pp = new NotasImp();
        pp.leer();
        pp.promedios();
    }
    public static void main (String[] a ){
        MainAlumnos a = new MainAlumnos();
    }
}
