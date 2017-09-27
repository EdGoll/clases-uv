public class Nota {
    private double valor = 1.0;
    
    public void setValor(double nuevoValor) throws RangoException {
        // si esta en el rango
        if (nuevoValor >= 1.0 && nuevoValor <= 7.0){
            //se acepta
            valor = nuevoValor;
        } else {
            throw new RangoException("Nota fuera de Rango");
        }
    }

    public double getValor(){
        return valor;
    }
}
