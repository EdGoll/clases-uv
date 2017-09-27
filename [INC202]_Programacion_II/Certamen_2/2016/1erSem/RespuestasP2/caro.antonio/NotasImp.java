
public class NotasImp {
    List<Alumnos> lis = new ArrayList<Alumnos>();
    
    public void leer(){
        FuenteDeDatos a1 = new FuenteDeDatos();
        FuenteDeDatos a2 = new FuenteDeDatos();
        FuenteDeDatos a3 = new FuenteDeDatos();
        
        List<String> lineasA = new ArrayList<String>();
        List<String> lineasp1 = new ArrayList<String>();
        List<String> lineasp2 = new ArrayList<String>();
        lineasA = a1.leerArchivo("alumnos.csv");
        lineasp1 =a2.leerArchivo("asignatura1.csv");
        lineasp2 = a3.leerArchivo("asignatura2.csv");
        for(String linea : lineasA){
            Alumnos alum = new Alumnos();
            StringTokenizer a = new StringTokenizer(";",linea);
                alum.setId(a.nextToken());
                alum.setaPatreno(a.nextToken());
                alum.setaMaterno(a.nextToken());
                alum.setNombre(a.nextToken());
                for(String lineas2 : lineasp1){
                    StringTokenizer b = new StringTokenizer(";",lineas2);
                    if(alum.getId().equals(b.nextToken())){
                        alum.setnQ_1(b.nextToken());
                        alum.setnQ_2(b.nextToken());
                        alum.setnQ_3(b.nextToken());
                        alum.setnT1a(b.nextToken());
                        alum.setnT2a(b.nextToken());
                        alum.setnCer1a(b.nextToken());
                        alum.setnCer2a(b.nextToken());
                        alum.setnCer3a(b.nextToken());
                        for( String lineas3 : lineasp2 ){
                            StringTokenizer c = new StringTokenizer(";",lineas3);
                            if(alum.getId().equals(c.nextToken())){
                               alum.setnCon_1(b.nextToken());
                               alum.setnCon_2(b.nextToken());
                               alum.setnCon_3(b.nextToken());
                               alum.setnT1b(b.nextToken());
                               alum.setnT2b(b.nextToken());
                               alum.setnCer1b(b.nextToken());
                               alum.setnCer2b(b.nextToken());
                               alum.setnCer3b(b.nextToken());
                               lis.add(alum);
                            }
                        }
                    }
                }
        } 
    }
    public void promedios(Alumnos a){
       float pro, pro1 , pro2 =0;
       pro =  parseInt(a.getnQ_1());
       pro += parseInt(a.getnQ_2()); 
       pro += parseInt(a.getnQ_3());
       pro = pro/3;
       if (pro>=4){
       }else if(pro < 3,5){
    
        }
    }
}
