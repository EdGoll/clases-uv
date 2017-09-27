import java.util.ArrayList;
import java.util.Random;
public class Lista{

	public ArrayList a = new ArrayList();
	public ArrayList b = new ArrayList();
        public ArrayList  identificadores = new ArrayList();
	public int total_alumnos;
        public int tamaarreglo;
        private int grupoazar;
        int[] lista_id;
	public static  int minimo = 40, maximo = 75;

	public void  todos_alumnos(){// puede que no sea una funcion void sino que retorne un entero 
		Random rnd = new Random();
		do{
		 this.total_alumnos = new Integer(rnd.nextInt(100) + 1);
				}while((this.total_alumnos < minimo) || (this.total_alumnos >= maximo));
	}
        public int tama_arreglo(){
            tamaarreglo = this.total_alumnos;
            return tamaarreglo;
        }
	public void genera_id_sin_repetir(){
                int [] lista_id = new int[this.total_alumnos];
		int i = 0;
		Random rand = new Random(); 
                lista_id [i]= new Integer(rand.nextInt(100) + 1);

        for(i=1; i<this.total_alumnos; i++){
 			Random rnd = new Random(); 
                        lista_id[i]= new Integer(rand.nextInt(100) + 1);
                for(int j=0; j<i; j++){
                    if(lista_id [i] == lista_id [j]){
                        i--;
                }
            }
        }
        for(int k=0; k<this.total_alumnos; k++){
            System.out.print("Alumno N° " +(k+1)+" con id "+ lista_id [k]+"\n");
        }
            }
       /* public void grupoAyB(){
           for(int p=0; p<this.total_alumnos; p++){
           Random rand1 = new Random(); 
           grupoazar = new Integer(rand1.nextInt(1));
            if (grupoazar == 0){
                a.add(lista_id[p]);
                System.out.println("Alumno "+p+" esta en la clase a");
            }
            else{
                
                b.add(lista_id[p]);
                System.out.println ("Alumno " +p+"esta en la clase b");
            }
            }
        }*/
        
    }
