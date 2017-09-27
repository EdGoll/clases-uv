


public class Persona {
 private String dni=null;
 private String nombre=null;
 private String edad=null;
 private String[] adress=new String[3];
 private String[] wadress=new String[3];
 private String tipo=null;
 private String aux=null;
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setAux(String edad) {
        this.edad = edad;
    }

    public void setAdress(String[] adress) {
        this.adress[0] = adress[0];
        this.adress[1] = adress[1];
        this.adress[2] = adress[2];
    }
    
    public void setWadress(String[] wadress) {
        this.wadress[0] = wadress[0];
        this.wadress[1] = wadress[1];
        this.wadress[2] = wadress[2];
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String[] getAdress() {
        return adress;
    }

    public String[] getWadress() {
        return wadress;
    }

    public String getTipo() {
        return tipo;
    }
 
 @Override
 public String toString(){
  return dni+";"+nombre+";"+edad+";"+adress[0]+";"+adress[1]+";"+adress[2]+";"+wadress[0]+";"+wadress[1]+";"+wadress[2]+";"+tipo+";"+aux;   
 }
}
