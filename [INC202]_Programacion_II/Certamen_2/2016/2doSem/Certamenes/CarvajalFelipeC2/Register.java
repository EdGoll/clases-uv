
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Register {
    private ArrayList<Persona>listap=new ArrayList();
    
public void fillList(){//llena los datos de persona ingresados por teclado
    Scanner sc=new Scanner(System.in);
    StringTokenizer tr;
    Persona p=new Persona();
    FDD fdd=new FDD();
    String[] dom=new String[4];
    String[] wdom=new String[4];
    ArrayList aux;
    String aux2=null,aux3=null,aux4=null,aux7=null;
        System.out.println("ingrese nombre de la persona");
        p.setNombre(sc.nextLine());
        System.out.println("ingrese DNI de "+p.getNombre());
        p.setDni(sc.nextLine());
        System.out.println("ingrese edad de "+p.getNombre());
        p.setEdad(sc.nextLine());
        
        ArrayList<String[]>region=new ArrayList();
        region=fdd.readFile("C:\\Users\\Felipe\\Documents\\Region.csv");
        System.out.println("\nIngrese region de domicilio\n\n");
        for(int i=0;i<region.size();i++){
            System.out.println(region.get(i)[1]);
            
        }
        dom[0]=sc.nextLine();
        
        for(int i=0;i<region.size();i++){
            if(dom[0].equalsIgnoreCase(region.get(i)[1])){
                aux2=region.get(i)[0];
            }
        }
       ArrayList<String[]>provincia=new ArrayList();
        provincia=fdd.readFile("C:\\Users\\Felipe\\Documents\\Provincia.csv");
        System.out.println("\nIngrese provincia de domicilio\n\n");
        
        for(int i=0;i<provincia.size();i++){
            if(provincia.get(i)[2].equalsIgnoreCase(aux2)){
               System.out.println(provincia.get(i)[1]); 
            }
        }
         dom[1]=sc.nextLine();
          for(int i=0;i<provincia.size();i++){
            if(dom[0].equalsIgnoreCase(provincia.get(i)[1])){
                aux3=provincia.get(i)[0];
            }
        }
        ArrayList<String[]>comuna=new ArrayList();
        comuna=fdd.readFile("C:\\Users\\Felipe\\Documents\\Comuna.csv");
        System.out.println("\nIngrese comuna de domicilio\n\n");
        for(int i=0;i<comuna.size();i++){
            if(comuna.get(i)[2].equalsIgnoreCase(aux3)){
               System.out.println(comuna.get(i)[1]); 
            }
        }
        dom[2]=sc.nextLine();// se llena domicilio
        
        p.setAdress(dom);
        System.out.println("Direccion de trabajo\n1:Ingresar   2: Seguir");
        int aux5=sc.nextInt();
        if(aux5==1){
            
            
          ArrayList<String[]>wregion=new ArrayList();
        wregion=fdd.readFile("C:\\Users\\Felipe\\Documents\\Region.csv");
        System.out.println("\nIngrese region de domicilio\n\n");
        for(int i=0;i<wregion.size();i++){
            System.out.println(wregion.get(i)[1]);
            
        }
        wdom[0]=sc.nextLine();
        
        for(int i=0;i<wregion.size();i++){
            if(wdom[0].equalsIgnoreCase(wregion.get(i)[1])){
                aux2=wregion.get(i)[0];
            }
        }
       ArrayList<String[]>wprovincia=new ArrayList();
        wprovincia=fdd.readFile("C:\\Users\\Felipe\\Documents\\Provincia.csv");
        System.out.println("\nIngrese provincia de domicilio\n\n");
        
        for(int i=0;i<wprovincia.size();i++){
            if(wprovincia.get(i)[2].equalsIgnoreCase(aux2)){
               System.out.println(wprovincia.get(i)[1]); 
            }
        }
         wdom[1]=sc.nextLine();
          for(int i=0;i<wprovincia.size();i++){
            if(wdom[0].equalsIgnoreCase(wprovincia.get(i)[1])){
                aux3=wprovincia.get(i)[0];
            }
        }
        ArrayList<String[]>wcomuna=new ArrayList();
        wcomuna=fdd.readFile("C:\\Users\\Felipe\\Documents\\Comuna.csv");
        System.out.println("\nIngrese comuna de domicilio\n\n");
        for(int i=0;i<wcomuna.size();i++){
            if(wcomuna.get(i)[2].equalsIgnoreCase(aux3)){
               System.out.println(wcomuna.get(i)[1]); 
                  
        }
             
}
         p.setWadress(wdom);
        }else{
            wdom[0]="null";
            wdom[1]="null";
            wdom[2]="null";
            p.setWadress(wdom);
        }
       System.out.println("\nIngrese el numero a cual corresponda el tipo de persona:\n1: Funcionario 2: Estudiante 3: Academico");
       int aux6= sc.nextInt();
       sc.nextLine();
       switch(aux6){
           case 1:
               p.setTipo("Funcionario");
               System.out.println("ingrese horario de trabajo");
               p.setAux(sc.nextLine());
               break;
           case 2:
               p.setTipo("Estudiante");
               System.out.println("ingrese ramos cursando");
               p.setAux(sc.nextLine());
               break;
       
           case 3:
               p.setTipo("Academico");
               System.out.println("ingrese horario de atencion");
               p.setAux(sc.nextLine());
                   }  
 listap.add(p);
 fdd.escribirArchivo("C:\\Users\\Felipe\\Documents\\Registro.txt", listap);
 
 
}


 public int listSize(){
     return listap.size();
 }

public Persona getPerson(int i){
    return listap.get(i);
}
    
}






