public class Mago implements Personaje{

		//private Personaje rival;
		private Integer energia;
		private NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
		private Integer danioExtraMago;
		
		public Mago(Integer energia) {
			//this.rival = rival;
			this.energia = energia;
			this.danioExtraMago =0;
		}

		@Override
		public void recuperarEnergia() {
			// TODO Auto-generated method stub
			
			this.energia += 50;
			
		}

		@Override
		public void recibirAtaque(Integer danio) {
			// TODO Auto-generated method stub
			this.energia -= danio;
		}

		@Override
		public void atacar(Personaje rival) {
			int opcion = numeroAleatorio.getNumero(4);
			switch (opcion) {
			case 0:{//hielo, 10 de dano
				System.out.println("Hielo, 10 de dano");
				rival.recibirAtaque(10);
				this.danioExtraMago +=1;
				break;
			}
				
				
			case 1:{//rayo
				System.out.println("Rayo, 10 de dano");
				rival.recibirAtaque(30);
				this.danioExtraMago +=1;
				break;
			}
				
				
			case 2:{//fuego
				System.out.println("Especial de Fuego, 10 de dano");
				rival.recibirAtaque(60);
				this.danioExtraMago +=1;
				this.recuperarEnergia();
				break;
			}
				
				
			case 3:{//pierde turno
				System.out.println("Mago Pierde Turno :(");
				if(this.danioExtraMago>0) {
					this.danioExtraMago -=1;
				}
				break;
			}
				
			default:
				break;
			}
		}
   
}
