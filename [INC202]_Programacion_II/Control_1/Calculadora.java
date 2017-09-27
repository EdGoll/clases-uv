public class Calculadora {

    private double resultado = 0;
    private String operacion = "[Inicio " + resultado + "]\n";

    public Calculadora() {
        this.resultado = 0;
    }

    public Calculadora(double resultado, String operacion) {
        this.resultado = resultado;
        this.operacion = operacion;
    }

    public Calculadora suma(double numero) {
        resultado += numero;
        operacion += "[Suma " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora resta(double numero) {        
        resultado -= numero;
        operacion += "[Resta " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora multiplicacion(double numero) {
        resultado *= numero;
        operacion += "[Multiplicacion " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora division(double numero) {
        if (numero == 0) {
            operacion += "[Division " + numero + " = Error: Division por cero]\n";
        } else {
            resultado /= numero;
            operacion += "[Division " + numero + " = " + resultado + "]\n";
        }
        return this;
    }

    public Calculadora modulo(double numero) {
        if (numero == 0) {
            operacion += "[Modulo " + numero + " = Error: Division por cero]\n";
        } else {
            resultado %= numero;
            operacion += "[Modulo " + numero + " = " + resultado + "]\n";
        }
        return this;
    }

    public Calculadora binario() {
        operacion += "[Binario " + Integer.toBinaryString(
                new Double(resultado).intValue()) + "]\n";
        return this;
    }

    public Calculadora octal() {
        operacion += "[Octal " + Integer.toOctalString(
                new Double(resultado).intValue()) + "]\n";
        return this;
    }

    public Calculadora hexadecimal() {
        operacion += "[Hexadecimal " + Integer.toHexString(
                new Double(resultado).intValue()).toUpperCase() + "]\n";
        return this;
    }

    public Calculadora sin() {
        double numero = resultado;
        resultado = Math.sin(resultado);
        operacion += "[Seno " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora cos() {
        double numero = resultado;
        resultado = Math.cos(resultado);
        operacion += "[Coseno " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora tan() {
        double numero = resultado;
        resultado = Math.tan(resultado);
        operacion += "[Tangente " + numero + " = " + resultado + "]\n";
        return this;
    }
    
    public Calculadora abs() {
        double numero = resultado;
        resultado = Math.abs(resultado);
        operacion += "[Absoluto " + numero + " = " + resultado + "]\n";
        return this;
    }
    
    public Calculadora pow(int exponente) {
        double numero = resultado;
        resultado = Math.pow(resultado, exponente);
        operacion += "[Elevado " + numero + " = " + resultado + "]\n";
        return this;
    }

    public Calculadora sqrt() {
        double numero = resultado;
        resultado = Math.sqrt(resultado);
        operacion += "[Raiz " + numero + " = " + resultado + "]\n";
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("Operaciones: \n%sResultado Final: %s\n",
                operacion, resultado);
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.multiplicacion(5).resta(-10).abs().suma(-25).suma(15).
                multiplicacion(25).resta(10).division(0).division(2).modulo(0).
                modulo(3).multiplicacion(20).division(4).multiplicacion(3).suma(-15).
                abs().sin().cos().tan());

        c = new Calculadora();
        System.out.println(c.resta(0).suma(15).multiplicacion(5).resta(10).modulo(3).
                multiplicacion(20).division(4).multiplicacion(3).division(2).
                binario().octal().hexadecimal());
    }
}