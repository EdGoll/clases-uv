import java.util.*;
public class Alumno{
	private int grupo1;
	private int grupo2;
	private int band = 0;
	private int totalcurso;
	private ArrayList arrayList = new ArrayList(); // Se declaran 2 ArrayList para 2 grupos de personas distintos
	private ArrayList arrayList2 = new ArrayList();
	public void TotalAlumnos(){
		Random r = new Random();
		while (band == 0){
			totalcurso = r.nextInt(40)+35; // arroja un total de alumnos mayor a 40 y menor o igual a 75
			if ((totalcurso>40) &&(totalcurso<=75)) {
				grupo1 = r.nextInt(totalcurso);
				grupo2 = totalcurso - grupo1; // Como se obtuvo el grupo1 se le debe restar al total de alumnos para poder obtener el grupo 2
				System.out.println("Total de alumnos:" + totalcurso);
				band = 1;
			}else{
				totalcurso = r.nextInt(40)+35;
				grupo2 = r.nextInt(totalcurso);
				grupo1 = totalcurso - grupo2; // Como se obtuvo el grupo1 se le debe restar al total de alumnos para poder obtener el grupo 2
				System.out.println("Total de alumnos:" + totalcurso);
				band = 1;
			}
		}
	}
	public void llenar(){
		Random r=new Random();
		int y , total = totalcurso;
		int[] var = new int[totalcurso];
		int[] resultado = new int[totalcurso];
		
		for(int x=0;x<totalcurso;x++){
		    var[x]=(x + 33);
		}
		for(int x=0;x<totalcurso;x++){
			y=r.nextInt(total);            
			resultado[x]=var[y];
			var[y]=var[total-1];
			if(x<grupo1){
				arrayList.add(new Integer(resultado[x]));
			}
			if(x>=grupo1){
				arrayList2.add(new Integer(resultado[x]));
			}
			total--;
		}
	}
	public void mostrar() {
		int g1 = 1;
		int g2 = 1;
		System.out.println("\n Grupo1 "+"Total: "+ grupo1+"\n");
		for (int x = 0; x < arrayList.size(); x++) {
			System.out.println("Alumno" +  g1 + ": " + arrayList.get(x)); // imprime el grupo 1 de alumnos
			g1++;
		}
		System.out.println("\n Grupo2 "+ "Total: " + grupo2+"\n");
		for (int x = 0; x < arrayList2.size(); x++) {
			System.out.println("Alumno " +  g2 + ": " + arrayList2.get(x)); // imprime el grupo 2 de alumnos
			g2++;
		}
	}
}