

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ClaseLista {
        
       private List<String>li;
       private List<Datos>dat;
       private List<Asignatura>asg;
       private List<Asignatura1>asg1;
       private List<int>almc;
       
       public ClaseLista(){
              li=FuenteDeDatos.leerArchivo("C:\\Users\\lab.LABORATORIOS-PC\\Downloads\\alumnos.csv");
              li=FuenteDeDatos.leerArchivo("C:\\Users\\lab.LABORATORIOS-PC\\Downloads\\asignatura.csv");
              li=FuenteDeDatos.leerArchivo("C:\\Users\\lab.LABORATORIOS-PC\\Downloads\\asignatura1.csv");
       }
       
       public void agregarAlumno(){
              Datos d;
              if(li!=null & !li.isEmpty()){
                 for(String linea: li){
                     dat=new ArrayList<Datos>();
                     d=new Datos();
                     StringTokenizer st=new StringTokenizer(linea, ";");
                     while(st.hasMoreTokens()){
                          d.setID(st.nextToken());
                          d.setApellido(st.nextToken());
                          d.setApellido1(st.nextToken());
                          d.setNombres(st.nextToken());
                     }
                     dat.add(d);
                 }
              }
       }
       
       public void agregarAsignatura(){
              Asignatura a;
              if(li!=null & !li.isEmpty()){
                 for(String linea: li){
                     asg=new ArrayList<Asignatura>();
                     a=new Asignatura();
                     StringTokenizer st=new StringTokenizer(linea, ";");
                     while(st.hasMoreTokens()){
                          a.setID(st.nextToken());
                          a.setQ1(st.nextToken());
                          a.setQ2(st.nextToken());
                          a.setQ3(st.nextToken());
                          a.setNT1(st.nextToken());
                          a.setNT2(st.nextToken());
                          a.setC1(st.nextToken());
                          a.setC2(st.nextToken());
                          a.setC3(st.nextToken());
                          
                     }
                     asg.add(a);
                 }
              }
       }
       
       public void agregarAsignatura2(){
              Asignatura1 a1;
              if(li!=null & !li.isEmpty()){
                 for(String linea: li){
                     asg1=new ArrayList<Asignatura1>();
                     a1=new Asignatura1();
                     StringTokenizer st=new StringTokenizer(linea, ";");
                     while(st.hasMoreTokens()){
                          a1.setID(st.nextToken());
                          a1.setCO1(st.nextToken());
                          a1.setCO2(st.nextToken());
                          a1.setCO3(st.nextToken());
                          a1.setNT1(st.nextToken());
                          a1.setNT2(st.nextToken());
                          a1.setC1(st.nextToken());
                          a1.setC2(st.nextToken());
                          a1.setC3(st.nextToken());
                          
                     }
                     asg1.add(a1);
                 }
              }
       }
       
       public void promedioAsignatura1(){
              Asignatura a;
              int sumaNotasQ=0;              
              int n1=0;
              int sumaNotasT=0;
              int promQ = 0;
              int promT = 0;
              int promC=0;
              int sumaNotasC;
              int promTot=0;
              
              if(li!=null & !li.isEmpty()){
                 for(Asignatura aa: asg){
                     almc=new ArrayList<String>();
                     a=new Asignatura();
                     sumaNotasQ=Integer.parseInt(a.getQ1()+a.getQ2()+a.getQ3());
                     promQ=sumaNotasQ/3;
                     sumaNotasT=Integer.parseInt(a.getNT1()+a.getNT2());
                     promT=sumaNotasT/3;
                     sumaNotasC=Integer.parseInt(a.getC1()+a.getC2()+a.getC3());
                     promC=sumaNotasC/3;
              }
                 
                 if(promC>40){
                    promTot=(int) (promC*0.7+promQ*0.15+promT*0.15);
                    
                 }else if(promC>35){
                        promTot=(int) (promC*0.8+promQ*0.10+promT*0.10);
                     }else if(promC>30){
                            promTot=(int) (promC*0.9+promQ*0.05+promT*0.05);   
                                    
                     }else{
                        promTot=promC;
                 }
                 
                
                 
       }
}
       
          public void promedioAsignatura2(){
              Asignatura1 a1;
              int sumaNotasQ=0;              
              int n1=0;
              int sumaNotasT=0;
              int promQ = 0;
              int promT = 0;
              int promC = 0;
              int promTot=0;
              int sumaNotasC;
              if(li!=null & !li.isEmpty()){
                 for(Asignatura1 aa1: asg1){
                     a1=new Asignatura1();
                     sumaNotasQ=Integer.parseInt(a1.getCO1()+a1.getCO2()+a1.getCO3());
                     promQ=sumaNotasQ/3;
                     sumaNotasT=Integer.parseInt(a1.getNT1()+a1.getNT2());
                     promT=sumaNotasT/3;
                     sumaNotasC=Integer.parseInt(a1.getC1()+a1.getC2()+a1.getC3());
                     promC=sumaNotasC/3;
              }
                 if(promC>40){
                    promTot=(int) (promC*0.7+promQ*0.15+promT*0.15);
                 }else if(promC>35){
                        promTot=(int) (promC*0.8+promQ*0.10+promT*0.10);
                     }else if(promC>30){
                            promTot=(int) (promC*0.9+promQ*0.05+promT*0.05);   
                                    
                     }else{
                        promTot=promC;
                 }
       }
}
       
}
