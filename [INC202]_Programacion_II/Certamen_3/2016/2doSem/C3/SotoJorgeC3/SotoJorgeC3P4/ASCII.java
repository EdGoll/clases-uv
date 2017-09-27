

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOJE
 */
public class ASCII {
    char aux;
    String traduccion=" ";
    ASCII(String Palabra){
        for(int i=0;i<Palabra.length();i++){
                    aux=Palabra.charAt(i);
                    //If fue lo primero q se me ocurrio
                    if('A'==aux){
                        traduccion = traduccion+" &#65"; 
                    }else{
                        if('B'==aux){
                            traduccion = traduccion+" &#66"; 
                        }else{
                            if('C'==aux){
                                traduccion = traduccion+" &#67"; 
                            }else{
                                if('D'==aux){
                                    traduccion = traduccion+" &#68"; 
                                }else{
                                    if('E'==aux){
                                       traduccion = traduccion+" &#69"; 
                                    }else{
                                        if('F'==aux){
                                            traduccion = traduccion+" &#70"; 
                                        }else{
                                            if('G'==aux){
                                                traduccion = traduccion+" &#71"; 
                                            }else{       
                                                if('H'==aux){
                                                    traduccion = traduccion+" &#72"; 
                                                }else{
                                                    if('I'==aux){
                                                        traduccion = traduccion+" &#73"; 
                                                    }else{
                                                            if('J'==aux){
                                                                traduccion = traduccion+" &#74"; 
                                                            }else{    
                                                                if('K'==aux){
                                                                    traduccion = traduccion+" &#75"; 
                    }else{
                    if('L'==aux){
                        traduccion = traduccion+" &#76"; 
                    }else{    
                    if('M'==aux){
                        traduccion = traduccion+" &#77"; 
                    }else{    
                    if('N'==aux){
                        traduccion = traduccion+" &#78"; 
                    }else{    
                    if('O'==aux){
                        traduccion = traduccion+" &#79"; 
                    }else{    
                    if('P'==aux){
                        traduccion = traduccion+" &#80"; 
                    }else{    
                    if('Q'==aux){
                        traduccion = traduccion+" &#81"; 
                    }else{    
                    if('R'==aux){
                        traduccion = traduccion+" &#82"; 
                    }else{    
                    if('S'==aux){
                        traduccion = traduccion+" &#83"; 
                    }else{    
                    if('T'==aux){
                        traduccion = traduccion+" &#84"; 
                    }else{    
                    if('U'==aux){
                        traduccion = traduccion+" &#85"; 
                    }else{    
                    if('V'==aux){
                        traduccion = traduccion+" &#86"; 
                    }else{    
                    if('W'==aux){
                        traduccion = traduccion+" &#87"; 
                    }else{    
                    if('X'==aux){
                        traduccion = traduccion+" &#88"; 
                    }else{    
                    if('Y'==aux){
                        traduccion = traduccion+" &#89"; 
                    }else{    
                    if('Z'==aux){
                        traduccion = traduccion+" 90"; 
                    }else{    
                    if('0'==aux){
                        traduccion = traduccion+" &#48"; 
                    }else{    
                    if('1'==aux){
                        traduccion = traduccion+" &#49"; 
                    }else{    
                    if('2'==aux){
                        traduccion = traduccion+" &#50"; 
                    }else{
                    if('3'==aux){
                        traduccion = traduccion+" &#51"; 
                    }else{
                    if('4'==aux){
                        traduccion = traduccion+" &#52"; 
                    }else{    
                    if('5'==aux){
                        traduccion = traduccion+" &#53"; 
                    }else{    
                    if('6'==aux){
                        traduccion = traduccion+" &#54"; 
                    }else{    
                    if('7'==aux){
                        traduccion = traduccion+" &#55"; 
                    }else{    
                    if('8'==aux){
                        traduccion = traduccion+" &#56"; 
                    }else{    
                    if('9'==aux){
                        traduccion = traduccion+" &#57"; 
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
