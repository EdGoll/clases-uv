import java.util.Scanner;

public class Funcionario {
    
    public String horarioConsulta(){
        String academico;
        Scanner sc = new Scanner(System.in);
        System.out.println("Su horario laboral es : ");
        academico=sc.nextLine();
        return academico;
    }
}
