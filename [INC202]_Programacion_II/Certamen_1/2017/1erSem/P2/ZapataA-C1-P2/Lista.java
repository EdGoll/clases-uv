import java.util.Random;
import java.util.ArrayList;

public class Lista{
    ArrayList<Alumno> lista_general = new ArrayList<Alumno>();
    ArrayList<Alumno> lista_A = new ArrayList<Alumno>();
    ArrayList<Alumno> lista_B = new ArrayList<Alumno>();

    Random r = new Random();

    private int tamano = 41 + r.nextInt(35);

/*el metodo llenar() llena el arreglo "lista_general", con instancias de
alumnos donde sus identificadores no se repitan.*/
    public void llenar(){
        for (int i = 0; i < tamano ; i++) {
            boolean bandera = true;
            Alumno aa = new Alumno();
            aa.setNombre("AndresZapata"+i);
            aa.setSexo("H"+i);
            while(bandera == true){
                aa.setIdentificador();
                bandera = false;
                for (int j = 0;j<lista_general.size() ;j++ ) {
                    if (aa.compararAlumno(lista_general.get(j))) {
                        bandera = true;
                    }
                }
            }
            lista_general.add(aa); //si no se encuentran repeticiones se añade a lista_general
        }
    }

//el metodo mostrar(), muestra nombre, sexo, y identificador de todos los alumnos en lista_general
    public void mostrarInfo(){
        Alumno p = new Alumno();

        for(int i = 0; i<tamano; i++){
            System.out.print("\nALUMNO " + (i+1)+ " = ");
            p = lista_general.get(i);
            p.mostrarInfo();
        }
    }

/*el metodo sortearAB(), toma el ultimo objeto de lista_general y lo mueve aleatoreamente a
lista_A o lista_B*/
    public void sortearAB(){

        while( !(lista_general.isEmpty()) ){
            boolean sorteador = r.nextBoolean();
            Alumno o =new Alumno();

            o = lista_general.get(lista_general.size() - 1);
            lista_general.remove(lista_general.size()-1);

            if (sorteador == true) {
                lista_A.add(o);
            }else{
                lista_B.add(o);
            }
        }
    }

/*el metodo mostrarListas(), muestra el total de alumnos y su dispocision en cada lista*/
    public void mostrarListas(){

        System.out.println("Total alumnos: " + tamano);

        Alumno q = new Alumno();
        System.out.print("\nLista A: [" );
        for (int i = 0;i < lista_A.size() ;i++) {
            q = lista_A.get(i);
            System.out.print(" , "+ q.getIdentificador());
        }
        System.out.print("]");

        System.out.print("\nLista B: [" );
        for (int i = 0;i < lista_B.size() ;i++) {
            q = lista_B.get(i);
            System.out.print(" , "+ q.getIdentificador());
        }
        System.out.print("]\n");
    }
}
