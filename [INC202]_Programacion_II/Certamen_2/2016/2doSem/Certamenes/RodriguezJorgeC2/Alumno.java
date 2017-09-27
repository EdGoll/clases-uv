import java.util.Scanner;


public class Alumno {
    public String horarioConsulta(){
        String academico;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sus asignaturas son: ");
        academico=sc.nextLine();
        return academico;
    }
}
