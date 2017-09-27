import java.util.Random;

public class Password {
	public String contrasenia = "";
	public int longitud = 8;
	private Random rand = new Random();
	private char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};

	public void generar() {
        int pos;
		for (int i = 0; i < longitud; i++) {
			if(rand.nextInt(2) == 0) {
                pos = rand.nextInt(35);
                if (!Character.isDigit(caracteres[pos])) {
                    contrasenia += String.valueOf(caracteres[pos]).toLowerCase();
                } else {
                    contrasenia += String.valueOf(caracteres[pos]);
                }
			} else {
                contrasenia += String.valueOf(caracteres[rand.nextInt(26)]);
            }
		}
	}

	public boolean esFuerte() {
		if(longitud >= 8) {
			int countMay = 0, countMin = 0, countNum = 0;
			for (int i = 0; i < longitud; i++) {
				if(Character.isUpperCase(contrasenia.charAt(i))) {
					countMay++;
				} else if(Character.isLowerCase(contrasenia.charAt(i))) {
					countMin++;
				} else if(Character.isDigit(contrasenia.charAt(i))) {
					countNum++;
				}
			}
            if (countMay >= 2 && countMin >= 1 && countNum >= 5) {
                return true;
            } else {
                return false;
            }
		} else {
			return false;
		}
	}

	public String mostrar() {
		return contrasenia;
	}
}