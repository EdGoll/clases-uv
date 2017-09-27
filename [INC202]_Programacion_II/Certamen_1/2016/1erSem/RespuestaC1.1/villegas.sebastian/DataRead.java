package tarea;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class DataRead
{
    public String[] ESO_Clase = new String[30], ESO_Enfoque = new String[30];
    public int[] ESO_Nivel = new int[30], ESO_CP = new int[30], ESO_DComp = new int[30], ESO_Oro = new int[30];
     
    public void LeerDataSet() //Lee, muestra y crea arreglos con la información de la base de datos
    {
        int i = 0; //Contador para utilizar dentro del while.
        String fileName = "src/tarea/dataset_ESO.csv"; //Se lee el archivo desde la misma ubicación de los archivos .java en Netbeans
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
                ESO_Clase[i] = Datos[1];
                ESO_Enfoque[i] = Datos[4];
                ESO_Nivel[i] = Integer.parseInt(Datos[2]);
                ESO_CP[i] = Integer.parseInt(Datos[3]);
                ESO_DComp[i] = Integer.parseInt(Datos[6]);
                ESO_Oro[i] = Integer.parseInt(Datos[5]);
                if (i != 29)
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
    
    public void CalStamVMag() //En este grupo de jugadores, ¿que enfoque de juego es mas popular?
    {
        int contMag = 0,contStam = 0;
        System.out.print("\n");
        for(int i = 0; i < 30; i++)
        {
            if (ESO_Enfoque[i].equals("Stamina"))
            {
                contStam++;
            }
            else
            {
                contMag++;
            }
        }
        if (contMag > contStam)
        {
            System.out.println("El enfoque de juego preferido de este grupo de jugadores es: Magicka");
        }
        if (contMag < contStam)
        {
            System.out.println("El enfoque de juego preferido de este grupo de jugadores es: Stamina");
        }
        if (contMag == contStam)
        {
            System.out.println("No existe preferencia en este grupo (Mismo numero de cada enfoque)");
        }
    }
    
    public void CalNewPlayers() //¿Cuantos jugadores han llegado a Nivel 50 al menos una vez?¿Cuantos jugadores estan jugando por primera vez? (Dependiendo de si tienen CP(ChampionPoints) o no).
    {
        int contNP = 0,contOP = 0;
        for(int i = 0; i < 30; i++)
        {    
            if (ESO_CP[i] == 0)
            {
                contNP++;
            }
            if (ESO_CP[i] > 0 || ESO_Nivel[i] == 50)
            {
                contOP++;
            }
        }
        System.out.println("\n"+contOP+" jugadores han llegado a nivel 50 al menos una vez y "+contNP+" jugadores estan jugando por primera vez.");
    }
    
    public void CalPreferredClass() //¿Cuantas personas juegan cual clase y cual es la mas y menos preferida?
    {
        int contDK = 0,contNB = 0,contT = 0,contS = 0, contMax, contMin;
        String MP = null,LP = null;
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("DragonKnight"))
            {
                contDK++;
            }
        }
        contMax = contDK;
        contMin = contDK;   
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Nightblade"))
            {
                contNB++;
            }
        }
        if(contMax < contNB){contMax = contNB;}
        if(contMin > contNB){contMin = contNB;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Templar"))
            {
                contT++;
            }
        }
        if(contMax < contT){contMax = contT;}
        if(contMin > contT){contMin = contT;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Sorcerer"))
            {
                contS++;
            }
        }
        if(contMax < contS){contMax = contS;}
        if(contMin > contS){contMin = contS;}
        
        //Consolidacion de datos...
        if(contMax == contDK){MP = "DragonKnight";}
        if(contMin == contDK){LP = "DragonKnight";}
        if(contMax == contNB){MP = "Nightblade";}
        if(contMin == contNB){LP = "Nightblade";}
        if(contMax == contT){MP = "Templar";}
        if(contMin == contT){LP = "Templar";}
        if(contMax == contS){MP = "Sorcerer";}
        if(contMin == contS){LP = "Sorcerer";}
        
        System.out.println("\nEn el grupo seleccionado hay:\n-"+contDK+" DragonKnights\n-"+contNB+" Nightblades\n-"+contT+" Templars\n-"+contS+" Sorcerers\n\nPor ende, la clase mas jugada es "+MP+", mientras que la clase menos jugada es "+LP+".");
    }
    
    public void CalClassSkill()//¿Cuantos desafíos ha cumplido este grupo?,¿Qué clase a cumplido más y menos desafíos?
    {
        int contDK = 0,contNB = 0,contT = 0,contS = 0, contMax, contMin, contSum;//Admito que el algoritmo utilizado es muy, muy parecido al anterior.
        String MS = null,LS = null;
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("DragonKnight"))
            {
                contDK+= ESO_DComp[i];
            }
        }
        contMax = contDK;
        contMin = contDK;   
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Nightblade"))
            {
                contNB+= ESO_DComp[i];
            }
        }
        if(contMax < contNB){contMax = contNB;}
        if(contMin > contNB){contMin = contNB;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Templar"))
            {
                contT+= ESO_DComp[i];
            }
        }
        if(contMax < contT){contMax = contT;}
        if(contMin > contT){contMin = contT;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Sorcerer"))
            {
                contS+= ESO_DComp[i];
            }
        }
        if(contMax < contS){contMax = contS;}
        if(contMin > contS){contMin = contS;}
        
        //Consolidacion de datos...
        if(contMax == contDK){MS = "DragonKnight";}
        if(contMin == contDK){LS = "DragonKnight";}
        if(contMax == contNB){MS = "Nightblade";}
        if(contMin == contNB){LS = "Nightblade";}
        if(contMax == contT){MS = "Templar";}
        if(contMin == contT){LS = "Templar";}
        if(contMax == contS){MS = "Sorcerer";}
        if(contMin == contS){LS = "Sorcerer";}
        contSum = contDK + contNB + contT + contS;
        
        System.out.println("\nEn el grupo seleccionado se han cumplido "+contSum+" desafíos, la clase que más desafíos ha completado es "+MS+" con "+contMax+", y la que menos desafíos ha completado es "+LS+" con "+contMin+".");
    }
    
    public void CalOro()//¿Cuanto oro ha producido este grupo?,¿Qué clase produce más oro?
    {
        int contDK = 0,contNB = 0,contT = 0,contS = 0, contMax, contMin, contSum;//Admito nuevamente que el algoritmo utilizado es muy, muy, muy parecido al anterior.
        String MG = null,LG = null;
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("DragonKnight"))
            {
                contDK+= ESO_Oro[i];
            }
        }
        contMax = contDK;
        contMin = contDK;   
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Nightblade"))
            {
                contNB+= ESO_Oro[i];
            }
        }
        if(contMax < contNB){contMax = contNB;}
        if(contMin > contNB){contMin = contNB;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Templar"))
            {
                contT+= ESO_Oro[i];
            }
        }
        if(contMax < contT){contMax = contT;}
        if(contMin > contT){contMin = contT;}
        
        for (int i = 0; i < 30; i++)
        {
            if(ESO_Clase[i].equals("Sorcerer"))
            {
                contS+= ESO_Oro[i];
            }
        }
        if(contMax < contS){contMax = contS;}
        if(contMin > contS){contMin = contS;}
        
        //Consolidacion de datos...
        if(contMax == contDK){MG = "DragonKnight";}
        if(contMin == contDK){LG = "DragonKnight";}
        if(contMax == contNB){MG = "Nightblade";}
        if(contMin == contNB){LG = "Nightblade";}
        if(contMax == contT){MG = "Templar";}
        if(contMin == contT){LG = "Templar";}
        if(contMax == contS){MG = "Sorcerer";}
        if(contMin == contS){LG = "Sorcerer";}
        contSum = contDK + contT + contNB + contS;
        
        System.out.println("\nEn el grupo seleccionado se ha producido "+contSum+" oro y la clase que mas ha producido es "+MG+" con "+contMax+" oro y la que menos ha producido es "+LG+" con "+contMin+" oro.");
    }        
}
//Que ñoño :^)
