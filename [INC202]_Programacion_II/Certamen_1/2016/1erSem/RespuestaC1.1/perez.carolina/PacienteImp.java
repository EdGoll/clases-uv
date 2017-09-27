
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class PacienteImp{
    
    List<String> lineas;
    List<Paciente> pacientes = new ArrayList<Paciente>();
    Paciente paciente;
    
    public void impLineas(){
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("C:\\Users\\Carolina\\Downloads\\Hospital de Arica.csv");
        for(String linea : lineas){
            paciente = new Paciente();
            StringTokenizer st = new StringTokenizer(linea,";");
            paciente.setEdad(st.nextToken());
            paciente.setCausa(st.nextToken());
            paciente.setSemana1(Integer.parseInt(st.nextToken()));
            paciente.setSemana2(Integer.parseInt(st.nextToken()));
            paciente.setSemana3(Integer.parseInt(st.nextToken()));
            paciente.setSemana4(Integer.parseInt(st.nextToken()));
            paciente.setSemana5(Integer.parseInt(st.nextToken()));
            paciente.setSemana6(Integer.parseInt(st.nextToken()));
            paciente.setSemana7(Integer.parseInt(st.nextToken()));
            paciente.setSemana8(Integer.parseInt(st.nextToken()));
            paciente.setSemana9(Integer.parseInt(st.nextToken()));
            paciente.setSemana10(Integer.parseInt(st.nextToken()));
            
            pacientes.add(paciente);
            //System.out.println(paciente.toString());
        }
    }
    
    public void pregunta1(){
        System.out.println("1. ¿Cuantas personas entre 15 a 64 años se atendieron por Neumonía en la quinta semana?");
        for(int i = 1;i<pacientes.size();i++){
            //System.out.println("for"+i);
            if(((pacientes.get(i)).getEdad()).equals("15a64anios")){
                //System.out.println("if"+i);
                if(((pacientes.get(i)).getCausa()).equals("Neumonia (J12-J18)")){
                    //System.out.println("if2 "+i);
                    System.out.println("respuesta: "+pacientes.get(i).getSemana5());
                }
            }
        }
    }
    
    public void pregunta2(){
        System.out.println("2. ¿Cuantos niños entre 5 a 14 años se atendieron en total por Bronquitis en las 10 semanas?");
        for(int i = 1;i<pacientes.size();i++){
            if(((pacientes.get(i)).getEdad()).equals("5a14anios")){
                if(((pacientes.get(i)).getCausa()).equals("Bronquitis/bronquiolitis aguda (J20-J21)")){
                    int suma = pacientes.get(i).getSemana1()+
                            pacientes.get(i).getSemana2()+
                            pacientes.get(i).getSemana3()+
                            pacientes.get(i).getSemana4()+
                            pacientes.get(i).getSemana5()+
                            pacientes.get(i).getSemana6()+
                            pacientes.get(i).getSemana7()+
                            pacientes.get(i).getSemana8()+
                            pacientes.get(i).getSemana9()+
                            pacientes.get(i).getSemana10();
                    System.out.println("respuesta "+suma);
                }
            }
        }
    }
    
    public void pregunta3(){
        System.out.println("3. En la categoria de 65 o más años, en que semana se atendio mas gente (incluya todas las causas para calcular la respuesta)");
        int suma1=0,suma2=0,suma3=0,suma4=0,suma5=0,suma6=0,suma7=0,suma8=0,suma9=0,suma10=0;
        for(int i = 1;i<pacientes.size();i++){
            if(((pacientes.get(i)).getEdad()).equals("65omas")){
                suma1+=pacientes.get(i).getSemana1();
                suma2+=pacientes.get(i).getSemana2();
                suma3+=pacientes.get(i).getSemana3();
                suma4+=pacientes.get(i).getSemana4();
                suma5+=pacientes.get(i).getSemana5();
                suma6+=pacientes.get(i).getSemana6();
                suma7+=pacientes.get(i).getSemana7();
                suma8+=pacientes.get(i).getSemana8();
                suma9+=pacientes.get(i).getSemana9();
                suma10+=pacientes.get(i).getSemana10();
            }
        }
        int mas=0;
        String semana = null;
            if(suma1>mas){
                mas = suma1;
                semana = "semana 1";
            }
            if(suma2>mas){
                mas = suma2;
                semana = "semana 2";
            }
            if(suma3>mas){
                mas = suma3;
                semana = "semana 3";
            }
            if(suma4>mas){
                mas = suma4;
                semana = "semana 4";
            }
            if(suma5>mas){
                mas = suma5;
                semana = "semana 5";
            }
            if(suma6>mas){
                mas = suma6;
                semana = "semana 6";
            }
            if(suma7>mas){
                mas = suma7;
                semana = "semana 7";
            }
            if(suma8>mas){
                mas = suma8;
                semana = "semana 8";
            }
            if(suma9>mas){
                mas = suma9;
                semana = "semana 9";
            }
            if(suma10>mas){
                mas = suma10;
                semana = "semana 10";
            }
            System.out.println("respuesta: "+semana);
            //System.out.println(suma1+" "+suma2+" "+suma3+" "+suma4+" "+suma5+" "+suma6+" "+suma7+" "+suma8+" "+suma9+" "+suma10);
    }
    
    public void pregunta4(){
        System.out.println("5. Calcular el total de personas que atendidas por hospitalizaciones y crisis hipertensiva en las 6 primeras semanas en la categoria\n" +
"   de mayores de 65, 5 a 14 y 15 a 64?");
        int sumaTotal=0;
        for(int i = 1;i<pacientes.size();i++){
            //System.out.println("for"+i);
            if(((pacientes.get(i)).getEdad()).equals("15a64anios") || ((pacientes.get(i)).getEdad()).equals("65omas") || ((pacientes.get(i)).getEdad()).equals("5a14anios")){
                //System.out.println("if"+i);
                if(((pacientes.get(i)).getCausa()).equals("HOSPITALIZACIONES") || ((pacientes.get(i)).getCausa()).equals("Crisis hipertensiva")){
                    //System.out.println("if2 "+i);
                    sumaTotal += pacientes.get(i).getSemana1()+pacientes.get(i).getSemana2()+pacientes.get(i).getSemana3()+pacientes.get(i).getSemana4()+pacientes.get(i).getSemana5()+pacientes.get(i).getSemana6();
                }
            }
        }
        System.out.println("respuesta: "+sumaTotal);
    }
    
    public void pregunta5(){
        System.out.println("5. ¿Cuantas personas se atendieron en total en las 5 primeras semanas por Neumonía en todas las categorias (lactantes, 1 a 4 años , 5a14 años,15 a 64 años, 65omas)?\nOrdene de menor a mayor las categorias segun la cantidad de atendidos.");
        int sumaTotal=0;
        int sumaActual=0;
        ArrayList<Integer> sem = new ArrayList<Integer>();
        ArrayList<Integer> semDes = new ArrayList<Integer>();
        for(int i = 1;i<pacientes.size();i++){
            //System.out.println("for");
            if(((pacientes.get(i)).getCausa()).equals("Neumonia (J12-J18)")){
                //System.out.println("if");
                sumaActual= pacientes.get(i).getSemana1()+pacientes.get(i).getSemana2()+pacientes.get(i).getSemana3()+pacientes.get(i).getSemana4()+pacientes.get(i).getSemana5();
                sumaTotal += sumaActual;
                sem.add(sumaActual);
                semDes.add(sumaActual);
            }
        }
        int temp;
        for(int i=1; i<sem.size();i++){
            for(int j=0; j<sem.size()-1;j++){
                if(sem.get(j)>sem.get(j+1)){
                    temp=sem.get(j);
                    sem.set(j, sem.get(j+1));
                    sem.set(j+1, temp);
                }
            }
        }
        
        for(int i=0; i <sem.size();i++){
            //System.out.println(sem.get(i));
            if(sem.get(i).equals(semDes.get(0))){
                System.out.println("LACTANTES");
            }
            if(sem.get(i).equals(semDes.get(1))){
                System.out.println("1a4anios");
            }
            if(sem.get(i).equals(semDes.get(2))){
                System.out.println("5a14anios");
            }
            if(sem.get(i).equals(semDes.get(3))){
                System.out.println("15a64anios");
            }
            if(sem.get(i).equals(semDes.get(4))){
                System.out.println("65omas");
            }
        }
        System.out.println("respuesta: "+sumaTotal);
        
    }
    
}