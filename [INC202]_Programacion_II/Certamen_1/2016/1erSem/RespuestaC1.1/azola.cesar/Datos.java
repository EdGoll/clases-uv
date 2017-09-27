package investigacionsocial;


public class Datos {
    private String nombrePais;
    private float nutricionCuidadosMedicos;
    private float sanidadDelAgua;
    private float albergues;
    private float seguridadPersonal;
    private float accesoConocimientosBasicos;
    private float accesoComunicacionInformacion;
    private float SaludYBienestar;
    private float sostenibilidadEcosistema;
    private float derechosPersonales;
    private float libertarYPropiaElecion;
    private float ToleranciaInclusion;
    private float AccesoEducacionSuperior;
    
      @Override
    public String toString() {
        return String.format("(%s) %s %s %s %s %s %s %s %s %s %s %s %s ", nombrePais, nutricionCuidadosMedicos, sanidadDelAgua, albergues, seguridadPersonal ,accesoConocimientosBasicos,accesoComunicacionInformacion,SaludYBienestar,sostenibilidadEcosistema,derechosPersonales,libertarYPropiaElecion,ToleranciaInclusion,AccesoEducacionSuperior);
    }
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public float getNutricionCuidadosMedicos() {
        return nutricionCuidadosMedicos;
    }

    public void setNutricionCuidadosMedicos(float nutricionCuidadosMedicos) {
        this.nutricionCuidadosMedicos = nutricionCuidadosMedicos;
    }

    public float getSanidadDelAgua() {
        return sanidadDelAgua;
    }

    public void setSanidadDelAgua(float sanidadDelAgua) {
        this.sanidadDelAgua = sanidadDelAgua;
    }

    public float getAlbergues() {
        return albergues;
    }

    public void setAlbergues(float albergues) {
        this.albergues = albergues;
    }

    public float getSeguridadPersonal() {
        return seguridadPersonal;
    }

    public void setSeguridadPersonal(float seguridadPersonal) {
        this.seguridadPersonal = seguridadPersonal;
    }

    public float getAccesoConocimientosBasicos() {
        return accesoConocimientosBasicos;
    }

    public void setAccesoConocimientosBasicos(float accesoConocimientosBasicos) {
        this.accesoConocimientosBasicos = accesoConocimientosBasicos;
    }

    public float getAccesoComunicacionInformacion() {
        return accesoComunicacionInformacion;
    }

    public void setAccesoComunicacionInformacion(float accesoComunicacionInformacion) {
        this.accesoComunicacionInformacion = accesoComunicacionInformacion;
    }

    public float getSaludYBienestar() {
        return SaludYBienestar;
    }

    public void setSaludYBienestar(float SaludYBienestar) {
        this.SaludYBienestar = SaludYBienestar;
    }

    public float getSostenibilidadEcosistema() {
        return sostenibilidadEcosistema;
    }

    public void setSostenibilidadEcosistema(float sostenibilidadEcosistema) {
        this.sostenibilidadEcosistema = sostenibilidadEcosistema;
    }

    public float getDerechosPersonales() {
        return derechosPersonales;
    }

    public void setDerechosPersonales(float derechosPersonales) {
        this.derechosPersonales = derechosPersonales;
    }

    public float getLibertarYPropiaElecion() {
        return libertarYPropiaElecion;
    }

    public void setLibertarYPropiaElecion(float libertarYPropiaElecion) {
        this.libertarYPropiaElecion = libertarYPropiaElecion;
    }

    public float getToleranciaInclusion() {
        return ToleranciaInclusion;
    }

    public void setToleranciaInclusion(float ToleranciaInclusion) {
        this.ToleranciaInclusion = ToleranciaInclusion;
    }

    public float getAccesoEducacionSuperior() {
        return AccesoEducacionSuperior;
    }

    public void setAccesoEducacionSuperior(float AccesoEducacionSuperior) {
        this.AccesoEducacionSuperior = AccesoEducacionSuperior;
    }
   
    
    
    }

    

