import java.awt.Color;


public class LeftL extends TetrisBlock{	
	public LeftL(){
		//llama a constructo de padre con parámetros conocidos
		super(new boolean[][]{{true, true, true}, {false, true, false}}, Color.BLUE);		
	}

}
