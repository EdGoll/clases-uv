package Ej_04;

import java.util.Random;

public class NumAleatorio {

	private Integer limite;
	private Random rand = new Random();
	
	public NumAleatorio(Integer limite) {
		this.limite=limite;
	}
	
	public Integer crearNumeroAleatorio() {
		return rand.nextInt(limite) + 1;
	}

}
