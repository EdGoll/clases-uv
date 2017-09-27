public class Asignatura1 {
       
       private String id;
       private String co1;
       private String co2;
       private String co3;
       private String nt1;
       private String nt2;
       private String c1;
       private String c2;
       private String c3;
       
       public Asignatura1(String id, String co1, String co2, String co3, String nt1, String nt2, String c1, String c2, String c3){
              this.id=id;
              this.co1=co1;
              this.co2=co2;
              this.co3=co3;
              this.nt1=nt1;
              this.nt2=nt2;
              this.c1=c1;
              this.c2=c2;
              this.c3=c3;
              
       }
       
       Asignatura1(){
           
       }
       
       public void setID(String id){
              this.id=id;
       }
       
       public String getID(){
              return id;
       }
       
       public void setCO1(String co1){
              this.co1=co1;
       }
       
       public String getCO1(){
              return co1;
       }
       
       public void setCO2(String co2){
              this.co2=co2;
       }
       
       public String getCO2(){
              return co2;
       }
       
        public void setCO3(String co3){
              this.co3=co3;
       }
       
       public String getCO3(){
              return co3;
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
              return String.format("%s %s %s %s %s %s %s %s %s",id,co1,co2,co3,nt1,nt2,c1,c2,c3);    
       } 
      
}

