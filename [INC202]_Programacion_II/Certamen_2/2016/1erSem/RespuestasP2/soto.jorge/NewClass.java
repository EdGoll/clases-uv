/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen;

public class DataRead2
{
    public int[] Dato1 = new int[87];
    public String[] Dato2 = new String[87];
    public String[] Dato3 = new String[87];
    public String[] DATO4 = new String[87];
     
    public void LeerDataSet() //Lee, muestra y crea arreglos con la información de la base de datos
    {
        int i = 0; //Contador para utilizar dentro del while.
        String fileName = "src/certamen/alumnos.csv"; //Se lee el archivo desde la misma ubicación de los archivos .java en Netbeans
        File f1 = new File(fileName);
        try
        {
            Scanner Read = new Scanner(f1);
            System.out.println("Se mostrarán los datos:\n");
            System.out.println(Read.next());
            while(Read.hasNext())
            {
                String Linea = Read.next();
                System.out.println(Linea);
                String[] Datos = Linea.split(",");
                Dato1[i] = Datos[1];
                Dato2[i] = Datos[2];
                Dato3[i] = Datos[3];
                DATO4[i] = Datos[4];
               if (i != 86)
                {    
                    i++;
                }    
            }    
            Read.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("Archivo no encontrado.");
        }
    }