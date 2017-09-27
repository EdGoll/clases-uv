
public class Liga {
    
  static void Comienzo(){ 
    int a=0, e=0, i=0, o=0,u=0, j=0, c=0;
    String b = "";
    //Arreglo que tendra a los equipos participantes
    Equipo EL[] = new Equipo[16];
       
    //La matriz la declare como a usted le gusta y es correcto 
    //(Me da puntitos extras para asi subir lo teorico???)
    Jugador[][] JL= new Jugador[11][16]; //este arreglo almacenara jugadores
    
    
    int[] numeros = new int[18];//arreglo con la funcion de tener los nombres de los equipo 
    int[] numeros2 = new int[12]; //arreglo con la funcion de tener los nombres de los jugadores
    
    //llena de nombres 1-17 el arreglo numeros (deja la primera casilla con 0)
    while(e==0){
        numeros[a] = a;
        a++;
        if(numeros[a]==17){
            e=1;
        }        
    }
    
    
    a=0;
    e=0;
    
    //while para llenar arreglo que almacenara los 16 equipos
    while(e==0){
        //va en busca a un arreglo el cual contiene el numero que usara como nombre 
        a=(int)(Math.random() * 17) + 1;
        while (numeros[a]==0){ //valida q el numero no se haya usado antes por otro equipo
            a=(int)(Math.random() * 17) + 1;
        }
        
        //le asigna el nombre al equipo
        EL[o] = new Equipo(numeros[a]);  
        o++;//sube para pasar al siguiente equipo
        numeros[a]=0; //como ya use el nombre marco la casilla con un 0
        
        //para salir del while cuandoe esten los 16 equipos con sus nombres
        if(o==16){
            e=1;
        }    
    }
    e=0;
    //int[][] Jugadores= new int[11][16];
    while(e==0){
        while(true){
            j=0;
            a=0;
            
            //llena de nombres 1-11 el arreglo numeros (deja la primera casilla con 0)
            while(u==0){
            numeros2[a] = a;
            a++;
                if(numeros[a]==11){
                    u=1;
                }        
            }
            o=0;
            while (true){
        
                //va en busca a un arreglo el cual contiene el numero que usara como nombre 
                a=(int)(Math.random() * 11) + 1;
                while (numeros2[a]==0){ //valida q el numero no se haya usado antes por otro jugador
                    a=(int)(Math.random() * 11) + 1;
                }
                
                if(j==0){
                    b = "Portero";
                    c=0;
                }
                if((j==1) || (j==2) || (j==3)){
                    b = "defensas"; 
                    c=1;
                }
                if((j==4) || (j==5)){
                    b = "laterales"; 
                    c=1;
                }
                if((j==6) || (j==7)){
                    b = "centro campista";
                    c=1;
                }
                if((j==8) || (j==9) || (j==10)){
                    b = "delanteros"; 
                    c=1;
                }
                
                
                //le asigna el nombre al jugador
                JL[j][i] = new Jugador(numeros[a], b, c);   
                j++;//sube para pasar al siguiente jugador
                numeros[a]=0; //como ya use el nombre marco la casilla con un 0
                
                o =( o + ((int)((JL[j][i].BR % 0.20) + (JL[j][i].BG % 0.35) + (JL[j][i].GC % 45)))) ;
                
                //para salir del while cuandoe esten los 16 equipos con sus nombres
                if(j==11){
                    break;
                }
                EL[i].NC = o; 
            }
            i++;
            if(i==16){
                break;
            }   
        }
        e=1; 
    }
    System.out.println("aaa");
    
    //Octavos de final
   
    for(u=0;u<8;u++){
    a=0;
    e=0;
    o=0;
    while(e==0){
        numeros[a] = a;
        a++;
        if(numeros[a]==17){
            e=1;
        }        
    }
    
    a=(int)(Math.random() * 17) + 1;
    while (numeros[a]==0){ 
        a=(int)(Math.random() * 17) + 1;
    }
    numeros[a]=0;
    
    j=(int)(Math.random() * 17) + 1;
    while (numeros[a]==0){ 
        j=(int)(Math.random() * 17) + 1;
    }
    numeros[j]=0;
    
    if(EL[a].NC < EL[j].NC){
        c=EL[j].N3; 
    }else{
        if(EL[j].NC < EL[a].NC){
            c=EL[a].N3;
            
        }else{
            c=(int)(Math.random() * 2) + 1;
            if(c==1){
                c=EL[j].N3;
            }else{
                c=EL[a].N3;
            }
        }
        
        
    }
    
    
    System.out.println("Equipo " +EL[a].N3 + " (nivel de juego " +EL[a].NC+ " ) v/s Equipo " + EL[j].N3+ " (nivel de juego " +EL[j].NC+ " ), resultado: Ganador Equipo " + c);
    numeros2[o]=c;
    o++;
    } 
    //Define ganador de cuartos de final
    for(u=0;u<4;u++){
    a=0;
    e=0;
    o=0;
    
    
    a=(int)(Math.random() * 9) + 1;
    while (numeros2[a]==0){ 
        a=(int)(Math.random() * 9) + 1;
    }
    numeros2[a]=0;
    
    j=(int)(Math.random() * 17) + 1;
    while (numeros2[a]==0){ 
        j=(int)(Math.random() * 17) + 1;
    }
    numeros2[j]=0;
    
    if(EL[a].NC < EL[j].NC){
        c=EL[j].N3; 
    }else{
        if(EL[j].NC < EL[a].NC){
            c=EL[a].N3;
            
        }else{
            c=(int)(Math.random() * 2) + 1;
            if(c==1){
                c=EL[j].N3;
            }else{
                c=EL[a].N3;
            }
        }
        
        
    }
    
    
    System.out.println("Equipo " +EL[a].N3 + " (nivel de juego " +EL[a].NC+ " ) v/s Equipo " + EL[j].N3+ " (nivel de juego " +EL[j].NC+ " ), resultado: Ganador Equipo " + c);
    numeros[o]=c;
    o++;
    }
    //Define ganador de semi finales
    for(u=0;u<2;u++){
    a=0;
    e=0;
    o=0;
    
    
    a=(int)(Math.random() * 9) + 1;
    while (numeros[a]==0){ 
        a=(int)(Math.random() * 9) + 1;
    }
    numeros[a]=0;
    
    j=(int)(Math.random() * 17) + 1;
    while (numeros[a]==0){ 
        j=(int)(Math.random() * 17) + 1;
    }
    numeros[j]=0;
    
    if(EL[a].NC < EL[j].NC){
        c=EL[j].N3; 
    }else{
        if(EL[j].NC < EL[a].NC){
            c=EL[a].N3;
            
        }else{
            c=(int)(Math.random() * 2) + 1;
            if(c==1){
                c=EL[j].N3;
            }else{
                c=EL[a].N3;
            }
        }
        
        
    }
    
    
    System.out.println("Equipo " +EL[a].N3 + " (nivel de juego " +EL[a].NC+ " ) v/s Equipo " + EL[j].N3+ " (nivel de juego " +EL[j].NC+ " ), resultado: Ganador Equipo " + c);
    numeros2[o]=c;
    o++;
    }
     
    //Define ganador de final
    a=0;
    e=0;
    o=0;
    
    
    a=(int)(Math.random() * 9) + 1;
    while (numeros2[a]==0){ 
        a=(int)(Math.random() * 9) + 1;
    }
    numeros2[a]=0;
    
    j=(int)(Math.random() * 17) + 1;
    while (numeros2[a]==0){ 
        j=(int)(Math.random() * 17) + 1;
    }
    numeros2[j]=0;
    
    if(EL[a].NC < EL[j].NC){
        c=EL[j].N3; 
    }else{
        if(EL[j].NC < EL[a].NC){
            c=EL[a].N3;
            
        }else{
            c=(int)(Math.random() * 2) + 1;
            if(c==1){
                c=EL[j].N3;
            }else{
                c=EL[a].N3;
            }
        }
        
        
    }
    
    
    System.out.println("Equipo " +EL[a].N3 + " (nivel de juego " +EL[a].NC+ " ) v/s Equipo " + EL[j].N3+ " (nivel de juego " +EL[j].NC+ " ), resultado: Ganador Equipo " + c);
        
  }  
}