
public class morsehumano {
        private String spacio=" ";
        private String lector="";
        private String recon;
        private String mostrar="";
        private int i,u=0;

    public String traductor(String objeto){
        
        while(u<objeto.length()){
            recon= objeto.substring(u,u+1);
            if(recon.equals(spacio)==false){
            lector= lector + objeto.substring(u,u+1);
            }

            if (recon.equals(spacio)==true||u==(objeto.length()-1)){

                   
                    switch (lector) {
                        case ".-":
                            mostrar= mostrar+"A";
                            break;
                        case "-...":
                            mostrar= mostrar+"B";
                            break;
                        case "-.-.":
                            mostrar= mostrar+"C";
                            break;
                        case "-..":
                            mostrar= mostrar+"D";
                            break;
                        case ".":
                            mostrar= mostrar+"E";
                            break;
                        case "..-.":
                           mostrar= mostrar+"F";
                            break;
                            case "--.":
                            mostrar= mostrar+"G";
                            break;
                        case "....":
                            mostrar= mostrar+"H";
                            break;
                        case "..":
                            mostrar= mostrar+"I";
                            break;
                        case ".---":
                            mostrar= mostrar+"J";
                            break;
                        case "-.-":
                            mostrar= mostrar+"K";
                            break;
                        case ".-..":
                            mostrar= mostrar+"L";
                            break;
                        case "--":
                            mostrar= mostrar+"M";
                            break;
                        case "-.":
                            mostrar= mostrar+"N";
                            break;
                        case "---":
                            mostrar= mostrar+"O";
                            break;
                        case ".--.":
                            mostrar= mostrar+"P";
                            break;
                        case "--.-":
                            mostrar= mostrar+"Q";
                            break;
                        case ".-.":
                            mostrar= mostrar+"R";
                            break;
                        case "...":
                            mostrar= mostrar+"S";
                            break;
                        case "-":
                            mostrar= mostrar+"T";
                            break;
                        case "..-":
                            mostrar= mostrar+"U";
                            break;
                        case "...-":
                            mostrar= mostrar+"V";
                            break;
                        case ".--":
                            mostrar= mostrar+"W";
                            break;
                        case "-..-":
                            mostrar= mostrar+"X";
                            break;
                        case "-.--":
                            mostrar= mostrar+"Y";
                            break;
                        case "--..":
                            mostrar= mostrar+"Z";
                            break;
                        case "----":
                            mostrar= mostrar+"0";
                            break;
                        case ".----":
                            mostrar= mostrar+"1";
                            break;
                        case "..---":
                            mostrar= mostrar+"2";
                            break;
                        case "...--":
                            mostrar= mostrar+"3";
                            break;
                        case "....-":
                            mostrar= mostrar+"4";
                            break;
                        case ".....":
                            mostrar= mostrar+"5";
                            break;
                        case "-....":
                            mostrar= mostrar+"6";
                            break;
                        case "--...":
                            mostrar= mostrar+"7";
                            break;
                        case "---..":
                            mostrar= mostrar+"8";
                            break;
                        case "----.":
                            mostrar= mostrar+"9";
                            break;

                        default:
                            
                            break;
                    }
                
                lector= "";
            }
           u++;
        }
        return mostrar;
    }
}

