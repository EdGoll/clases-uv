
public class datos_herencia {
    public String DNI;
    public String Nombre;
    public String Apellido;
    public String Edad;
    public String Direccion_L_calle;
    public String Direccion_L_numero;
    public String Direccion_L_Region;
    public String Direccion_L_comuna;
    public String Direccion_L_provincia;
    public String Direccion_P_calle;
    public String Direccion_P_numero;
    public String Direccion_P_region;
    public String Direccion_P_comuna;
    public String Direccion_P_provincia;
    
    public datos_herencia(String DNI, String Nombre, String Apellido, String Edad, String Direccion_L_calle, String Direccion_L_numero, String Direccion_L_region, String Direccion_L_comuna, String Direccion_L_provincia, String Direccion_P_calle, String Direccion_P_numero, String Direccion_P_region, String Direccion_P_comuna, String Direccion_P_provincia){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Direccion_L_calle = Direccion_L_calle;
        this.Direccion_L_numero = Direccion_L_numero;
        this.Direccion_L_Region = Direccion_L_region;
        this.Direccion_L_comuna = Direccion_L_comuna;
        this.Direccion_L_provincia = Direccion_L_provincia;
        this.Direccion_P_calle = Direccion_P_calle;
        this.Direccion_P_numero = Direccion_P_numero;
        this.Direccion_P_region = Direccion_P_region;
        this.Direccion_P_comuna = Direccion_P_comuna;
        this.Direccion_P_provincia = Direccion_P_provincia;
    }
    
    public String getDNI(){
        return DNI;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getEdad(){
        return Edad;
    }
    public String getDireccion_L_calle(){
        return Direccion_L_calle;
    }
    public String getDireccion_L_numero(){
        return Direccion_L_numero;
    }
    public String getDireccion_L_Region(){
        return Direccion_L_Region;
    }
    public String getDireccion_L_comuna(){
        return Direccion_L_comuna;
    }
    public String getDireccion_L_provincia(){
        return Direccion_L_provincia;
    }
    public String getDireccion_P_calle(){
        return Direccion_P_calle;
    }
    public String getDireccion_P_numero(){
        return Direccion_P_numero;
    }
    public String getDireccion_P_region(){
        return Direccion_P_region;
    }
    public String getDireccion_P_comuna(){
        return Direccion_P_comuna;
    }
    public String getDireccion_P_provincia(){
        return Direccion_P_provincia;
    }
}
