public class Carta{
	protected int numero, palo;

	public Carta(int numero, int palo){
		this.numero = numero;
		this.palo = palo;
	}

	public Carta(){
		this(1,1);
	}

	public void visualizarCarta(){
		if (numero <= 7)
			System.out.print(numero+" de ");
		else
			if (numero == 10)
			System.out.print("Sota de ");
			else
				if(numero == 11)
					System.out.print("Caballo de ");
				else
					if(numero == 12)
						System.out.print("Rey de ");
		switch (palo){
			case 1: 
				System.out.println("Oros");break;
			case 2:
				System.out.println("Copas");break;
			case 3:
				System.out.println("Bastos");break;
			case 4:
				System.out.println("Espadas");
		}
	}

	public double valorCarta(){
		if(numero == 10 || numero == 11|| numero == 12)
			return 0.5;
		return numero;		
	}
}