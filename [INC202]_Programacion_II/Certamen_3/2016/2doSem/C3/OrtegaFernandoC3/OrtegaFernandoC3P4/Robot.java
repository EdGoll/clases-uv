
public class Robot {
    private String spacio="";
        private String lector="";
        private String recon;
        private String mostrar="";
        private int i,u=0;
    public String letras(String objeto){
    for(i=0;i<objeto.length();i++){
        recon = objeto.substring(i,i+1);
        switch (recon) {

            case"1":
                mostrar= mostrar+"&#49;";
                break;    
            case"2":
                mostrar= mostrar+"&#50;";
                break;    
            case"3":
                mostrar= mostrar+"&#51;";
                break;    
            case"4":
                mostrar= mostrar+"&#52;";
                break;    
            case"5":
                mostrar= mostrar+"&#53;";
                break;    
            case"6":
                mostrar= mostrar+"&#54;";
                break;    
            case"7":
                mostrar= mostrar+"&#55;";
                break;    
            case"8":
                mostrar= mostrar+"&#56;";
                break;    
            case"9":
                mostrar= mostrar+"&#57;";
                break;    
            case"0":
                mostrar= mostrar+"&#48;";
                break;    
            case"A":
                mostrar= mostrar+"&#65;";
                break;
            case"B":
                mostrar= mostrar+"&#66;";
                break;
             case"C":
                mostrar= mostrar+"&#67;";
                break;    
             case"D":
                mostrar= mostrar+"&#68;";
                break;    
             case"E":
                mostrar= mostrar+"&#69;";
                break; 
             case"F":
                mostrar= mostrar+"&#70;";
                break;
             case"G":
                mostrar= mostrar+"&#71;";
                break;
            case"H":
                mostrar= mostrar+"&#72;";
                break;    
            case"I":
                mostrar= mostrar+"&#73;";
                break;    
            case"J":
                mostrar= mostrar+"&#74;";
                break;
            case"K":
                mostrar= mostrar+"&#75;";
                break;    
            case"L":
                mostrar= mostrar+"&#76;";
                break;    
            case"M":
                mostrar= mostrar+"&#77;";
                break;    
            case"N":
                mostrar= mostrar+"&#78;";
                break;    
            case"O":
                mostrar= mostrar+"&#79;";
                break;    
            case"P":
                mostrar= mostrar+"&#80;";
                break;
            case"Q":
                mostrar= mostrar+"&#81;";
                break;    
            case"R":
                mostrar= mostrar+"&#82;";
                break;
            case"S":
                mostrar= mostrar+"&#83;";
                break;    
            case"T":
                mostrar= mostrar+"&#84;";
                break;    
            case"U":
                mostrar= mostrar+"&#85;";
                break;    
            case"V":
                mostrar= mostrar+"&#86;";
                break;    
            case"W":
                mostrar= mostrar+"&#87;";
                break;    
            case"X":
                mostrar= mostrar+"&#88;";
                break;    
            case"Y":
                mostrar= mostrar+"&#89;";
                break;    
            case"Z":
                mostrar= mostrar+"&#90;";
                break;
            }
        }
        return mostrar;
    }
}

