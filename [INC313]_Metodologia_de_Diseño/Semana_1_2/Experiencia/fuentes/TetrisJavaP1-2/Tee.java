import java.awt.Color;


public class Tee extends TetrisBlock{	
	public Tee(){
		//llama a constructo de padre con parámetros conocidos
		super(new boolean[][]{{true, true, true}, {false, true, false}}, Color.BLUE);		
	}

}
