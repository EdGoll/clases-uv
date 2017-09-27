/*En la clase Principal se ejecuta el codigo y se imprime el total
de alumnos y el resultado de la separacion, mostrando la id de cada alumno
en su respectivo grupo*/
public class Principal{
	public static void main(String [] args){
		Lista nueva = new Lista();
		System.out.println("total alumnos: "+nueva.totalalumnos);
		System.out.println();
		nueva.generarid();
		nueva.separar();

		System.out.println("GrupoA: ");
		for(int i=0;i<nueva.grupoA.size();i++){
			nueva.grupoA.get(i).mostrarId();
			if (i==nueva.grupoA.size()-1){
				System.out.println("Cantidad total de GrupoA: "+(i+1));
				System.out.println();
			}
		}

		System.out.println("GrupoB: ");
		for(int i=0;i<nueva.grupoB.size();i++){
			nueva.grupoB.get(i).mostrarId();
			if (i==nueva.grupoB.size()-1){
				System.out.println("Cantidad total de GrupoB: "+(i+1));
			}
		}
	}
}