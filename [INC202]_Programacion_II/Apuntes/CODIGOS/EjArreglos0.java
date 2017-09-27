import java.util.Scanner;
class EjArreglos {
	
	static final int N_TAMANO =10; 
	
    /*Este metodo retorna un arreglo int [] de n elementos 
	 inicializados en orden creciente de 0 a N_TAMANO-1	 */
	
    static int[] remplir1(int nb) {
        int[] tab = new int[nb];
        for (int i = 0; i < nb; i++) {
            tab[i] = i;}
        return tab;    }
	
	/*Este metodo retorna un arreglo int [] de N_TAMANO elementos 
	 inicializados en orden creciente a partir de 5     */
    static int[] remplir2(int nb) {
        int[] tab = new int[nb];
        for (int i = 0; i < nb; i++) {
            tab[i] = i + 5;}
        return tab;}
	