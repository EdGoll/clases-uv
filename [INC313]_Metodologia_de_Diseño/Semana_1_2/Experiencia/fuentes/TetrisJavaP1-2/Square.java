import java.awt.Color;


public class Square extends TetrisBlock{	
	public Square(){
		//llama a constructo de padre con parámetros conocidos
		super(new boolean[][]{{true, true}, {true, true}}, Color.black);		
	}

}
