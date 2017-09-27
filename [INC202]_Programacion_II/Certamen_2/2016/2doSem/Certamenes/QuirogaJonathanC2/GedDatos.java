import java.util.Scanner;

public class GetDatos extends DatosP,PersonaTipo,Alumno,Funcionario,Academico{


Scanner sn = new Scanner (System.in);
private String region;

public void menu(){

System.out.println("Ingrese su DNI:");
dni = sn.next();
System.out.println("Ingrese su nombre:");
nombre = sn.next();
System.out.println("Ingrese su apellido:");
apellido = sn.next();
System.out.println("Ingrese su edad:");
edad = sn.next();

private String region;
System.out.println("Seleccione una Region:");
System.out.println("1) ARICA Y PARINACOTA XV. ";
System.out.println("2) TARAPACA I.";
System.out.println("3) ANTOFAGASTA II.";
System.out.println("4) ATACAMA III.";
System.out.println("5) COQUIMBO IV.";
System.out.println("6) VALPARAISO V.";
System.out.println("7) DEL LIBERTADOR GRAL. BERNARDO OHIGGINS VI.";
System.out.println("8) DEL MAULE VII.";
System.out.println("9) DEL BIOBIO VIII.";
System.out.println("10) DE LA ARAUCANIA IX.";
System.out.println("11) DE LOS RIOS XIV.";
System.out.println("12) DE LOS LAGOS X.";
System.out.println("13) AISEN DEL GRAL. CARLOS IBANEZ DEL CAMPO XI.";
System.out.println("14) MAGALLANES XII.";
System.out.println("15) METROPOLITANA DE SANTIAGO RM.";

region = sn.next();
Swiitch (region){
	case 1: { //ARICA Y PARINACOTA
			Scanner sn = new Scanner (System.in);
			private String provincia;
			System.out.println("Seleccione una Provincia:");
			System.out.println("1) ARICA.");
			System.out.println("2) PARINACOTA.");

			provincia = sn.next();
			Switch (provincia){
			case 1: {//arica
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) ARICA.");
					System.out.println("2) CAMARONES.");
					if (sn.next() == 1){
						comuna = "Arica";
					}else
						comuna = "Camarones";
					}
					break;
			}
			case 2: {//parinacota
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) PUTRE.");
					System.out.println("2) GENERAL LAGOS.");
					if (sn.next() == 1){
						comuna = "Putre";
					}else
						comuna = "general.lagos";
					}
					break;
			}
			default : System.out.println("Error.");
			}
	}
	case 2:{ //Tarapaca
			Scanner sn = new Scanner (System.in);
			private String provincia;
			System.out.println("Seleccione una Provincia:");
			System.out.println("1) IQUIQUE.");
			System.out.println("2) TAMARUGAL.");

			provincia = sn.next();
			Switch (provincia){
			case 1: {
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) IQUIQUE.");
					System.out.println("2) ALTO HOSPICIO.");
					if (sn.next() == 1){
						comuna = "Iquique";
					}else
						comuna = "Alto.Hospicio";
					}
					break;
			}
			case 2: {
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) POZO ALMONTE.");
					System.out.println("2) CAMINA.");
					System.out.println("3) HUARA.");
					System.out.println("4) PICA.");
					if (sn.next() == 1){
						comuna = "Pozo Almonte";
					}
					if (sn.next()== 2){
						comuna = "Camina";
					}
					if (sn.next()== 3){
						comuna = "Huara";
					}
					if (sn.next()== 4){
						comuna = "Pica";
					}
					break;
			}
			default : System.out.println("Error.");

	}
	case 3:{ //antofagasta
			Scanner sn = new Scanner (System.in);
			private String provincia;
			System.out.println("Seleccione una Provincia:");
			System.out.println("1) ANTOFAGASTA.");
			System.out.println("2) EL LOA.");
			System.out.println("3) TOCOPILLA.");
			

			provincia = sn.next();
			Switch (provincia){
			case 1: {
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) ANTOFAGASTA.");
					System.out.println("2) MEJILLONES.");
					System.out.println("3) SIERRA GORI.");
					System.out.println("4) TAL TAL.");
					if (sn.next() == 1){
						comuna = "antofagasta";
					}
					if (sn.next() == 2){
						comuna = "mejillones";
					}
					if (sn.next() == 3){
						comuna = "sierra.gori";
					}
					if (sn.next() == 4){
						comuna = "tal tal";
					}
						break;
			}
			case 2: {
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) CALAMA.");
					System.out.println("2) OLLAGUE.");
					System.out.println("3) SAN PEDRO DE ATACAMA.");
					if (sn.next() == 1){
						comuna = "calama";
					}
					if (sn.next()== 2){
						comuna = "ollague";
					}
					if (sn.next()== 3){
						comuna = "san pedro de acatama";
					}
					break;
			}
			case 3: {
					Scanner sn = new Scanner (System.in);
					private String comuna;
					System.out.println("Seleccione una Comuna:");
					System.out.println("1) TOCOPILLA.");
					System.out.println("2) MARIA ELENA.");
					
					if (sn.next() == 1){
						comuna = "tocopilla";
					}
					if (sn.next()== 2){
						comuna = "maria elena";
					}
					break;
			}
			
			default : System.out.println("Error.");

}
}
}