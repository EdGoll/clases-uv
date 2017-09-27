import java.util.Random;
import java.util.ArrayList;

public class Evaluaciones{

		Curso c = new Curso();



	public void evaluacion1(){
		c.crearParalelos();
		System.out.println("Ingreso de Paralelo A");
		c.mostrarA();
		System.out.println("Ingreso de Paralelo B");
		c.mostrarB();
	}


	public void evaluacion2(){
		System.out.println("Ingreso de Paralelo A");
		c.mostrarA();
		System.out.println("Ingreso de Paralelo B");
		c.mostrarB();
	}


	public void evaluacion3(){
		c.crearParalelos();
		System.out.println("Ingreso de Nuevo Paralelo A");
		c.mostrarA();
		System.out.println("Ingreso de Nuevo Paralelo B");
		c.mostrarB();
	}


}