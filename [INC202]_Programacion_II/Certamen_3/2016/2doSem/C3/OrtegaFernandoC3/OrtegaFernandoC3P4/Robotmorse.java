
public class Robotmorse {
        private String spacio=";";
        private String lector="";
        private String recon;
        private String mostrar="";
        private int i,u=0;

    public String traductor(String objeto){
        
        while(u<objeto.length()){
            recon= objeto.substring(u,u+1);
            lector= lector + objeto.substring(u,u+1);

            if (recon.equals(spacio)==true){

                   
                    switch (lector) {
                        case"&#49;":
                            mostrar= mostrar+".---- ";
                            break;    
                        case"&#50;":
                            mostrar= mostrar+"..--- ";
                            break;    
                        case"&#51;":
                            mostrar= mostrar+"...-- ";
                            break;    
                        case"&#52;":
                            mostrar= mostrar+"....- ";
                            break;    
                        case"&#53;":
                            mostrar= mostrar+"..... ";
                            break;    
                        case"&#54;":
                            mostrar= mostrar+"-.... ";
                            break;    
                        case"&#55;":
                            mostrar= mostrar+"--... ";
                            break;    
                        case"&#56;":
                            mostrar= mostrar+"---.. ";
                            break;    
                        case"&#57;":
                            mostrar= mostrar+"----. ";
                            break;    
                        case"&#48;":
                            mostrar= mostrar+"----- ";
                            break;    
                        case"&#65;":
                            mostrar= mostrar+".- ";
                            break;
                        case"&#66;":
                            mostrar= mostrar+"-... ";
                            break;
                         case"&#67;":
                            mostrar= mostrar+"-.-. ";
                            break;    
                         case"&#68;":
                            mostrar= mostrar+"-.. ";
                            break;    
                         case"&#69;":
                            mostrar= mostrar+". ";
                            break; 
                         case"&#70;":
                            mostrar= mostrar+"..-. ";
                            break;
                         case"&#71;":
                            mostrar= mostrar+"--. ";
                            break;
                        case"&#72;":
                            mostrar= mostrar+".... ";
                            break;    
                        case"&#73;":
                            mostrar= mostrar+".. ";
                            break;    
                        case"&#74;":
                            mostrar= mostrar+".--- ";
                            break;
                        case"&#75;":
                            mostrar= mostrar+"-.- ";
                            break;    
                        case"&#76;":
                            mostrar= mostrar+".-.. ";
                            break;    
                        case"&#77;":
                            mostrar= mostrar+"-- ";
                            break;    
                        case"&#78;":
                            mostrar= mostrar+"-. ";
                            break;    
                        case"&#79;":
                            mostrar= mostrar+"--- ";
                            break;    
                        case"&#80;":
                            mostrar= mostrar+".--. ";
                            break;
                        case"&#81;":
                            mostrar= mostrar+"--.- ";
                            break;    
                        case"&#82;":
                            mostrar= mostrar+".-. ";
                            break;
                        case"&#83;":
                            mostrar= mostrar+"... ";
                            break;    
                        case"&#84;":
                            mostrar= mostrar+"- ";
                            break;    
                        case"&#85;":
                            mostrar= mostrar+"..- ";
                            break;    
                        case"&#86;":
                            mostrar= mostrar+"...- ";
                            break;    
                        case"&#87;":
                            mostrar= mostrar+".-- ";
                            break;    
                        case"&#88;":
                            mostrar= mostrar+"-..- ";
                            break;    
                        case"&#89;":
                            mostrar= mostrar+"-.-- ";
                            break;    
                        case"&#90;":
                            mostrar= mostrar+"--.. ";
                            break;
                    }
                
                lector= "";
            }
           u++;
        }
        return mostrar;
    }
}


