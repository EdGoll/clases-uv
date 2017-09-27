import java.util.Scanner;
//Clase que contiene el Menu principal del programa
public class Menu {
    int a=0;
    String b="0"; 
    Scanner Scan = new Scanner(System.in);
    
    public void PartirPrograma(){
        while(a==0){
            
            System.out.println("\n\n\nSistema de Registro, para personas de la Escula \n");
            System.out.println("Ingrese 1 para agregar persona o ingrese cualquier letra o numero para salir:   ");        
            b=Scan.next();
            if("1".equals(b)){
                System.out.println("\n");
                System.out.println("a");//Eliminar
                
                
            }else{
                a=1;
            }
        }
    }
    
}
