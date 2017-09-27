
public class humanomorse {
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
                mostrar= mostrar+".---- ";
                break;    
            case"2":
                mostrar= mostrar+"..--- ";
                break;    
            case"3":
                mostrar= mostrar+"...-- ";
                break;    
            case"4":
                mostrar= mostrar+"....- ";
                break;    
            case"5":
                mostrar= mostrar+"..... ";
                break;    
            case"6":
                mostrar= mostrar+"-.... ";
                break;    
            case"7":
                mostrar= mostrar+"--... ";
                break;    
            case"8":
                mostrar= mostrar+"---.. ";
                break;    
            case"9":
                mostrar= mostrar+"----. ";
                break;    
            case"0":
                mostrar= mostrar+"----- ";
                break;    
            case"A":
                mostrar= mostrar+".- ";
                break;
            case"B":
                mostrar= mostrar+"-... ";
                break;
             case"C":
                mostrar= mostrar+"-.-. ";
                break;    
             case"D":
                mostrar= mostrar+"-.. ";
                break;    
             case"E":
                mostrar= mostrar+". ";
                break; 
             case"F":
                mostrar= mostrar+"..-. ";
                break;
             case"G":
                mostrar= mostrar+"--. ";
                break;
            case"H":
                mostrar= mostrar+".... ";
                break;    
            case"I":
                mostrar= mostrar+".. ";
                break;    
            case"J":
                mostrar= mostrar+".--- ";
                break;
            case"K":
                mostrar= mostrar+"-.- ";
                break;    
            case"L":
                mostrar= mostrar+".-.. ";
                break;    
            case"M":
                mostrar= mostrar+"-- ";
                break;    
            case"N":
                mostrar= mostrar+"-. ";
                break;    
            case"O":
                mostrar= mostrar+"--- ";
                break;    
            case"P":
                mostrar= mostrar+".--. ";
                break;
            case"Q":
                mostrar= mostrar+"--.- ";
                break;    
            case"R":
                mostrar= mostrar+".-. ";
                break;
            case"S":
                mostrar= mostrar+"... ";
                break;    
            case"T":
                mostrar= mostrar+"- ";
                break;    
            case"U":
                mostrar= mostrar+"..- ";
                break;    
            case"V":
                mostrar= mostrar+"...- ";
                break;    
            case"W":
                mostrar= mostrar+".-- ";
                break;    
            case"X":
                mostrar= mostrar+"-..- ";
                break;    
            case"Y":
                mostrar= mostrar+"-.-- ";
                break;    
            case"Z":
                mostrar= mostrar+"--.. ";
                break;
            }
        }
        return mostrar;
    }
}
