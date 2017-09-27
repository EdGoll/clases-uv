
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lista {
    
    private StringTokenizer agg;
    private FuenteDeDatos dat;
    List<String> ListAlumnos = null;
    List<String> ListAsig1 = null;
    List<String> ListAsig2 = null;
    ArrayList<BeanAlumnos> AL = new ArrayList<>();
    ArrayList<BeanAsigantura1> As1 = new ArrayList<>();
    ArrayList<BeanAsignatura2> As2 = new ArrayList<>();
    
    
    private void Lista(){
        
        dat = new FuenteDeDatos();
        ListAlumnos = dat.leerArchivo("alumnos.csv");
        ListAsig1 = dat.leerArchivo("asignatura1.csv");
        ListAsig2 = dat.leerArchivo("asignatura2.csv");
        
    }

    public void AlmacenamientoAlumnos(){
        
        BeanAlumnos BA;
        for(String l: ListAlumnos){
            BA = new BeanAlumnos ();
            agg = new StringTokenizer(l,";");
            while(agg.hasMoreElements()){
                BA.setId(Integer.parseInt(agg.nextToken()));
                BA.setApellidoPaterno(agg.nextToken());
                BA.setApellidoMaterno(agg.nextToken());
                BA.setNombres(agg.nextToken());
                BeanAlumnos.add(BA);
            }
        }
    }
    
    public void AlmacenamientoAsig1(){
    
        BeanAsigantura1 A1;
        for(String l: ListAsig1){
            A1 = new BeanAsigantura1();
            agg = new StringTokenizer(l,";");
            while(agg.hasMoreElements()){
                A1.setId(Integer.parseInt(agg.nextToken()));
                A1.setNquiz1(Float.parseFloat(agg.nextToken()));
                A1.setNquiz2(Float.parseFloat(agg.nextToken()));
                A1.setNquiz3(Float.parseFloat(agg.nextToken()));
                A1.setNTarea1(Float.parseFloat(agg.nextToken()));
                A1.setNTarea2(Float.parseFloat(agg.nextToken()));
                A1.setNCertamen1(Float.parseFloat(agg.nextToken()));
                A1.setNCertamen2(Float.parseFloat(agg.nextToken()));
                A1.setNCertamen3(Float.parseFloat(agg.nextToken()));
                BeanAsigantura1.add(A1);
            }
        }
    }
    
    public void AlmacenarAsig2(){
    
         BeanAsignatura2 A2;
        for(String l: ListAsig2){
            A2 = new BeanAsignatura2();
            agg = new StringTokenizer(l,";");
            while(agg.hasMoreElements()){
                A2.setId(Integer.parseInt(agg.nextToken()));
                A2.setNControl1(Float.parseFloat(agg.nextToken()));
                A2.setNControl2(Float.parseFloat(agg.nextToken()));
                A2.setNControl3(Float.parseFloat(agg.nextToken()));
                A2.setNTarea1(Float.parseFloat(agg.nextToken()));
                A2.setNTarea2(Float.parseFloat(agg.nextToken()));
                A2.setNCertamen1(Float.parseFloat(agg.nextToken()));
                A2.setNCertamen2(Float.parseFloat(agg.nextToken()));
                A2.setNCertamen3(Float.parseFloat(agg.nextToken()));
                BeanAsignatura2.add(A2);
            }
        }
    }
    
    public float promA1(){
    
        float PC=0, PQ=0, PT=0;
        for(BeanAsigantura1 aux: As1){
            PC = (aux.getNCertamen1() + aux.getNCertamen2() + aux.getNCertamen3())/3;
            PQ = (aux.getNquiz1() + aux.getNquiz2() + aux.getNquiz3())/3;
            PT = (aux.getNTarea1() + aux.getNTarea2())/2;
            if(PC>=4.0){
                return(float) (PC*0.7 + PQ*0.15 + PT*0.15);
            }
            else if (PC>=3.5 && PC<4.0){
                return(float) (PC*0.8 + PQ*0.10 + PT*0.10);
            }
            else if (PC>=3.0 && PC<3.5){
                return(float) (PC*0.9 + PQ*0.05 + PT*0.05);
            }
            else{
                return(float) PC;
            }
        
        }
        return 0;
    }
    
    public float promA2(){
    
        float PC=0, PCrtl=0, PT=0;
        for(BeanAsignatura2 aux: As2){
            PC = (aux.getNCertamen1() + aux.getNCertamen2() + aux.getNCertamen3())/3;
            PCrtl = (aux.getNControl1() + aux.getNControl2() + aux.getNControl3())/3;
            PT = (aux.getNTarea1() + aux.getNTarea2())/2;
            if(PC>=4.0){
                return(float) (PC*0.7 + PCrtl*0.15 + PT*0.15);
            }
            else if (PC>=3.5 && PC<4.0){
                return(float) (PC*0.8 + PCrtl*0.10 + PT*0.10);
            }
            else if (PC>=3.0 && PC<3.5){
                return(float) (PC*0.9 + PCrtl*0.05 + PT*0.05);
            }
            else{
                return(float) PC;
            }
        }
        return 0;
    }
 
    public void consolidado(){
        BeanConsolidado C;
        BeanAlumnos A;
        BeanAsigantura1 A1;
        BeanAsignatura2 A2;
        C = new BeanConsolidado();
        A = new BeanAlumnos();
        A1 = new BeanAsigantura1();
        A2 = new BeanAsignatura2();
        dat= new FuenteDeDatos();
        dat.escribirArchivo("Consolidado.csv", ListAlumnos);
        ArrayList<BeanConsolidado> consolidado = new ArrayList<>();
        C.setId();
        
    
    }

    void ListAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void loadListAsig1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ListAsig2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void loadListAsig2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void loadconsolidado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}