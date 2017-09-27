static void operations(int[] tab) {
afficher(tab);
operation1(tab);
operation2(tab);
operation3(tab);
operation4(tab);
operation5(tab);}

/*Este metodo imprime todos los elementos del arreglo en la misma linea los 
 elementos estan separados por 2 espacios. */
static void afficher(int[] tab) {
for (int i = 0; i < tab.length; i++) {
System.out.print(tab[i]);
System.out.print("  ");}
System.out.println();  }

/*Este metodo calcula e imprime el numero de elementos de valor 9. La variable nb se 
 usa para contar los elementos encontrados, se inicializa en 0 y se incrementa en 
 el ciclo cada vez que encuentra un 9*/
static void operation1(int[] tab) {
int nb = 0;
for (int i = 0; i < tab.length; i++) {
if (tab[i] == 9)
nb++;}
System.out.println("Hay " + nb + " elementos de valor 9 en el arreglo");}

