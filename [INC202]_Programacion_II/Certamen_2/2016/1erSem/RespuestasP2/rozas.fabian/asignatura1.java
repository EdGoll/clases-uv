
public class asignatura1 {
    public int id;
    public int notaQ1, notaQ2, notaQ3;
    public int notaT1, notaT2;
    public int notaC1, notaC2, notaC3;
    int PC, PT, PQ, notaFinal;
    
    public asignatura1(int id,int notaQ1,int notaQ2,int notaQ3,int notaT1,int notaT2,int notaC1,int notaC2,int notaC3){
        this.id=id;
        this.notaQ1=notaQ1;
        this.notaQ2=notaQ2;
        this.notaQ3=notaQ3;
        this.notaT1=notaT1;
        this.notaT2=notaT2;
        this.notaC1=notaC1;
        this.notaC2=notaC2;
        this.notaC3=notaC3;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getNotaQ1(){
        return notaQ1;
    }
    
    public void setNotaQ1(int notaQ1){
        this.notaQ1 = notaQ1;
    }
    
     public int getNotaQ2(){
        return notaQ2;
    }
    
    public void setNotaQ2(int notaQ2){
        this.notaQ2 = notaQ2;
    }
    
     public int getNotaQ3(){
        return notaQ3;
    }
    
    public void setNotaQ3(int notaQ3){
        this.notaQ3 = notaQ3;
    }
    
     public int getNotaT1(){
        return notaT1;
    }
    
    public void setNotaT1(int notaT1){
        this.notaT1 = notaT1;
    }
    
    public int getNotaT2(){
        return notaT2;
    }
    
    public void setNotaT2(int notaT2){
        this.notaT2 = notaT2;
    }
    
    public int getNotaC1(){
        return notaC1;
    }
    
    public void setNotaC1(int notaC1){
        this.notaC1 = notaC1;
    }
    
     public int getNotaC2(){
        return notaC2;
    }
    
    public void setNotaC2(int notaC2){
        this.notaC2 = notaC2;
    }
     public int getNotaC3(){
        return notaC3;
    }
    
    public void setNotaC3(int notaC3){
        this.notaC3 = notaC3;
    }
    
    public void calcularQuiz(){
        
        PQ= (notaQ1 + notaQ2 + notaQ3)/3;
        
    }
    
    public void calcularTareas(){
        
        PT = (notaT1 + notaT2)/2;
       
    }
    
    public void calculaCertamen(){
        
        PC= (notaC1 + notaC2 + notaC3)/3;
        
    }
    
    public int Notafinal(){

        notaFinal= (PQ+ PT + PC);
         if(PC>=40){
           return (int) (PC*0.7 + PQ*0.15 + PT*0.15) ;
            if(PC>=35){
                   return (int) (PC*0.8 + PQ*0.10 + PT*0.10) ;
                   
                   }
           else if(PC>=30){
                   return (int) (PC*0.9 + PQ*0.05 + PT*0.05) ;
           
}
                   else{
                   return PC;
                   }
        return 0;
    }
        return 0;
  

    }
}
