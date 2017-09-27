

import java.util.Random;


public class Liga {
  private Equipo[] pos;
    int i;
    Random rnd = new Random();
  public void Equipos(){
        pos = new Equipo[16];
        for(int i=0 ; i<16 ; i++){
            Equipo eq = new Equipo();
            pos[i]= eq;
        }
        for(int i=0;i<8;i++){
            System.out.println("Equipo:" + pos[i].ID + "Nivel de juego:"+pos[i].nivelColect+ "vs Equipo:" + pos[i+1].ID+"Nivel de juego:"+pos[i+1].nivelColect);
            if(pos[i].nivelColect>pos[i+1].nivelColect){
            System.out.println("El ganador fue equipo" +pos[i].ID);
        }else if(pos[i].nivelColect==pos[i+1].nivelColect){
                System.out.println("Se lanza una moneda");
                if(rnd.nextInt(99)>50){
                  System.out.println("el ganador fue el equipo" +pos[i].ID);
                }else{
                  System.out.println("el ganador fue el equipo" +pos[i+1].ID);
                }
            }
        else{
            System.out.println("El ganador fue el Equipo" +pos[i+1].ID);
        }  
    }
        System.out.println("CUARTOS DE FINAL");
        for(int i=0;i<4;i++){
            System.out.println("Equipo:" + pos[i].ID + "Nivel de juego:"+pos[i].nivelColect+ "vs Equipo:" + pos[i+1].ID+"Nivel de juego:"+pos[i+1].nivelColect);
            if(pos[i].nivelColect>pos[i+1].nivelColect){
            System.out.println("El ganador fue equipo" +pos[i].ID);
        }else if(pos[i].nivelColect==pos[i+1].nivelColect){
                System.out.println("Se lanza una moneda");
                if(rnd.nextInt(99)>50){
                  System.out.println("el ganador fue el equipo" +pos[i].ID);
                }else{
                  System.out.println("el ganador fue el equipo" +pos[i+1].ID);
                }
            }
        else{
            System.out.println("El ganador fue el Equipo" +pos[i+1].ID);
        }  
  }
                System.out.println("SEMIFINAL");

        for(int i=0;i<2;i++){
            System.out.println("Equipo:" + pos[i].ID + "Nivel de juego:"+pos[i].nivelColect+ "vs Equipo:" + pos[i+1].ID+"Nivel de juego:"+pos[i+1].nivelColect);
            if(pos[i].nivelColect>pos[i+1].nivelColect){
            System.out.println("El ganador fue equipo" +pos[i].ID);
        }else if(pos[i].nivelColect==pos[i+1].nivelColect){
                System.out.println("Se lanza una moneda");
                if(rnd.nextInt(99)>50){
                  System.out.println("el ganador fue el equipo" +pos[i].ID);
                }else{
                  System.out.println("el ganador fue el equipo" +pos[i+1].ID);
                }
            }
        else{
            System.out.println("El ganador fue el Equipo" +pos[i+1].ID);
        }  
  }
  } public void fin(){
      System.out.println("Equipo:" + pos[i].ID + "vs Equipo:" + pos[i+1].ID);
      if(pos[i].nivelColect>pos[i+1].nivelColect){
            System.out.println("El ganador fue equipo" +pos[i].ID);
        }else if(pos[i].nivelColect==pos[i+1].nivelColect){
                System.out.println("Se lanza una moneda");
                if(rnd.nextInt(99)>50){
                  System.out.println("el ganador fue el equipo" +pos[i].ID);
                }else{
                  System.out.println("el ganador fue el equipo" +pos[i+1].ID);
                }
            }
        else{
            System.out.println("El ganador fue el Equipo" +pos[i+1].ID);
        }
  }
        
    }      

    


       
        
         
 
  
  