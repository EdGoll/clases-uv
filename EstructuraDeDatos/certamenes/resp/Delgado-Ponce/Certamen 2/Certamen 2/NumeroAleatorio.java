public class NumeroAleatorio {
	
	//devuelve n numeros aleatorio dentro de un arreglo de largo n, 
	//donde n es el parametro cantidad y rango representa el intervalo
	//entre el cual se genraran los numeros aleatorios [0,rango]. 
	public int[] getArregloAleatorio(int cantidad,int rango) {
        int i=0;
        int arreglo[] = new int[cantidad];
        arreglo[i]=this.getNumero(rango);
        for(i=1; i<cantidad; i++){
        	arreglo[i]=this.getNumero(rango);
        	i=this.verificaRepetido(arreglo, i);
        }
        return arreglo;
	}

	//devuelve un numeros aleatorio, donde rango representa el intervalo
	//entre el cual se genraran los numeros aleatorios [0,rango].
	public int getNumero(int rango) {
		return (int)(Math.random()*rango);
	}
	
	//verifica que no exista un repetido dentro del arreglo.
	private int verificaRepetido(int arreglo[],int i){
        for(int j=0; j<i; j++){
            if(arreglo[i]==arreglo[j]){
                i--;
            }
        }		
		return i;
	}
}
