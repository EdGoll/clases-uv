import java.util.Scanner;
class EjArreglos {
	
	static final int N_TAMANO =10; 
	
    /*Este metodo retorna un arreglo int [] de n elementos 
	 inicializados en orden creciente de 0 a N_TAMANO-1	 */
	
    static int[] remplir1(int nb) {
        int[] tab = new int[nb];
        for (int i = 0; i < nb; i++) {
            tab[i] = i;
        }
        return tab;
    }
	
	/*Este metodo retorna un arreglo int [] de N_TAMANO elementos 
	 inicializados en orden creciente a partir de 5     */
    static int[] remplir2(int nb) {
        int[] tab = new int[nb];
        for (int i = 0; i < nb; i++) {
            tab[i] = i + 5;
        }
        return tab;
    }
	
    /*Este metodo retorna un arreglo int [] de N_TAMANO elementos 
	 inicializados en orden decreciente de N_TAMANO a 1 	 */
	static int[] remplir3(int nb) {
        int[] tab = new int[nb];
        for (int i = 0, j = nb; i < nb; i++, j--) {
            tab[i] = j;
        }
        return tab;
    }
	
	/*Este metodo retorna un arreglo int [] de N_TAMANO elementos 
	 inicializados aleatoreamente	 */
	static int[] remplir4(int nb) {
		int r;
        int [] tab = new int[nb];
		for (int i = 0; i < nb; i++){
			r= (int) (Math.random()*10);
			tab[i]=r;
		}
		  return tab;
	}
	
	
	/*Este metodo retorna un arreglo int [] de arg.lentgh elementos 
	ingresados por teclado	 */
	
	static int[] remplir5() {
		int r;
		Scanner kyb=new Scanner(System.in);
		System.out.println("Cuantos valores desea ingresar? ");
		int cantValores = kyb.nextInt();
		int [] tab = new int[cantValores];
		for (int i = 0; i < cantValores; i++){
			System.out.print("Ingrese el valor entero numero "+i+" : ");
			tab[i]= kyb.nextInt();
		}
		return tab;
	}
		
    static void operations(int[] tab) {
        afficher(tab);
        operation1(tab);
        operation2(tab);
        operation3(tab);
        operation4(tab);
        operation5(tab);
    }
	
	
    /*Este metodo imprime todos los elementos del arreglo
	 en la misma linea los elementos estan separados por
	 2 espacios.	 */
	
    static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            System.out.print("  ");
        }
        System.out.println();    // Saut de ligne a la fin de l'affichage
    }
	
    /*Este metodo calcula e imprime el numero de elementos de valor 9
	 La variable nb se usa para contar los elementos encontrados, se 
	 inicializa en 0 y se incrementa en el ciclo cada vez que encuentra
	 un 9	 */
	
    static void operation1(int[] tab) {
        int nb = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 9)
                nb++;
        }
        System.out.println("Hay " + nb + " elementos de valor 9 en el arreglo");
    }
	/*Este metodo calcula e imprime el numero de elementos que son
	 mayores que 4 o menores que 2	 */
	
	static void operation2(int[] tab) {
        int nb = 0;
        for (int i = 0; i < tab.length; i++) {
            if ((tab[i] > 4) || (tab[i] < 2))
                nb++;
        }
        System.out.println("Hay " + nb + " elementos mayores que 4 o menores que 2");
    }
	
    /*Este metodo calcula e imprime la suma de todos los elementos 
	 del arreglo     */
    static void operation3(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        System.out.println("La suma de los elementos es " + somme);
    }
	
	/*Este metodo calcula e imprime el promedio de todos los elementos 
	 del arreglo	 */
    static void operation4(int[] tab) {
        double somme = 0.0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
		
        double moyenne = somme / tab.length;
        System.out.println("El promedio de los elementos es " + moyenne);
    }
	
	/*Este metodo calcula e imprime el mayor elemento del arreglo     */
    static void operation5(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println("El mayor elemento es : " + max);
    }


	public static void main(String args[]) {
		
        // Construccion de los arreglos 
		int[] tab1 = remplir1(N_TAMANO);
        operations(tab1);
		
        int[] tab2 = remplir2(N_TAMANO);
        operations(tab2);
		
        int[] tab3 = remplir3(N_TAMANO);
        operations(tab3);
		
		int[] tab4 = remplir4(N_TAMANO);
        operations(tab4);
		
		int[] tab5 = remplir5();
        operations(tab5);
    }
	

}





