
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ISAImp {
    
    ArrayList<Pais> Lista = new ArrayList<Pais>();
    FuenteDeDatos fd = new FuenteDeDatos();
    
    private void Rellenar(){
        
        List lst = fd.leerArchivo("C:\\Users\\Diego\\Desktop\\OECD ISA2012.csv"); //Ingresar URL correspondiente a la ubicacion del archivo
        StringTokenizer st = null;
        Pais p = null;
        for(Object ob : lst){
            st = new StringTokenizer((String)ob,",");
            p = new Pais();
            p.setCountry(st.nextToken());
            p.setMathGirls(st.nextToken());
            p.setMathBoys(st.nextToken());
            p.setReadingGirls(st.nextToken());
            p.setReadingBoys(st.nextToken());
            p.setScienceGirls(st.nextToken());
            p.setScienceBoys(st.nextToken());
            Lista.add(p);
        }
    }
    
    public void Consulta1(){
        
        for(Pais p : Lista){
            if(p.getCountry().equals("Chile")){
                int i = Integer.parseInt(p.getMathBoys()) + Integer.parseInt(p.getMathGirls());
                System.out.println("Hay "+i+" alumnos especializados en matematicas en Chile");
                return;
            }
        }
    }
    
    public void Consulta2(){
        
        String Country = null;
        int suma = 0;
        for(Pais p : Lista){
            if(Integer.parseInt(p.getScienceGirls())>suma){
                suma = Integer.parseInt(p.getScienceGirls());
                Country = p.getCountry();
            }
        }
        System.out.println("El pais con mas mujeres especializadas en ciencias es "+Country+" con "+suma);
    }
    
    public void Consulta3(){
        
        int math=0,science=0,reading=0,maxNum=0;
        String max = null;
        for(Pais p : Lista){
            math+=Integer.parseInt(p.getMathBoys())+Integer.parseInt(p.getMathGirls());
            science+=Integer.parseInt(p.getScienceBoys())+Integer.parseInt(p.getScienceGirls());
            reading+=Integer.parseInt(p.getReadingBoys())+Integer.parseInt(p.getScienceGirls());
        }
        if(math>science){
            if(math>reading){
                max = "Matematicas";
                maxNum = math;
            }
            else{
                max = "Lectura";
                maxNum = reading;
            }
            
        }else{
            if(science>reading){
                max = "Ciencias";
                maxNum = science;
            }
            else{
                max = "Lectura";
                maxNum = reading;
            }
        }
        System.out.println("La especialidad con mas alumnos en general es "+max+" con "+maxNum+" alumnos");
    }
    
    public void Consulta4(){
        
        String maxCountry=null,minCountry=null;
        int suma = 0, max = 0, min = 9999;
        for(Pais p : Lista){
            suma = Integer.parseInt(p.getMathBoys())+Integer.parseInt(p.getMathGirls());
            suma+= Integer.parseInt(p.getReadingBoys())+Integer.parseInt(p.getReadingGirls());
            suma+= Integer.parseInt(p.getScienceBoys())+Integer.parseInt(p.getScienceGirls());
            if(suma>max){
                max = suma;
                maxCountry = p.getCountry();
            }
            if(suma<min){
                min = suma;
                minCountry = p.getCountry();
            }
        }
        System.out.println("El pais con mas alumnos especializados es "+ maxCountry+" con "+max+" alumnos");
        System.out.println("El pais con menos alumnos especializados es "+minCountry+" con "+min+" alumnos");
    }
    
    public void Consulta5(){
        
        ArrayList<Pais> list = new ArrayList<Pais>();
        int suma = 0;
        for(Pais p : Lista){
            if(Integer.parseInt(p.getMathBoys())>=500)
                if(Integer.parseInt(p.getMathGirls())>=500)
                    if(Integer.parseInt(p.getReadingBoys())>=500)
                        if(Integer.parseInt(p.getReadingGirls())>=500)
                            if(Integer.parseInt(p.getScienceBoys())>=500)
                                if(Integer.parseInt(p.getScienceGirls())>=500){
                                    list.add(p);
                                    suma++;
                                }
        }
        System.out.println("Hay "+suma+" paises con 500 o mas alumnos en cada asignatura y genero");
        System.out.println("Pais | H.math | M.math | H.Lectura | M.Lectura | H.Ciencias | M.Ciencias");
        for(Pais p : list){
            System.out.println(p.getCountry()+" "+p.getMathBoys()+" "+p.getMathGirls()+" "+p.getReadingBoys()+" "+p.getReadingGirls()+" "+p.getScienceBoys()+" "+p.getScienceGirls());
        }
    }
    
    public ISAImp(){
        Rellenar();
    }
}
