
package certamen2;
public class Datos {

   private String a_paterno;
   private String a_materno;
   private String nombre;
   
   //a1=asignatuta 1
   private float a1n_quiz1;
   private float a1n_quiz2;
   private float a1n_quiz3;
   private float a1n_tarea1;
   private float a1n_tarea2;
   private float a1n_certamen1;
   private float a1n_certamen2;
   private float a1n_certamen3;
   
   //a2=asignatura 2
    private float a2n_control1;
    private float a2n_control2;
    private float a2n_control3;
    private float a2n_tarea1;
    private float a2n_tarea2;
    private float a2n_certamen1;
    private float a2n_certamen2;
    private float a2n_certamen3;
    
    //constructor que recibe parametros dados anteriormente
    public Datos( String a_paterno,String a_materno,String nombre, float a1n_quiz1, float a1n_quiz2,float a1n_quiz3, float a1n_tarea1,float a1n_tarea2
    ,float a1n_certamen1,float a1n_certamen2,float a1n_certamen3,float a2n_control1,float a2n_control2,float a2n_control3,float a2n_tarea1,float a2n_tarea2
    ,float a2n_certamen1,float a2n_certamen2,float a2n_certamen3){
        
        this.a_paterno=a_paterno;
        this.a_materno=a_materno;
        this.nombre=nombre;
        
        this.a1n_quiz1=a1n_quiz1;
        this.a1n_quiz2=a1n_quiz2;
        this.a1n_quiz3=a1n_quiz3;
        this.a1n_tarea1=a1n_tarea1;
        this.a1n_tarea2=a1n_tarea2;
        this.a1n_certamen1=a1n_certamen1;
        this.a1n_certamen2=a1n_certamen2;
        this.a1n_certamen3=a1n_certamen3;
        
        this.a2n_control1=a2n_control1;
        this.a2n_control2=a2n_control2;
        this.a2n_control3=a2n_control3;
        this.a2n_tarea1=a2n_tarea1;
        this.a2n_tarea2=a2n_tarea2;
        this.a2n_certamen1=a2n_certamen1;
        this.a2n_certamen2=a2n_certamen2;
        this.a2n_certamen3=a2n_certamen3;
        
    
    }

    public Datos(){
    }
    
    
    //ahora creo los setters y getters con las variables 
    public String getA_paterno() {
        return a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public String getNombre() {
        return nombre;
    }

    public float getA1n_quiz1() {
        return a1n_quiz1;
    }

    public float getA1n_quiz2() {
        return a1n_quiz2;
    }

    public float getA1n_quiz3() {
        return a1n_quiz3;
    }

    public float getA1n_tarea1() {
        return a1n_tarea1;
    }

    public float getA1n_tarea2() {
        return a1n_tarea2;
    }

    public float getA1n_certamen1() {
        return a1n_certamen1;
    }

    public float getA1n_certamen2() {
        return a1n_certamen2;
    }

    public float getA1n_certamen3() {
        return a1n_certamen3;
    }

    public float getA2n_control1() {
        return a2n_control1;
    }

    public float getA2n_control2() {
        return a2n_control2;
    }

    public float getA2n_control3() {
        return a2n_control3;
    }

    public float getA2n_tarea1() {
        return a2n_tarea1;
    }

    public float getA2n_tarea2() {
        return a2n_tarea2;
    }

    public float getA2n_certamen1() {
        return a2n_certamen1;
    }

    public float getA2n_certamen2() {
        return a2n_certamen2;
    }

    public float getA2n_certamen3() {
        return a2n_certamen3;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setA1n_quiz1(float a1n_quiz1) {
        this.a1n_quiz1 = a1n_quiz1;
    }

    public void setA1n_quiz2(float a1n_quiz2) {
        this.a1n_quiz2 = a1n_quiz2;
    }

    public void setA1n_quiz3(float a1n_quiz3) {
        this.a1n_quiz3 = a1n_quiz3;
    }

    public void setA1n_tarea1(float a1n_tarea1) {
        this.a1n_tarea1 = a1n_tarea1;
    }

    public void setA1n_tarea2(float a1n_tarea2) {
        this.a1n_tarea2 = a1n_tarea2;
    }

    public void setA1n_certamen1(float a1n_certamen1) {
        this.a1n_certamen1 = a1n_certamen1;
    }

    public void setA1n_certamen2(float a1n_certamen2) {
        this.a1n_certamen2 = a1n_certamen2;
    }

    public void setA1n_certamen3(float a1n_certamen3) {
        this.a1n_certamen3 = a1n_certamen3;
    }

    public void setA2n_control1(float a2n_control1) {
        this.a2n_control1 = a2n_control1;
    }

    public void setA2n_control2(float a2n_control2) {
        this.a2n_control2 = a2n_control2;
    }

    public void setA2n_control3(float a2n_control3) {
        this.a2n_control3 = a2n_control3;
    }

    public void setA2n_tarea1(float a2n_tarea1) {
        this.a2n_tarea1 = a2n_tarea1;
    }

    public void setA2n_tarea2(float a2n_tarea2) {
        this.a2n_tarea2 = a2n_tarea2;
    }

    public void setA2n_certamen1(float a2n_certamen1) {
        this.a2n_certamen1 = a2n_certamen1;
    }

    public void setA2n_certamen2(float a2n_certamen2) {
        this.a2n_certamen2 = a2n_certamen2;
    }

    public void setA2n_certamen3(float a2n_certamen3) {
        this.a2n_certamen3 = a2n_certamen3;
    }

    @Override
    public String toString() {
        return "Datos{" + "a_paterno=" + a_paterno + ", a_materno=" + a_materno + ", nombre=" + nombre + ", a1n_quiz1=" + 
                a1n_quiz1 + ", a1n_quiz2=" + a1n_quiz2 + ", a1n_quiz3=" + a1n_quiz3 + ", a1n_tarea1=" + a1n_tarea1 + ", a1n_tarea2="
                + a1n_tarea2 + ", a1n_certamen1=" + a1n_certamen1 + ", a1n_certamen2=" + a1n_certamen2 + ", a1n_certamen3=" + a1n_certamen3
                + ", a2n_control1=" + a2n_control1 + ", a2n_control2=" + a2n_control2 + ", a2n_control3=" + a2n_control3 + ", a2n_tarea1=" + 
                a2n_tarea1 + ", a2n_tarea2=" + a2n_tarea2 + ", a2n_certamen1=" + a2n_certamen1 + ", a2n_certamen2=" + a2n_certamen2 + ", "
                + "a2n_certamen3=" + a2n_certamen3 + '}';
    }
    
    
     
}
