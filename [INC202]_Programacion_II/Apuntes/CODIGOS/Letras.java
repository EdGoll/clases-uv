
public class Letras {

    public static int cont=1;
    
    static void Randoms(){
        int a = (int)(Math.random()*(122-97))+97;
        
		System.out.println("Numero: "+a+" Letra: "+(char)a);
		
        Dibujar(a);
    }
    
    static void Dibujar(int a) {
        if(a<123)
		{
		for(int i=0;i<cont;i++){
            if((a+i)<123)
            System.out.print( (char)(a+i) +" ");
        }
        System.out.println();
        cont++;
        Dibujar(a+1);
		}}


	public static void main(String[] args) {
        Randoms();
    }
}
