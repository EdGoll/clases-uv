public class TestIgual{

		public static void main (String args[]){
			String str1, str2;
			str1="test operador de igualdad en objetos";
			str2=str1;
			System.out.println("Cadena 1 :"+ str1);
			System.out.println("Cadena 2 :"+ str2);
			System.out.println("Son el mismo objeto? :"+ (str1==str2));
			
			str2=new String(str1); //str2="objeto 2"; con cualquiera de estas 
			//instrucciones se rompe la referencia creada con str2=str1 
			//generando 2 objetos de tipo String : str1 y str2.
			System.out.println("Cadena 1 :"+ str1);
			System.out.println("Cadena 2 :"+ str2);
			System.out.println("Son el mismo objeto? :"+ (str1==str2));
			System.out.println("Tienen el mismo valor? :"+ str1.equals(str2));
			
		}}