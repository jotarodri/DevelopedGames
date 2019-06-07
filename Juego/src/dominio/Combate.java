package dominio;

public class Combate {

	private Heroe personajeHeroe;
	private Criatura personajeCriatura;
	private int turno; //1 = criatura, 0 = heroe


	public Combate (Heroe h, Criatura c) {

		this.personajeCriatura 	= c;
		this.personajeHeroe 	= h;
		this.turno = 0;

	}

	public void atacar() {

		if (turno == 1/*malote*/) {

			//el boss ataca al heroe
			//  (vidaPersonaje + ((vidapersonaje + defensaPersonaje) / 100 ) - ataqueOtroPersonaje)

			personajeHeroe.setVitalidadPropia(

					(personajeHeroe.getVitalidadPropia() + (personajeHeroe.getDefensaPropia() /100))
					- personajeCriatura.getFuerzaPropia()
					);

			turno = 0;

		}else /*turno del bueno*/{

			personajeCriatura.setVitalidadPropia(

					(personajeCriatura.getVitalidadPropia() + (personajeCriatura.getDefensaPropia() /100))
					- personajeHeroe.getFuerzaPropia()
					);
			turno = 1;

		}

	}

	public void defender() {

		if (turno == 1) {

			//el ataque del heroe sera la mitad hasta el final del turno

			personajeHeroe.setFuerzaPropia(

					personajeHeroe.getFuerzaOriginal() / 2

					);
			turno = 0;


		} else {

			//el ataque de la criatuta sera la mitad hasta el final del turno

			personajeCriatura.setFuerzaPropia(

					personajeCriatura.getFuerzaOriginal() / 2

					);
			turno = 1;
		}

	}

	public void resetearStatsHeroe() {
		
		//ataque
		personajeHeroe.setFuerzaPropia(personajeHeroe.getFuerzaOriginal());
		//defensa
		personajeHeroe.setDefensaPropia(personajeHeroe.getDefensaOriginal());
				
	}
	
	public void resetearStatsCriatura() {
		
		//ataque
		personajeCriatura.setFuerzaPropia(personajeCriatura.getFuerzaOriginal());
		//defensa
		personajeCriatura.setDefensaPropia(personajeCriatura.getDefensaOriginal());
		
	}

}
