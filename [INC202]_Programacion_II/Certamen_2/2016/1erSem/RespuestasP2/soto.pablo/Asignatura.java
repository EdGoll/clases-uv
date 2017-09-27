


public class Asignatura {
       private String id;
       private String q1;
       private String q2;
       private String q3;
       private String nt1;
       private String nt2;
       private String c1;
       private String c2;
       private String c3;
       
       public Asignatura(String id, String q1, String q2, String q3, String nt1, String nt2, String c1, String c2, String c3){
              this.id=id;
              this.q1=q1;
              this.q2=q2;
              this.q3=q3;
              this.nt1=nt1;
              this.nt2=nt2;
              this.c1=c1;
              this.c2=c2;
              this.c3=c3;
              
       }
       
       Asignatura(){
           
       }
       
       public void setID(String id){
              this.id=id;
       }
       
       public String getID(){
              return id;
       }
       
       public void setQ1(String q1){
              this.q1=q1;
       }
       
       public String getQ1(){
              return q1;
       }
       
       public void setQ2(String q2){
              this.q2=q2;
       }
       
       public String getQ2(){
              return q2;
       }
       
        public void setQ3(String q3){
              this.q3=q3;
       }
       
       public String getQ3(){
              return q3;
       }
       
        public void setNT1(String nt1){
              this.nt1=nt1;
       }
       
       public String getNT1(){
              return nt1;
       }
       
        public void setNT2(String nt2){
              this.nt2=nt2;
       }
       
       public String getNT2(){
              return nt2;
       }
       
        public void setC1(String c1){
              this.c1=c1;
       }
       
       public String getC1(){
              return c1;
       }
    
        public void setC2(String c2){
              this.c2=c2;
       }
       
       public String getC2(){
              return c2;
       }
       
       public void setC3(String c3){
              this.c3=c3;
       }
       
       public String getC3(){
              return c3;
       }
       
       @Override
       public String toString(){
              return String.format("%s %s %s %s %s %s %s %s %s",id,q1,q2,q3,nt1,nt2,c1,c2,c3);    
       } 
      
}
