public class Persona {
	public String nombre, apellido;
	public char sexo;
	public short edad;
	public float peso, estatura;

	public String comprobarSexo(){
		if (sexo == 'h' || sexo == 'H') {
			return "Hombre";
		} if (sexo == 'm' || sexo == 'M') {
			return "Mujer";
		} else {
			return "No determinado";
		}
	} 

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

	@Override
	public String toString(){
		return nombre + " " + apellido 
		+ ", " + comprobarSexo() 
		+ ", " + comprarEdad() 
		+ " y " + comprarIMC();
	}

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();

		p1.nombre = "Jhon";
		p1.apellido = "Doe";
		p1.sexo = 'h';
		p1.edad = 16;
		p1.estatura = 1.91f;
		p1.peso = 69.0f;

		p2.nombre = "Juan";
		p2.apellido = "Perez";
		p2.sexo = 'h';
		p2.edad = 20;
		p2.estatura = 1.41f;
		p2.peso = 61.0f;

		p3.nombre = "Isabel";
		p3.apellido = "Gonzalez";
		p3.sexo = 'm';
		p3.edad = 27;
		p3.estatura = 1.61f;
		p3.peso = 50.0f;

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}