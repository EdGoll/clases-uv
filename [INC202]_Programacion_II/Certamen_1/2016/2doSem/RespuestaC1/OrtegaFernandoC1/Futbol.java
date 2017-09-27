

import java.util.ArrayList;
import java.util.Random;


public class Futbol {
    Random rd = new Random();
    private ArrayList<Equipos> Grupos = new ArrayList<Equipos>();
    public void llenar(){
        for(int i=1;i<17;i++){
        Equipos ep = new Equipos(i);
        Grupos.add(ep);
        System.out.println(i);
        }
    }
    public void juego(){
        int a,b,ganador,u=0;
        int[] liga = new int[16];
        int[] liga8 = new int[8];
        int[] liga4 = new int[4];
        int[] liga2 = new int[2];
        for(int i=0; i<16; i++){
           liga[i]=i;
       }
        while(u<8){
            a=rd.nextInt(16);
            b=rd.nextInt(16);
            
            if(a!=b){
                if(liga[a]!=-1 &&liga[b] !=-1){
                    liga8[u]=partido(liga[a],liga[b]);
                    liga[a]=-1;
                    liga[b]=-1;
                    u++;
                }
            }
        }
        u=0;
        while(u<4){
            a=rd.nextInt(8);
            b=rd.nextInt(8);
            if(a!=b){
                if(liga8[a]!=-1&&liga8[b]!=-1){
                    liga4[u]=partido(liga8[a],liga8[b]);
                    liga8[a]=-1;
                    liga8[b]=-1;
                    u++;
                }
            }
        }
        u=0;
        while(u<2){
            a=rd.nextInt(4);
            b=rd.nextInt(4);
            if(a!=b){
                if(liga4[a]!=-1&&liga4[b]!=-1){
                    liga2[u]=partido(liga4[a],liga4[b]);
                    liga4[a]=-1;
                    liga4[b]=-1;
                    u++;
                }
            }
        }
        ganador=partido(liga2[1],liga2[0]);
        System.out.println("el ganador de la liga es: "+(ganador+1));
    }
    public int partido(int a,int b){
        System.out.println("El equipo "+(a+1)+" con poder de juego: "+Grupos.get(a).getpower()+" juega contra el equipo: "+(b+1)+" con poder de juego:"+Grupos.get(b).getpower());
        if((Grupos.get(a).getpower()) > Grupos.get(b).getpower()){
            System.out.println("el equipo ganador es"+(a+1));
            return a;
        }else if((Grupos.get(a).getpower()) == Grupos.get(b).getpower()){
            if(rd.nextInt(1)==1){
                System.out.println("el equipo ganador es"+(a+1));
                return a;
            }
        }
        System.out.println("el equipo ganador es"+(b+1));
        return b;
        }
    }

