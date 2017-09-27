/*Este metodo calcula e imprime el mayor elemento del arreglo*/
static void operation5(int[] tab) {
int max = tab[0];
for (int i = 1; i < tab.length; i++) {
if (tab[i] > max) {
max = tab[i];}}
System.out.println("El mayor elemento es : " + max);}

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
}}
