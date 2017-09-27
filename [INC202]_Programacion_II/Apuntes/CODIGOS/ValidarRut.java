public class ValidarRut{
public static void validar(int rut) {
//Según el algoritmo de generación de Dígito Verificador
int m = 0, s = 1;
for (; rut != 0; rut /= 10) {

s = (s + rut % 10 * (9 - m++ % 6)) % 11;

System.out.println("s : "+s);
}
		System.out.println("sff : "+s);	}
public static void main(String arg[]){
validar(8832375);
}}

