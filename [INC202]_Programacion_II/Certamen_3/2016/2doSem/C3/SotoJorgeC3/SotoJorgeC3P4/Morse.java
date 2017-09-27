

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOJE
 */
public class Morse {
    char aux;
    String traduccion=" ";

    
    Morse(String Palabra){
        
        for(int i=0;i<Palabra.length();i++){
                    aux=Palabra.charAt(i);
                    //If fue lo primero q se me ocurrio
                    if('A'==aux){
                        traduccion = traduccion+" .-"; 
                    }else{
                        if('B'==aux){
                            traduccion = traduccion+" -..."; 
                        }else{
                            if('C'==aux){
                                traduccion = traduccion+" -.-."; 
                            }else{
                                if('D'==aux){
                                    traduccion = traduccion+" -.."; 
                                }else{
                                    if('E'==aux){
                                       traduccion = traduccion+" ."; 
                                    }else{
                                        if('F'==aux){
                                            traduccion = traduccion+" ..-."; 
                                        }else{
                                            if('G'==aux){
                                                traduccion = traduccion+" --."; 
                                            }else{       
                                                if('H'==aux){
                                                    traduccion = traduccion+" ...."; 
                                                }else{
                                                    if('I'==aux){
                                                        traduccion = traduccion+" .."; 
                                                    }else{
                                                            if('J'==aux){
                                                                traduccion = traduccion+" .---"; 
                                                            }else{    
                                                                if('K'==aux){
                                                                    traduccion = traduccion+" -.-"; 
                    }else{
                    if('L'==aux){
                        traduccion = traduccion+" .-.."; 
                    }else{    
                    if('M'==aux){
                        traduccion = traduccion+" --"; 
                    }else{    
                    if('N'==aux){
                        traduccion = traduccion+" -."; 
                    }else{    
                    if('O'==aux){
                        traduccion = traduccion+" ---"; 
                    }else{    
                    if('P'==aux){
                        traduccion = traduccion+" .--."; 
                    }else{    
                    if('Q'==aux){
                        traduccion = traduccion+" --.-"; 
                    }else{    
                    if('R'==aux){
                        traduccion = traduccion+" .-."; 
                    }else{    
                    if('S'==aux){
                        traduccion = traduccion+" ..."; 
                    }else{    
                    if('T'==aux){
                        traduccion = traduccion+" -"; 
                    }else{    
                    if('U'==aux){
                        traduccion = traduccion+" ..-"; 
                    }else{    
                    if('V'==aux){
                        traduccion = traduccion+" ...-"; 
                    }else{    
                    if('W'==aux){
                        traduccion = traduccion+" .--"; 
                    }else{    
                    if('X'==aux){
                        traduccion = traduccion+" -..-"; 
                    }else{    
                    if('Y'==aux){
                        traduccion = traduccion+" -.--"; 
                    }else{    
                    if('Z'==aux){
                        traduccion = traduccion+" --.."; 
                    }else{    
                    if('0'==aux){
                        traduccion = traduccion+" -----"; 
                    }else{    
                    if('1'==aux){
                        traduccion = traduccion+" .----"; 
                    }else{    
                    if('2'==aux){
                        traduccion = traduccion+" ..---"; 
                    }else{
                    if('3'==aux){
                        traduccion = traduccion+" ...--"; 
                    }else{
                    if('4'==aux){
                        traduccion = traduccion+" ....-"; 
                    }else{    
                    if('5'==aux){
                        traduccion = traduccion+" ....."; 
                    }else{    
                    if('6'==aux){
                        traduccion = traduccion+" -...."; 
                    }else{    
                    if('7'==aux){
                        traduccion = traduccion+" --..."; 
                    }else{    
                    if('8'==aux){
                        traduccion = traduccion+" ---.."; 
                    }else{    
                    if('9'==aux){
                        traduccion = traduccion+" ----."; 
                    }else{ 
                        System.out.println("Ingrese una palabra valida");
                        traduccion = " ";
                        break;                
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
                   
                        
        }
        
    }
    public String PalabraFinal(){
            
        return traduccion; 
    }
}
