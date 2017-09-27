/*
Cantidad de recien nacidos muertos en el 2008
Porcentaje de la poblacion total sobre 15 anios que se ha empleado en 2007 en cada pais*/
package Porcentajes;
public class Preguntas {
    //1- Paises con mayor cantidad de recien nacidos muertos en el 2008
    //2- Paises con menor cantidad de recien nacidos muertos en el 2008
    //3- Paises con mayor porcentaje que ha empleado en el 2007
    //4- Paises con menor porcentaje que ha empleado en el 2007
    //5- Total de recien nacidos muertos.
    //6- Mostrar todos los datos7
    private String Pais;
    private String RNM; //RNM->Recien nacidos muertos
    private String PE; //PE-> Porcentaje de la poblacion total que trabaja en cada pais.
    public String getPais(){
        return this.Pais;
    }
    public void setPais(String Pais){
        this.Pais = Pais;
    }
    public String getRNM(){
        return this.RNM;
    }
    public void setRNM(String RNM){
        this.RNM = RNM;
    }
    public String getPE(){
        return this.PE;
    }
    public void setPE(String PE){
        this.PE = PE;
    }

}
