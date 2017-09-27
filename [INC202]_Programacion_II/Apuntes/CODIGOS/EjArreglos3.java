/*Este metodo calcula e imprime el numero de elementos que son
 mayores que 4 o menores que 2	 */
static void operation2(int[] tab) {
int nb = 0;
for (int i = 0; i < tab.length; i++) {
if ((tab[i] > 4) || (tab[i] < 2))
nb++;}
System.out.println("Hay " + nb + " elementos mayores que 4 o menores que 2");}

/*Este metodo calcula e imprime la suma de todos los elementos del arreglo*/
static void operation3(int[] tab) {
int somme = 0;
for (int i = 0; i < tab.length; i++) {
somme = somme + tab[i];}
System.out.println("La suma de los elementos es " + somme);}

/*Este metodo calcula e imprime el promedio de todos los elementos del arreglo*/
static void operation4(int[] tab) {
double somme = 0.0;
for (int i = 0; i < tab.length; i++) {
somme = somme + tab[i];}
double moyenne = somme / tab.length;
System.out.println("El promedio de los elementos es " + moyenne);}






