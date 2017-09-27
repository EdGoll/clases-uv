public class Perro extends Animal {
	public void dormir() {
		System.out.print("una vuelta, ");
		super.dormir(); // reutiliza funcionalidad del padre
	}
}
