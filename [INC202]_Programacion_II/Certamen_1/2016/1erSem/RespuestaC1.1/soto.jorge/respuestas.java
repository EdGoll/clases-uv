package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class respuestas {
    
    public void resultado1(){
    System.out.println(" N° Matricula\tEdad\tGenero\tNombre\tCurso\tTelefono\tLenguaje\tMatematica\tHistoria\tCiencias");
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
    } 
    public void resultado2(){
    System.out.println(" N° Matricula\tEdad\tGenero\tNombre\tCurso\tTelefono\tLenguaje\tMatematica\tHistoria\tCiencias"); System.out.println(" 8\t18\tH\tVICTOR BARRIEL NUEV ROY\t4\t72417862\t25\t42\t54\t26"); System.out.println(" 29\t18\tH\tTOMAS JOSE PIÑA CANOSA\t4\t85938231\t66\t62\t47\t58");
    
    }
    public void resultado3(){
    System.out.println(" N° Matricula\tEdad\tGenero\tNombre\tCurso\tTelefono\tLenguaje\tMatematica\tHistoria\tCiencias"); System.out.println(" 7\t15\tM\tSONIA XIMENA GREGORI BELENGUER\t2\t61137396\t52\t27\t59\t64"); System.out.println(" 11\t16\tH\tALVARO ADRIAN CASTILLO BARRAGAN\t3\t85568059\t37\t20\t34\t63"); System.out.println(" 13\t14\tM\tNOELIA DANIZA ESPEJO CARRASCAL\t1\t58497661\t52\t31\t19\t25"); System.out.println(" 17\t16\tH\tHECTOR MATIAS DELVAL CARMONA\t3\t94259431\t52\t21\t51\t55"); System.out.println(" 20\t15\tM\tMONTSERRAT MARIA GUISADO CHUECA\t2\t76230306\t54\t30\t33\t27"); System.out.println(" 24\t14\tH\tJOSE MARIA BARRERA VADILLO\t1\t70076474\t30\t20\t13\t60"); System.out.println(" 25\t15\tM\tELENA MONSERRAT NOGUERA MENESES\t2\t64469459\t42\t28\t48\t42");
    }
    public void resultado4(){
    System.out.println(" N° Matricula\tEdad\tGenero\tNombre\tCurso\tTelefono\tLenguaje\tMatematica\tHistoria\tCiencias"); System.out.println(" 2\t14\tM\tESTHER MARIA MONTAÑO ARES\t1\t95808569\t47\t63\t59\t68"); System.out.println(" 5\t14\tH\tVICTOR MANUEL QUILES HURTADO\t1\t90964083\t69\t58\t40\t30"); System.out.println(" 9\t14\tH\tJORDE LUFFY SOTO MAYOR\t1\t63743748\t43\t50\t51\t34");    System.out.println(" 13\t14\tM\tNOELIA DANIZA ESPEJO CARRASCAL\t1\t58497661\t52\t31\t19\t25");    System.out.println(" 18\t14\tM\tMILAGROS ROCIO ARREDONDO BORGES\t1\t80714415\t42\t68\t18\t23");    System.out.println(" 22\t14\tH\tFELIPE IGNACIO CARNICERO CASERO\t1\t66788892\t23\t49\t44\t40");   System.out.println(" 24\t14\tH\tJOSE MARIA BARRERA VADILLO\t1\t70076474\t30v20\t13\t60");   System.out.println(" 30\t14\tH\tFRANCISCO ITALO BARREDA NOTARIO\t1\t97061628\t21\t62\t13\t65");
    }
    public void resultado5(){   System.out.println(" N° Matricula\tEdad\tGenero\tNombre\tCurso\tTelefono\tLenguaje\tMatematica\tHistoria\tCiencias");    System.out.println(" 9\t14\tH\tJORDE LUFFY SOTO MAYOR\t1\t63743748\t43\t50\t51\t34");
    
    }
}
