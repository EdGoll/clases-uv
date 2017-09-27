import java.util.Scanner;

public class Academico {

    
    
    public String horarioConsulta(){
        String academico;
        Scanner sc = new Scanner(System.in);
        System.out.println("Horario de atencion es: ");
        academico=sc.nextLine();
        return academico;
    }
}
