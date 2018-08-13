public class NumeroAleatorio {
    
     public int[] getArregloAleatorio(int cantidad,int rango) {
        int i=0;
        int arreglo[] = new int[cantidad];
        arreglo[i]=this.getNumero(rango);
        for(i=0; i<9; i++){
        	arreglo[i]=this.getNumero(rango);
        	i=this.verificaRepetido(arreglo, i);
        }
        return arreglo;
	}

	
	public int getNumero(int rango) {
		return (int)(Math.random()*10);
	}
	
	
	private int verificaRepetido(int arreglo[],int i){
        for(int j=0; j<i; j++){
            if(arreglo[i]==arreglo[j]){
                i--;
            }
        }		
		return i;
	}
    
}
