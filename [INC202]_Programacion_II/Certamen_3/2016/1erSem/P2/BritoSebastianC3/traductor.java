
public class traductor {
	
	
	//METODO QUE TRADUCE A MORSE:
	public static String Amorse(String palabra){
		String palabra1 = palabra;
	    String traduccion="";
		
	    for(int i=1; i<=palabra1.length(); i++){  //->Esta parte es similar  a la de la tarea...
	    	switch(palabra1.charAt(i)){
	    		case 'a':
	    			traduccion= traduccion +".- ";
	    		break;
	    		case 'b':
	    			traduccion= traduccion +"-... ";
	    		break;
	    		case 'c':
	    			traduccion= traduccion +"-.-. ";
	    		break;
	    		case 'd':
	    			traduccion= traduccion +"-.. ";
	    		break;
	    		case 'e':
	    			traduccion= traduccion +". ";
	    		break;
	    		case 'f':
	    			traduccion= traduccion +"..-. ";
	    		break;
	    		case 'g':
	    			traduccion= traduccion +"--. ";
	    		break;
	    		case 'h':
	    			traduccion= traduccion +"... . ";
	    		break;
	    		case 'i':
	    			traduccion= traduccion +".. ";
	    		break;
	    		case 'j':
	    			traduccion= traduccion +".--- ";
	    		break;
	    		case 'k':
	    			traduccion= traduccion +"-.- ";
	    		break;
	    		case 'l':
	    			traduccion= traduccion +".-.. ";
	    		break;
	    		case 'm':
	    			traduccion= traduccion +"-- ";
	    		break;
	    		case 'n':
	    			traduccion= traduccion +"-. ";
	    		break;
	    		case 'o':
	    			traduccion= traduccion +"--- ";
	    		break;
	    		case 'p':
	    			traduccion= traduccion +".--. ";
	    		break;
	    		case 'q':
	    			traduccion= traduccion +"--.- ";
	    		break;
	    		case 'r':
	    			traduccion= traduccion +".-. ";
	    		break;
	    		case 's':
	    			traduccion= traduccion +"... ";
	    		break;
	    		case 't':
	    			traduccion= traduccion +"- ";
	    		break;
	    		case 'u':
	    			traduccion= traduccion +"..- ";
	    		break;
	    		case 'v':
	    			traduccion= traduccion +"...- ";
	    		break;
	    		case 'w':
	    			traduccion= traduccion +".-- ";
	    		break;
	    		case 'x':
	    			traduccion= traduccion +"-..- ";
	    		break;
	    		case 'y':
	    			traduccion= traduccion +"-.-- ";
	    		break;
	    		case 'z':
	    			traduccion= traduccion +"--.. ";
	    		break;
	    		case '0':
	    			traduccion= traduccion +"----- ";
	    		break;
	    		case '1':
	    			traduccion= traduccion +".---- ";
	    		break;
	    		case '2':
	    			traduccion= traduccion +"..--- ";
	    		break;
	    		case '3':
	    			traduccion= traduccion +"...-- ";
	    		break;
	    		case '4':
	    			traduccion= traduccion +"....- ";
	    		break;
	    		case '5':
	    			traduccion= traduccion +"..... ";
	    		break;
	    		case '6':
	    			traduccion= traduccion +"-.... ";
	    		break;
	    		case '7':
	    			traduccion= traduccion +"--... ";
	    		break;
	    		case '8':
	    			traduccion= traduccion +"---.. ";
	    		break;
	    		case '9':
	    			traduccion= traduccion +"----.";
	    		break;
	    	}	
	    }

		return traduccion;
	    
		
	}
	
	
	//METODO QUE TRADUCE A ASCII:
	public static String Aascii(String palabra){
		String palabra1= palabra;
		String traduccion="";
			
		for(int i=1; i<=palabra1.length(); i++){ 
	    	switch(palabra1.charAt(i)){
	    		case 'a':
	    			traduccion= traduccion +"&#65; ";
	    		break;
	    		case 'b':
	    			traduccion= traduccion +"&#66; ";
	    		break;
	    		case 'c':
	    			traduccion= traduccion +"&#67; ";
	    		break;
	    		case 'd':
	    			traduccion= traduccion +"&#68; ";
	    		break;
	    		case 'e':
	    			traduccion= traduccion +"&#69; ";
	    		break;
	    		case 'f':
	    			traduccion= traduccion +"&#70; ";
	    		break;
	    		case 'g':
	    			traduccion= traduccion +"&#71; ";
	    		break;
	    		case 'h':
	    			traduccion= traduccion +"&#72; ";
	    		break;
	    		case 'i':
	    			traduccion= traduccion +"&#73; ";
	    		break;
	    		case 'j':
	    			traduccion= traduccion +"&#74; ";
	    		break;
	    		case 'k':
	    			traduccion= traduccion +"&#75; ";
	    		break;
	    		case 'l':
	    			traduccion= traduccion +"&#76; ";
	    		break;
	    		case 'm':
	    			traduccion= traduccion +"&#77; ";
	    		break;
	    		case 'n':
	    			traduccion= traduccion +"&#78; ";
	    		break;
	    		case 'o':
	    			traduccion= traduccion +"&#79; ";
	    		break;
	    		case 'p':
	    			traduccion= traduccion +"&#80; ";
	    		break;
	    		case 'q':
	    			traduccion= traduccion +"&#81; ";
	    		break;
	    		case 'r':
	    			traduccion= traduccion +"&#82; ";
	    		break;
	    		case 's':
	    			traduccion= traduccion +"&#83; ";
	    		break;
	    		case 't':
	    			traduccion= traduccion +"&#84; ";
	    		break;
	    		case 'u':
	    			traduccion= traduccion +"&#85; ";
	    		break;
	    		case 'v':
	    			traduccion= traduccion +"&#86; ";
	    		break;
	    		case 'w':
	    			traduccion= traduccion +"&#87; ";
	    		break;
	    		case 'x':
	    			traduccion= traduccion +"&#88; ";
	    		break;
	    		case 'y':
	    			traduccion= traduccion +"&#89; ";
	    		break;
	    		case 'z':
	    			traduccion= traduccion +"&#90; ";
	    		break;
	    		case '0':
	    			traduccion= traduccion +"&#48; ";
	    		break;
	    		case '1':
	    			traduccion= traduccion +"&#49; ";
	    		break;
	    		case '2':
	    			traduccion= traduccion +"&#50; ";
	    		break;
	    		case '3':
	    			traduccion= traduccion +"&#51; ";
	    		break;
	    		case '4':
	    			traduccion= traduccion +"&#52; ";
	    		break;
	    		case '5':
	    			traduccion= traduccion +"&#53; ";
	    		break;
	    		case '6':
	    			traduccion= traduccion +"&#54; ";
	    		break;
	    		case '7':
	    			traduccion= traduccion +"&#55; ";
	    		break;
	    		case '8':
	    			traduccion= traduccion +"&#56; ";
	    		break;
	    		case '9':
	    			traduccion= traduccion +"&#57; ";
	    		break;
	    	}	
	    }

		return traduccion;
		
	}
}
