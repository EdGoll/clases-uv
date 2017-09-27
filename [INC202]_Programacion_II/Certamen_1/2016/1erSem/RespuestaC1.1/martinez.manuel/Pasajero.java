public class Pasajero {
	

    private String pasajeros;
    private String estado;
    private String clase;
    private String nombre;
    private String sexo;
    private String edad;
    private String tamFamilia;
    private String ticket;
    private String tarifaPasaje;
    //cabina
    private String embarcadoEn;

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTamFamilia() {
        return tamFamilia;
    }

    public void setTamFamilia(String tamFamilia) {
        this.tamFamilia = tamFamilia;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTarifaPasaje() {
        return tarifaPasaje;
    }

    public void setTarifaPasaje(String tarifaPasaje) {
        this.tarifaPasaje = tarifaPasaje;
    }

    public String getEmbarcadoEn() {
        return embarcadoEn;
    }

    //ignoraré el dato cabin
    public void setEmbarcadoEn(String embarcadoEn) {
        this.embarcadoEn = embarcadoEn;
    }
}