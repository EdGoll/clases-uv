


import java.util.List;


public class Liga {
    private List<Encuentro> octavos;
    private List<Encuentro>  cuartos;
    private List<Encuentro> semifinal;
    private List<Encuentro> final_liga;

    public List<Encuentro> getOctavos() {
        return octavos;
    }

    public void setOctavos(List<Encuentro> octavos) {
        this.octavos = octavos;
    }

    public List<Encuentro> getCuartos() {
        return cuartos;
    }

    public void setCuartos(List<Encuentro> cuartos) {
        this.cuartos = cuartos;
    }

    public List<Encuentro> getSemifinal() {
        return semifinal;
    }

    public void setSemifinal(List<Encuentro> semifinal) {
        this.semifinal = semifinal;
    }

    public List<Encuentro> getFinal_liga() {
        return final_liga;
    }

    public void setFinal_liga(List<Encuentro> final_liga) {
        this.final_liga = final_liga;
    }


}
