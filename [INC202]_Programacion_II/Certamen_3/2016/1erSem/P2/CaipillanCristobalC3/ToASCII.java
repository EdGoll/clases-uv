



public class ToASCII {
		String translate2="";
		
		String[] alfabeto = {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "1", "2",
			"3", "4", "5","6", "7", "8", "9", "0"};
		
		String[] ascii={"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;",
				"&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;",
				"&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;",
				"&#57;"};
		
		public  String  traducirAASCII(String palabra){
			translate2 = "";
	   		String pal;
	   		for(int j=0; j<palabra.length();j++){
	   				pal= String.valueOf(palabra.charAt(j));
	   				pal= pal.toUpperCase();
					for(int i=0; i<ascii.length ;i++){
						if(pal.equals(alfabeto[i])){
							translate2+=ascii[i]+" ";
						}
					}
				
				}
			return translate2;
		}
		
}
		
		
		

		

