import java.util.Random;
import java.util.Arrays;

public class Alumno{
    private String nombre ="Manuel Hernandez 3ro";
    private String sexo = "T";
    private int identificador = 0;

    public void setIdentificador(){
        Random x = new Random();
        identificador = (x.nextInt(100)) + 1;
    }

    public int getIdentificador(){
        return identificador;
    };

    public void setNombre(String nuevo_nombre){
        nombre=nuevo_nombre;
    }

    public void setSexo(String nuevo_sexo){
        sexo=nuevo_sexo;
    }

    public void mostrarInfo(){
        System.out.print("Nombre: " + nombre);
        System.out.print(", Sexo: " + sexo);
        System.out.print(", ID: " + identificador + "\n");
    };

/*el metodo compararAlumno(), verifica si el objeto de entrada es de clase
"Alumno". Si lo es, compara si los identificadores son iguales, sino retornara
falso*/
    public boolean compararAlumno(Object c){
        if (c instanceof Alumno){
            Alumno cc = (Alumno)c;
            if (cc.identificador == this.identificador) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    };
}
