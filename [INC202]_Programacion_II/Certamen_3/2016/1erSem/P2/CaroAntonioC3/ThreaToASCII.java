

public class ThreaToASCII extends Thread{
	private View hh;
	private String li , palabra;
	private String salida;
	public ThreaToASCII(View b) {
	this.hh = b;	
	}
	private String yy(String a){
		String b = "";
		char[] letra = new char[a.length()];
		int i=0;
		while(i < a.length()){
		 letra[i] = a.charAt(i);
		 i++;
		}
		i=0;
		while(i < a.length()){
		b = b + codificar(Character.toUpperCase(letra[i]));
		i++;
		}
		return b;
	}
	@Override
public void run() {
		
		while(true){
			for(;;){
				try {
					palabra = RandomWord.generate();
					li = yy(palabra);
					salida = li + "de la palabra :  "+palabra;
					mostarOut();
					try{
					Thread.sleep(1000);}
					catch (Exception e) {
						
					}
				} catch (Exception e) {
				}
			}
		}
	}	
	 public void mostarOut() {
		 System.out.println(salida);
		 		 hh.ver(salida);
	 }
		private String codificar(char letra) {
	        switch (letra){
	            
	            case 'A':  
	                return "&#65";
	            case 'B':
	                return "&#66";
	            case 'C' :
	                return "&#67";
	            case 'D' :
	                return "&#68";
	            case 'E' :
	                return "&#69";
	            case 'F' :
	                return "&#70";
	            case 'G' :
	                return "&#71";
	            case 'H' :
	                return "&#72";
	            case 'I' :
	                return "&#73";
	            case 'J' :
	                return "&#74";
	            case 'K' : 
	                return "&#75";
	            case 'L' :
	                return "&#76";
	            case 'M' :
	                return "&#77";
	            case 'N' :
	                return "&#78";
	            case 'O' :
	                return "&#79";
	            case 'P' :
	                return "&#80";
	            case 'Q': 
	                return "&#81";
	            case 'R' : 
	                return "&#82";
	            case 'S' : 
	                return "&#83";
	            case 'T' :
	                return "&#84";
	            case 'U' :  
	                return "&#85";
	            case 'V' :
	                return "&#86";
	            case 'W' :
	                return "&#87";
	            case 'X' :
	                return "&#88";
	            case 'Y' :
	                return "&#89";
	            case 'Z' :
	                return "&#90";
	            case '0' :
	                return "&#48";
	            case '1' :
	                return "&#49";
	            case '2' :
	                return "&#50";
	            case '3' :
	                return "&#51";
	            case '4' :
	                return "&#52";
	            case '5' :
	                return "&#53";
	            case '6' :
	                return "&#54";
	            case '7' :
	                return "&#55";
	            case '8' :
	                return "&#56";
	            case '9' :
	                return "&#57";    
	            default :           
	                return ":C";
	     
	    } 
	       
	    }
	}


