


import javax.swing.JFrame;


public class Thread1 implements Runnable{
    
    View rd;
    RandomWord rwbl;
    
    public Thread1(View rw, RandomWord rwl){
       
        this.rd=rw;
        this.rwbl=rwl;
        
    }

  
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep((long) (1 + (int) (Math.random() * 5)) *1000);
                rd.th1(" " +Ascii(rwbl.generate().toUpperCase()));
            }catch(InterruptedException ex){
                
            }
        }
    }
    
    public static String Ascii(String ascci){
        
        String lineaAscii="";    
        for(int i=0;i<ascci.length();i++){
            
        switch(ascci.charAt(i)){
        
        case '0':
		lineaAscii= lineaAscii +"&#48";
		break;

	case '1':
		lineaAscii =lineaAscii + "&#49";
		break;

	case '2':
		lineaAscii=lineaAscii + "&#50";
		break;

	case '3':
		lineaAscii=lineaAscii + "&#51";
		break;

	case '4':
		lineaAscii=lineaAscii + "&#52";
		break;

	case '5':
		lineaAscii=lineaAscii + "&#53";
		break;

	case '6':
		lineaAscii=lineaAscii + "&#54";
		break;

	case '7':
		lineaAscii =lineaAscii + "&#55";
		break;

	case '8':
		lineaAscii= lineaAscii +"&#56";
		break;

	case '9':
		lineaAscii=lineaAscii + "&#57";
		break;

	case 'A':
		lineaAscii= lineaAscii +"&#65";
		break;

	case 'B':
		lineaAscii = lineaAscii +"&#66";
		break;

	case 'C':
		lineaAscii =lineaAscii + "&#67";
		break;

	case 'D':
		lineaAscii=lineaAscii + "&#68";
		break;

	case 'E':
		lineaAscii=lineaAscii + "&#69";
		break;

	case 'F':
		lineaAscii =lineaAscii + "&#70";
		break;

	case 'G':
		lineaAscii = lineaAscii +"&#71";
		break;

	case 'H':
		lineaAscii = lineaAscii + "&#72";
		break;

	case 'I':
		lineaAscii =lineaAscii + "&#73";
		break;

	case 'J':
		lineaAscii =lineaAscii + "&#74";
		break;

	case 'K':
		lineaAscii =lineaAscii + "&#75";
		break;

	case 'L':
		lineaAscii=lineaAscii + "&#76";
		break;

	case 'M':
		lineaAscii=lineaAscii + "&#77";
		break;

	case 'N':
		lineaAscii =lineaAscii + "&#78";
		break;

	case 'O':
		lineaAscii =lineaAscii + "&#79";
		break;

	case 'P':
		lineaAscii =lineaAscii + "&#80";
		break;

	case 'Q':
		lineaAscii =lineaAscii + "&#81";
		break;

	case 'R':
		lineaAscii =lineaAscii + "&#82";
		break;

	case 'S':
		lineaAscii=lineaAscii + "&#83";
		break;

	case 'T':
		lineaAscii=lineaAscii + "&#84";
		break;

	case 'U':
		lineaAscii =lineaAscii + "&#85";
		break;

	case 'V':
		lineaAscii =lineaAscii + "&#86";
		break;

	case 'W':
		lineaAscii=lineaAscii + "&#87";
		break;

	case 'X':
		lineaAscii =lineaAscii + "&#88";
		break;

	case 'Y':
		lineaAscii =lineaAscii + "&#89";
		break;

	case 'Z':
		lineaAscii=lineaAscii + "&#90";
		break;
        }
        }
        
        
        return lineaAscii;
    }
    
}
