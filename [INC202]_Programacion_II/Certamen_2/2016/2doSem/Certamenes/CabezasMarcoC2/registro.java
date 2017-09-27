import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class registro {
    //direccion archicos .csv
    String direccionRegionCsv = "";
    String direccionProvinciaCsv = "";
    String direccionComunaCsv = "";
    
    public String academico, alumno, funcionario;
    datos_herencia datos;
    private String line = System.getProperty("line.separator");
    public datos_herencia opciones_menu(){
        int aux = 0;
        Scanner sc = new Scanner(System.in);
        String dni = "", nombre = "", apellido = "", edad = "", dlc = "", dln = "", dlr = "", dlcom = "", dlp = "", dpc = "", dpn = "", dpr = "", dpcom = "", dpp = "";
             /*dlc ->direccion laboral calle
               dln ->direccion laboral numero
               dlr ->direccion laboral region
               dlcom ->direccion laboral comuna
               dlp ->direccion laboral provincia
               dpc ->direccion personal calle
               dpn ->direccion personal numero
               dpr ->direccion personal region
               dpcom ->direccion personal comuna
               dpp -> direccion personal provincia
        */
        System.out.print("Ingresar Datos personales\nIngrese DNI:\n");
        dni = sc.nextLine();
        System.out.print("Ingrese Nombre:\n");
        nombre = sc.nextLine();
        System.out.print("Ingrese Apellidos\n");
        apellido = sc.nextLine();
        System.out.print("Ingrese su edad.");
        edad = sc.nextLine();
        String auxDir = "0";
        while(aux == 0){
            System.out.print("Para ingresar Direccion personal presione 1.\nPara omitir presione 2\n");
            aux = sc.nextInt();
        }
        if(aux == 1){
            System.out.print("Ingrese Calle.\n");
            dpc = sc.nextLine();
            System.out.print("Ingrese Numero.\n");
            dpn = sc.nextLine();
            System.out.print("Ingrese opcion numerica de su region.\n");
            String texto = region();
            int cont = 0;
            for(int i = 0; i < texto.length(); i++){
                if(cont == 4 || texto.charAt(i) == '\n'){
                    System.out.print('\n');
                    cont = 0;
                }
                else if(texto.charAt(i) == ';'){
                    System.out.print(" ");
                    cont++;
                }
                else if(cont < 2){
                    System.out.print(texto.charAt(i)); 
                }
            }
            auxDir = sc.nextLine();
            cont = 0;
            String local = "";
            int j = 0;
            while(j < texto.length()){
                if(texto.charAt(j) != ';' && cont == 0 && texto.charAt(j) != '\n' ){
                    local += texto.charAt(j);
                }
                else if(texto.charAt(j) == ';' && cont < 4 && texto.charAt(j) != '\n'){
                    cont++;
                }
                else if(local.equals(auxDir) && cont == 1 && texto.charAt(j) != '\n'){
                    dpr += texto.charAt(j);
                }
                else {
                    cont = 0;
                    local = "";
                }
                j++;
            }
            System.out.println("Ingrese opcion Numerica de su provincia.");
            auxDir = sc.nextLine();
            texto = provincia();
            j = 0;
            cont = 0;
            local = "";
            int cont2 = 0;
            boolean bool = true;
            while(j < texto.length() && cont2 == 0){
                if(bool = true && cont < 3 && texto.charAt(j) != ';' && cont != 3 && texto.charAt(j) != '\n'){
                    j++;
                }
                else if(texto.charAt(j) == ';' && cont2 < 3 && texto.charAt(j) != '\n'){
                    cont++;
                    j++;
                }                
                else if(cont == 2 && texto.charAt(j) != '\n' && texto.charAt(j) == ';'){
                    local += texto.charAt(j);
                    
                }
                else if(local.equals(auxDir)){
                    
                }
                j++;
            }
        }
        else{
            dlc = null;
            dln = null;
            dlr = null;
            dlp = null;
            dlcom = null; 
        }
        
        
        aux = 0;
        while(aux == 0){
            System.out.print("Para ingresar Direccion personal presione 1.\nPara omitir presione 2\n");
            aux = sc.nextInt();
        }
        if(aux == 1){
            System.out.print("Ingrese Calle.\n");
            dpc = sc.nextLine();
            System.out.print("Ingrese Numero.\n");
            dpn = sc.nextLine();
            System.out.print("Ingrese opcion numerica de su region.\n");
            String texto = region();
            int cont = 0;
            for(int i = 0; i < texto.length(); i++){
                if(cont == 4 || texto.charAt(i) == '\n'){
                    System.out.print('\n');
                    cont = 0;
                }
                else if(texto.charAt(i) == ';'){
                    System.out.print(" ");
                    cont++;
                }
                else if(cont < 2){
                    System.out.print(texto.charAt(i)); 
                }
            }
            auxDir = sc.nextLine();
            cont = 0;
            String local = "";
            int j = 0;
            while(j < texto.length()){
                if(texto.charAt(j) != ';' && cont == 0 && texto.charAt(j) != '\n' ){
                    local += texto.charAt(j);
                }
                else if(texto.charAt(j) == ';' && cont < 4 && texto.charAt(j) != '\n'){
                    cont++;
                }
                else if(local.equals(auxDir) && cont == 1 && texto.charAt(j) != '\n'){
                    dpr += texto.charAt(j);
                }
                else {
                    cont = 0;
                    local = "";
                }
                j++;
            }
            System.out.println("Ingrese opcion Numerica de su provincia.");
            auxDir = sc.nextLine();
            texto = provincia();
            j = 0;
            cont = 0;
            local = "";
            int cont2 = 0;
            boolean bool = true;
            while(j < texto.length() && cont2 == 0){
                if(texto.charAt(j) == ';' && cont2 < 3 && texto.charAt(j) != '\n'){
                    cont++;
                }                
                else if(cont == 2 && texto.charAt(j) != '\n' && texto.charAt(j) == ';'){
                    local += texto.charAt(j);
                }
                j++;
            }
        }
        else{
            dpc = null;
            dpn = null;
            dpr = null;
            dpp = null;
            dpcom = null;
        }
        int opc;
        System.out.println("Ingrese opcion tipo de persona.\n1) Academico\n2)Alumno\n3) Funcionario\n");
        opc = sc.nextInt();
        switch(opc){
            case 1:
                System.out.print("Ingrese horario de atencion.\n");
                academico = sc.nextLine();
                alumno = null;
                funcionario = null;
            break;
            case 2:
                System.out.print("Ingrese Asignaturas que está cursando en el semestre.\n");
                alumno = sc.nextLine();
                academico = null;
                funcionario = null;
            break;
            case 3:
                System.out.print("Ingrese Horario Laboral.\n");
                funcionario = sc.nextLine();
                academico = null;
                alumno = null;
            break;
            default:
                    System.out.println("Opcion no valida.\n");
                ;
        }
        datos = new datos_herencia(dni, nombre, apellido, edad, dlc, dln, dlr, dlcom, dlp, dpc, dpn, dpr, dpcom, dpp);    
        writeFile(datos);
        return datos;
    }
    
    
    public void writeFile(datos_herencia datos){
        datos = this.datos;
        File archivo = new File("datos.txt");
        if(!archivo.exists()){
            try{
                archivo.createNewFile();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        int i = 0;
        String get = "";
        get = datos.getDNI() + " ; " + datos.getNombre() + " ; " + datos.getApellido() + " ; " + datos.getEdad() + " ; " + datos.getDireccion_L_calle() + " ; " + " ; " + datos.getDireccion_L_numero() + " ; " + datos.getDireccion_L_Region() + " ; " + datos.getDireccion_L_provincia() + " ; " + datos.getDireccion_L_comuna()  + " ; " + datos.getDireccion_P_calle() + " ; " + datos.getDireccion_P_numero() + " ; " + datos.getDireccion_P_region() + " ; " + datos.getDireccion_P_provincia() + " ; " + datos.getDireccion_P_comuna() + " ; " + academico + " ; " + alumno + " ; " + funcionario + "\r\n";
                           
                try{
                FileWriter fw = new FileWriter(archivo, true);
                fw.append(get);
                fw.close();               
                }
                catch(Exception e){
                    e.printStackTrace();
                }
        
    }
    public String region(){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccionRegionCsv));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                    temp = temp + bfRead + line;
            }
            texto = temp;
        }
        catch(Exception e){
            System.err.println("No se ecuentra la ruta del archivo");
        }
        return texto;
    }
    
    public String provincia(){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccionProvinciaCsv));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                    temp = temp + bfRead + line;
            }
            texto = temp;
        }
        catch(Exception e){
            System.err.println("No se ecuentra la ruta del archivo");
        }
        return texto;
    }
    public String comuna(){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccionComunaCsv));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                    temp = temp + bfRead + line;
            }
            texto = temp;
        }
        catch(Exception e){
            System.err.println("No se ecuentra la ruta del archivo");
        }
        return texto;
    }
}
