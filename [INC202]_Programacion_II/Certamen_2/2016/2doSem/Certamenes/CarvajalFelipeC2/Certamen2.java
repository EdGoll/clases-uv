
import java.util.Scanner;

public class Certamen2 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Register r=new Register();
         FDD fdd=new FDD();
        int n;
        do{
        r.fillList();
        System.out.println("\nPresione\n1: Ingresar otra persona             2: Salir");
        n=sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        }while(n!=2);           
    
        
      }
    }
