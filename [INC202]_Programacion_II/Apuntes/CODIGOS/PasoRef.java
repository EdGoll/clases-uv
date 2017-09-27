public class PasoRef{
	int unoaCero(int [] arg){
		int cont=0;
		for (int i=0;i<arg.length;i++){
			if(arg[i]==1){
				cont++;arg[i]=0;
			}}return cont;}
public static void main (String arg[]){
	int arr[]={1,3,1,1,1,3,6};
	PasoRef test = new PasoRef();
	int numUno;
	System.out.println("Valores del arreglo : ");
	for (int i=0;i<arr.length;i++){
		System.out.print(arr[i]+ "  ");}
	System.out.println("");
	numUno=test.unoaCero(arr);
	System.out.println("Cantidad de 1 = " + numUno);
	System.out.println("Valores del arreglo : ");
	for (int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"  ");}		
	System.out.println("");}}