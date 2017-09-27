
public class Comuna extends OrganizacionGeografica {

    private Provincia provincia;

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    @Override
    public String toString() {
        return String.format("%s en %s", super.getNombre(), this.provincia.toString());
    }
}
