
public class Conversor {
	private String c1, c2;

	public synchronized String morse(String c1) {

		this.c1 = ":";// se le asignan los 2 puntos para que la variable no
						// tenga el resultado anterior
		char c[] = c1.toCharArray();

		for (int i = 0; i < c1.length(); i++) {

			switch (c[i]) {

			case 'A':
				this.c1 = this.c1 + ".-";
				break;

			case 'B':
				this.c1 = this.c1 + "-...";
				break;

			case 'C':
				this.c1 = this.c1 + "-.-.";
				break;

			case 'D':
				this.c1 = this.c1 + "-..";
				break;

			case 'E':
				this.c1 = this.c1 + ".";
				break;

			case 'F':
				this.c1 = this.c1 + "..-.";
				break;

			case 'G':
				this.c1 = this.c1 + "--.";
				break;

			case 'H':
				this.c1 = this.c1 + "....";
				break;

			case 'I':
				this.c1 = this.c1 + "..";
				break;

			case 'J':
				this.c1 = this.c1 + ".---";
				break;

			case 'K':
				this.c1 = this.c1 + "-.-";
				break;

			case 'L':
				this.c1 = this.c1 + ".-..";
				break;

			case 'M':
				this.c1 = this.c1 + "--";
				break;

			case 'N':
				this.c1 = this.c1 + "-.";
				break;

			case 'O':
				this.c1 = this.c1 + "---";
				break;

			case 'P':
				this.c1 = this.c1 + ".--.";
				break;

			case 'Q':
				this.c1 = this.c1 + "--.-";
				break;

			case 'R':
				this.c1 = this.c1 + ".-.";
				break;

			case 'S':
				this.c1 = this.c1 + "...";
				break;

			case 'T':
				this.c1 = this.c1 + "-";
				break;

			case 'U':
				this.c1 = this.c1 + "..-";
				break;

			case 'V':
				this.c1 = this.c1 + "...-";
				break;

			case 'W':
				this.c1 = this.c1 + ".--";
				break;

			case 'X':
				this.c1 = this.c1 + "-..-";
				break;

			case 'Y':
				this.c1 = this.c1 + "-.--";
				break;

			case 'Z':
				this.c1 = this.c1 + "--..";
				break;

			case '1':
				this.c1 = this.c1 + ".----";
				break;

			case '2':
				this.c1 = this.c1 + "..---";
				break;

			case '3':
				this.c1 = this.c1 + "...--";
				break;

			case '4':
				this.c1 = this.c1 + "....-";
				break;

			case '5':
				this.c1 = this.c1 + ".....";
				break;

			case '6':
				this.c1 = this.c1 + "-....";
				break;

			case '7':
				this.c1 = this.c1 + "--...";
				break;

			case '8':
				this.c1 = this.c1 + "---..";
				break;

			case '9':
				this.c1 = this.c1 + "----.";
				break;

			case '0':
				this.c1 = this.c1 + "-----";
				break;

			}

		}
		return this.c1;
	}

	public synchronized String ascci(String c) {
		this.c2 = ":";// se le asignan los 2 puntos como comienzo para borrar
						// los resultados anteriores
		char a[] = c.toCharArray();
		for (int i = 0; i < c.length(); i++) {
			switch (a[i]) {

			case '0':
				this.c2 = this.c2 + "&#48;";
				break;

			case '1':
				this.c2 = this.c2 + "&#49;";
				break;

			case '2':
				this.c2 = this.c2 + "&#50;";
				break;

			case '3':
				this.c2 = this.c2 + "&#51;";
				break;

			case '4':
				this.c2 = this.c2 + "&#52;";
				break;

			case '5':
				this.c2 = this.c2 + "&#53;";
				break;

			case '6':
				this.c2 = this.c2 + "&#54;";
				break;

			case '7':
				this.c2 = this.c2 + "&#55;";
				break;

			case '8':
				this.c2 = this.c2 + "&#56;";
				break;

			case '9':
				this.c2 = this.c2 + "&#57;";
				break;

			case 'A':
				this.c2 = this.c2 + "&#65;";
				break;

			case 'B':
				this.c2 = this.c2 + "&#66;";
				break;

			case 'C':
				this.c2 = this.c2 + "&#67;";
				break;

			case 'D':
				this.c2 = this.c2 + "&#68;";
				break;

			case 'E':
				this.c2 = this.c2 + "&#69;";
				break;

			case 'F':
				this.c2 = this.c2 + "&#70;";
				break;

			case 'G':
				this.c2 = this.c2 + "&#71;";
				break;

			case 'H':
				this.c2 = this.c2 + "&#72;";
				break;

			case 'I':
				this.c2 = this.c2 + "&#73;";
				break;

			case 'J':
				this.c2 = this.c2 + "&#74;";
				break;

			case 'K':
				this.c2 = this.c2 + "&#75;";
				break;

			case 'L':
				this.c2 = this.c2 + "&#76;";
				break;

			case 'M':
				this.c2 = this.c2 + "&#77;";
				break;

			case 'N':
				this.c2 = this.c2 + "&#78;";
				break;

			case 'O':
				this.c2 = this.c2 + "&#79;";
				break;

			case 'P':
				this.c2 = this.c2 + "&#80;";
				break;

			case 'Q':
				this.c2 = this.c2 + "&#81;";
				break;

			case 'R':
				this.c2 = this.c2 + "&#82;";
				break;

			case 'S':
				this.c2 = this.c2 + "&#83;";
				break;

			case 'T':
				this.c2 = this.c2 + "&#84;";
				break;

			case 'U':
				this.c2 = this.c2 + "&#85;";
				break;

			case 'V':
				this.c2 = this.c2 + "&#86;";
				break;

			case 'W':
				this.c2 = this.c2 + "&#87;";
				break;

			case 'X':
				this.c2 = this.c2 + "&#88;";
				break;

			case 'Y':
				this.c2 = this.c2 + "&#89;";
				break;

			case 'Z':
				this.c2 = this.c2 + "&#90;";
				break;

			}
		}
		return this.c2;
	}
}
