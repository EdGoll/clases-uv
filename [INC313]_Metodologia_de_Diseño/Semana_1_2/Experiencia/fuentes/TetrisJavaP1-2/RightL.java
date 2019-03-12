import java.awt.Color;


public class RightL extends TetrisBlock{	
	public RightL(){
		//llama a constructo de padre con par‡metros conocidos
		super(new boolean[][]{
				{true, true, true}, {false, false, true}}, Color.CYAN);		
	}

}
