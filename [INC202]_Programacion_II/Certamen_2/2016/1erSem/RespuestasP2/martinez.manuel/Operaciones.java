public class Operaciones { 
  float promedioQuiz1;
  float promedio 


  public void nombres(List<String> listAlumnos){
        Alumno alumno;
        StringTokenizer st,st2;
        Asignaturas a1,a2;
        float promQ1,promQ2,promT1,promT2,promC1,promC2;




        for(String l: listAlumnos){ //se llena con los nombres
             st = new StringTokenizer(l,",");
           
           while(st.hasMoreElements()){
               try {
                   alumno.setApellidoPaterno(st.nextToken());
                   alumno.setAppelidoMaterno(st.nextToken());
                   alumno.setNombre(st.nextToken());
               
              }catch(Exception e){}
               
           }
          
        }
  }


  public asignaturas(){
    for(String l2 : listaAsignatura1){ //sacar promedio 
            st2 = new StringTokenizer(l2,",");
              while(st.hasMoreElements()){
                float promQ1 = (st.nextToken() * st.nextToken() * st.nextToken())/3;
                alumno.setPromQ1(promQ1);

                float promT1 = (st.nextToken() * st.nextToken())/2;
                alumno.setPromT1(promT1);

                float promC1 = (st.nextToken() * st.nextToken()*st.nextToken())/3;
                alumno.setPromC1(promC1);
              }

            }
  }

        for(String l2 : listAsignatura1){
           st = new StringTokenizer(l2,",");

           while(st.hasMoreElements()){
            try{ //recibiendo segundo dataset

              alumno.setN1q(Float.parseFloat(st.nextToken());
              alumno.setN2q(Float.parseFloat(st.nextToken());
              alumno.setN3q(Float.parseFloat(st.nextToken());
              alumno.setN1t(Float.parseFloat(st.nextToken());
              alumno.setN2t(Float.parseFloat(st.nextToken());
              alumno.setN1c(Float.parseFloat(st.nextToken());
              alumno.setN2c(Float.parseFloat(st.nextToken());
              alumno.setN3c(Float.parseFloat(st.nextToken());

            }catch(Exception e){}
           }

        }
    
    }
  }