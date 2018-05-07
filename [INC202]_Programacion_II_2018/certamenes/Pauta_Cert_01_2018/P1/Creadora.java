public class Creadora {


	public static void main(String[] args) {
		//Instancias de personas
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		//Set de atributos para instancia de persona 1
		p1.setNombre("Pedro"); 
		p1.setApellido("Figueroa"); 
		p1.setEdad(16); 
		
		//Set de atributos para instancia de persona 2
		p2.setNombre("Juan"); 
		p2.setApellido("Godoy"); 
		p2.setEdad(20);
	
		//se ejecuta metodo comparador
  		String respEdadP1 = p1.comprarEdad();
  		String respEdadP2 = p2.comprarEdad();

  		//Salida de resultados para persona 1
  		System.out.println(p1.getNombre()+":");
  		System.out.println(respEdadP1);

  		//Salida de resultados para persona 2
  		System.out.println(p2.getNombre()+":");
  		System.out.println(respEdadP2);

	}
}