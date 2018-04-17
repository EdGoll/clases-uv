public class Persona {
	public String nombre, apellido;
	public short edad;
	public float peso, estatura;


	public String comprarEdad() {
		if (edad >= 18) {
			return "Es mayor de edad";
		} else {
			return "No es mayor de edad";
		}
	}

	public String comprarIMC() {
		if (estatura > 0) {
			float imc = peso / (estatura * estatura);
			if (imc < 20.0) {
				return "Esta en bajo peso";
			} else if (imc > 24.9) {
				return "Esta con sobrepeso";
			} else {
				return "Esta en su peso ideal";
			}
		} else {
			return "No es factible el calculo";
		}
	}

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


		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}