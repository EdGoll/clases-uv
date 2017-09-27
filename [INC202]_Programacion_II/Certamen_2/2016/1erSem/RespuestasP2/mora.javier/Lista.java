import java.util.*;

public class Lista {
    private List<Alumno> listAlumnos;
    private List<Asignatura> listAsignatura1;
    private List<Asignatura> listAsignatura2;
    private List<String> prom;
    public Lista(){
        cargarDatos();
    }
    
    private List<Asignatura> llenarList(String ubicacion){
        FuenteDeDatos f1 = new FuenteDeDatos();
        List<String> lineas = new ArrayList<String>();
        List<Asignatura> listAsig = new ArrayList<Asignatura>();
        
        lineas = f1.leerArchivo(ubicacion);
        for(String linea : lineas){
           Asignatura as1 = new Asignatura();
           StringTokenizer st = new StringTokenizer(linea,";");
         
           as1.setIdentificador(st.nextToken());
           as1.setNotaQ1(Float.parseFloat(st.nextToken()));
           as1.setNotaQ2(Float.parseFloat(st.nextToken()));
           as1.setNotaQ3(Float.parseFloat(st.nextToken()));
           as1.setNotaT1(Float.parseFloat(st.nextToken()));
           as1.setNotaT2(Float.parseFloat(st.nextToken()));
           as1.setNotaC1(Float.parseFloat(st.nextToken()));
           as1.setNotaC2(Float.parseFloat(st.nextToken()));
           as1.setNotaC3(Float.parseFloat(st.nextToken()));
           
           listAsig.add(as1);
        }
        return listAsig;
    }
    
    private void cargarDatos(){
        List<String> lineas = new ArrayList<String>();
        listAlumnos = new ArrayList<Alumno>();
        listAsignatura1 = new ArrayList<Asignatura>();
        listAsignatura2 = new ArrayList<Asignatura>();
        
        FuenteDeDatos f1 = new FuenteDeDatos();
        lineas = f1.leerArchivo("alumnos.csv");
        
        for(String linea : lineas){
            Alumno al = new Alumno();
            StringTokenizer st = new StringTokenizer(linea,";");       
            al.setIdentificador(st.nextToken());
            al.setApellidoPat(st.nextToken());
            al.setApellidoMat(st.nextToken());
            al.setNombre(st.nextToken());          
            listAlumnos.add(al);
        }      
        listAsignatura1 = llenarList("asignatura1.csv");
        listAsignatura2 = llenarList("asignatura2.csv");          
    }
    
    private float calcularPromedio(int i, List<Asignatura> listA){
       float pQ, pT, pC;
       pQ = listA.get(i).getNotaQ1();
       pQ += listA.get(i).getNotaQ2();
       pQ += listA.get(i).getNotaQ3();    
       pT = listA.get(i).getNotaT1();
       pT += listA.get(i).getNotaT1();
       pC = listA.get(i).getNotaC1();
       pC += listA.get(i).getNotaC2();
       pC += listA.get(i).getNotaC3();
       
       pQ = pQ/3;
       pT = pT/2;
       pC = pC/3;
       
       if(pC>=4.0f){
           return pC*0.7f+pQ*0.15f+pT*0.15f;
       }else if(pC>=3.5f){
           return pC*0.8f+pQ*0.10f+pT*0.10f;
       }else if(pC>=3.0f){
           return pC*0.9f+pQ*0.05f+pT*0.05f;
       }else{
           return pC;
       }
    }
    
    public void calcularPromedios(){
        prom = new ArrayList<String>();
        for(int i = 0 ; i<listAsignatura1.size();i++){
           float prom1 = calcularPromedio(i,listAsignatura1);
           float prom2 = calcularPromedio(i,listAsignatura2);
           prom.add(listAsignatura1.get(i).getIdentificador()+";"+prom1+";"+prom2);
        }
    }
    
    public void guardarConsolidado(){
         FuenteDeDatos f1 = new FuenteDeDatos();
         f1.escribirArchivo("consolidado.csv", prom);
         System.out.println("ARCHIVO GUARDADO");
    }
    
}
