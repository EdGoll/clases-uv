
public class Provincia extends OrganizacionGeografica {

    private Region region;

    public void setRegion(Region region){
        this.region = region;
    }
    
    @Override
    public String toString() {
        return String.format("%s en %s", super.getNombre(), this.region.toString());
    }
}
