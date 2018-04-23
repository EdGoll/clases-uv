public class Creadora {


	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		p1.nombre = "Pedro";
		p1.apellido = "Figueroa";
		p1.edad = 16;
		p1.estatura = 1.85f;
		p1.peso = 70.0f;

		p2.nombre = "Juan";
		p2.apellido = "Godoy";
		p2.edad = 20;
		p2.estatura = 1.75f;
		p2.peso = 75.0f;

  		String respEdadP1 = p1.comprarEdad();
  		String respEdadP2 = p2.comprarEdad();
  		String respImcP1 = p1.comprarIMC();
  		String respImcP2 = p2.comprarIMC();

  		System.out.println(p1.nombre+":");
  		System.out.println(respEdadP1);
  		System.out.println(respImcP1);
  		System.out.println(p2.nombre+":");
  		System.out.println(respEdadP2);
  		System.out.println(respImcP2);
	}
}