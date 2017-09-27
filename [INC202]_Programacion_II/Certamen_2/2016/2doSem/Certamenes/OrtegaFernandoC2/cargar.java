
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;
import java.util.Scanner;

    
public class cargar {
    private List<String> lineas;
    private StringTokenizer st;
    private int h=0,alguien,hora;
    
    public cargar(){
        cargente();
    }
    public void cargente(){
        Scanner sc = new Scanner(System.in);
        Academico ac = null;
        Alumno a = null;
        lineas = FuenteDatos.leerArchivo("Region.txt");
        while(h==0)
        {
            System.out.println("1)academico 2)alumno 3)funcionario");
            alguien=sc.nextInt();
            switch (alguien) {
                case 1:
                      agregaralumno alu =new agregaralumno();
                      alu.llenar();
                    break;
                case 2:
                    AgregarAc aca =new AgregarAc();
                    aca.llenar();
                    break;
                default:
                      AgregarFc fc =new AgregarFc();
                      fc.llenar();  
                break;
            }
            System.out.println("desea ingresar otra 1)si 2)no");
            this.hora = sc.nextInt();
            if(hora==2){
                h=1;
            }
        }
    }
}

