public class Letras1 {
	static int cont=1;
    static void Letra(){
        int a = (int)(Math.random()*(25))+97;
        
		System.out.println("Numero: "+a+" Letra: "+(char)a);
		
		for (a=a;a<123;a++){
        Dibujar(a);
		
		}
    }
    
    static void Dibujar(int a) {
		
		if (a<123){	
		for(int i=0;i<cont;i++){
				if((a+i)<123)
					System.out.print( (char)(a+i) +" ");
			}
			System.out.println();
			cont++;}
			}


	public static void main(String[] args) {
        Randoms();
    }
}
