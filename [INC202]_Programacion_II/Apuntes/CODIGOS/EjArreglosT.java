class EjArreglosT {
	int []tab1;

    public static void main(String args[]) {
	
		EjArreglos2 obj=new EjArreglos2();
		obj.tab1=new int[5];
		obj.tab1=obj.remplir1(5);
		System.out.println(obj);
	}	
	int [] remplir1(int nb){
        for (int i = 0; i < nb; i++) {
           tab1[i] = i;
        
		System.out.println(tab1[i]);
        }return tab1;
		}
	}