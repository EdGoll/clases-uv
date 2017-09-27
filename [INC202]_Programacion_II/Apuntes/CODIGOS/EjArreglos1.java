/*Este metodo retorna un arreglo int [] de N_TAMANO elementos 
 inicializados en orden decreciente de N_TAMANO a 1 	 */
static int[] remplir3(int nb) {
int[] tab = new int[nb];
for (int i = 0, j = nb; i < nb; i++, j--) {
tab[i] = j;}
return tab;    }

/*Este metodo retorna un arreglo int [] de N_TAMANO elementos inicializados aleatoreamente*/
static int[] remplir4(int nb) {
int r;
int [] tab = new int[nb];
for (int i = 0; i < nb; i++){
r= (int) (Math.random()*10);
tab[i]=r;}
return tab;}

/*Este metodo retorna un arreglo int [] de arg.lentgh elementos ingresados por teclado*/
static int[] remplir5() {
int r;
Scanner kyb=new Scanner(System.in);
System.out.println("Cuantos valores desea ingresar? ");
int cantValores = kyb.nextInt();
int [] tab = new int[cantValores];
for (int i = 0; i < cantValores; i++){
System.out.print("Ingrese el valor entero numero "+i+" : ");
tab[i]= kyb.nextInt();}
return tab;}