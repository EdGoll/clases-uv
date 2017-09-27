import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class Alumno{
	private int listaA;
	private int listaB;
	private int totalcurso;
	private ArrayList arrayList = new ArrayList();
	private ArrayList arrayList2 = new ArrayList();
	public void TotalaAlumnosLista(){
		Random rnd = new Random();
		totalcurso = rnd.nextInt(40) + 35;
		listaA = rnd.nextInt(totalcurso);
		listaB = totalcurso - listaA;
		System.out.println("Total de alumnos:" + totalcurso);
		System.out.println("Total de ListaA:" + listaA);
		System.out.println("Total de ListaB:" + listaB);
	}
	public void llenarAleatorio(){
        int cons=totalcurso;
        int[] copia_resultado = new int[totalcurso];
        int[] resultado = new int[totalcurso];
        Random rnd=new Random();
        int res;
        for(int i=0;i<totalcurso;i++){
            copia_resultado[i]=i+1;
        }
        for(int i=0;i<totalcurso;i++){
            res=rnd.nextInt(cons);            
            resultado[i]=copia_resultado[res];
            copia_resultado[res]=copia_resultado[cons-1];
            if(i<listaA){
            	arrayList.add(new Integer(resultado[i]));
            }
            if(i>=listaA){
            	arrayList2.add(new Integer(resultado[i]));
            }
            cons--;
        }
	}
	public void mostrar() {
		int r = 1;
		int r2 = 1;
		System.out.println("\nLista A\n");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Integrante " +  r + " de la lista A: " + arrayList.get(i));
			r++;
		}
		System.out.println("\nLista B\n");
		for (int i = 0; i < arrayList2.size(); i++) {
			System.out.println("Integrante " +  r2 + " de la lista B:" + arrayList2.get(i));
			r2++;
		}
	}
	public static void main(String[] args){
		Alumno estudiante = new Alumno();
		estudiante.TotalaAlumnosLista();
		estudiante.llenarAleatorio();
		estudiante.mostrar();
	}
}