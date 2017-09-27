

public class ASCII extends Thread {
    
    char[] letras ={'A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
        'Y','Z','0','1','2','3','4','5','6','7','8','9'};
    
    String[] ascii ={"&#65","&#66","&#67","&#68","&#69","&#70","&#71",
        "&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80",
        "&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89",
        "&#90","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55",
        "&#56","&#57"};
    
    String palabratraducida="";
    String palabra;
    String nombre;
    RandomWord r =new RandomWord();
    View v ;
    
    public  ASCII(String nombre, View b){
       this.nombre=nombre;
       this.v=b;
        
    }
    
    private String traducir(String palabra){
        int d=0;
        for(int j=0;j<palabra.length();j++){
            for(int i=0;i<letras.length;i++){
                try{
                    if(palabra.charAt(j)==letras[i]){                    
                    palabratraducida = palabratraducida + ascii[i];   
                    }
                    d++;   
                }catch(Exception e){}
            }
        } 
        
    return palabratraducida;
    }
    
    public String getpalabra(){
    return traducir(v.mayuscula(r.generate()));
    }
    
    @Override
    public void run() {
        this.palabra = traducir(v.mayuscula(r.generate()));
    }
 
}
