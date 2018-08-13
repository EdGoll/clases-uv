public class Guerrero implements Personaje{

	
	private Integer energia;
	private NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
	
	
	public Guerrero(Integer energia) {
	//	this.rival = rival;
		this.energia = energia;
	}

	@Override
	public void recuperarEnergia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirAtaque(Integer danio) {
		// TODO Auto-generated method stub
		this.energia -= danio;
	}

	@Override
	public void atacar(Personaje rival) {
		// TODO Auto-generated method stub
		int opcion = numeroAleatorio.getNumero(4);
		switch (opcion) {
		case 0:{//hielo, 10 de dano
			System.out.println("Tacleada, 10 de dano");
			rival.recibirAtaque(10);
			break;
		}
			
			
		case 1:{//rayo
			
			if(numeroAleatorio.getNumero(10)>7) {
				System.out.println("Espada, 40 de dano critico");
				rival.recibirAtaque(30 + 10);
			}else {
				rival.recibirAtaque(30);
				System.out.println("Espada, 30 de dano");
			}
			break;
		}
			
		
		case 2:{//fuego
			rival.recibirAtaque(60);	
			if(numeroAleatorio.getNumero(10)>3) {
				rival.recibirAtaque(50 + 20);
				System.out.println("Especial, 70 de dano critico");
			}else {
				rival.recibirAtaque(50);
				System.out.println("Especial, 50 de dano");
			}
			break;
		}
			
		
		case 3:{//pierde turno
			System.out.println("Guerrero Pierde Turno :(");
			break;
		}
			
		default:
			break;
		}
	}
	
	
}
