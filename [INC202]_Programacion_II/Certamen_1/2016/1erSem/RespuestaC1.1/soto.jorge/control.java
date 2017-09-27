/* 



*/

package paquete;
import paquete.respuestas; 
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 


public class control {


    public static void main(String[] args) {
        int Termino=0;
        int Menu;
        /*
        String fileName = "DatasetAlumnos.csv";  
        File file = new File(fileName); //todo: read about File
        try{
            Scanner inputStream = new Scanner(file);
            inputStream.next(); //ignora la primera linea
            while(inputStream.hasNext()){
                String DatasetAlumnos = inputStream.next();//gets a whole line
                String[] values =DatasetAlumnos.split(",");
                double closingPrice = Double.parseDouble(values[1]); 
                System.out.println(values[1]); //valor de la fila a mostrar
                
            }
            inputStream.close();
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        */
        respuestas resp = new respuestas();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t\t Autor: Jorge Soto Ogalde\n");
        
        while(Termino==0){
            
            System.out.println("\n Menu opciones:");
            System.out.println("\t 1) Alumnos cursando 3 medio.");    
            System.out.println("\t 2) Alumno(s) hombre(s) cursando 4 medio.");
            System.out.println("\t 3) Alumno(s) repitente(s) Matematica.");
            System.out.println("\t 4) Alumno(s) menore(s) de 15 años.");
            System.out.println("\t 5) Informacion completa alumno.");
            System.out.println("\t 0) Salir del programa.");
        
            System.out.println("  Elija una opcion:  ");
            Menu=scan.nextInt();
                    
            switch(Menu){
                case 1:{
                    resp.resultado1();
                    break;
                }
                case 2:{
                    resp.resultado2();
                    break;
                }
                case 3:{
                    resp.resultado3();
                    break;
                }
                case 4:{
                    resp.resultado4();
                    break;
                }
                case 5:{
                    resp.resultado5();
                    break;
                }
                case 0:{
                    Termino=1;
                    break;
                }
                default:{
                    System.out.println(" Error, elija una opcion valida");
                }
        
            }
        
        }
        
    }
    
}
