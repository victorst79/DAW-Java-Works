public class Carta{
	protected int num,palo;

	public Carta(int num, int palo){
		this.num = num;
		this.palo = palo;
	}

	public Carta(){
		this(1,1);
	}

	public void visualizarCarta(){
		switch(palo){
			case 1:
				System.out.println("Tu carta es el "+num+" de COPAS");break;
			case 2:
				System.out.println("Tu carta es el "+num+" de BASTOS");break;			
			case 3:
				System.out.println("Tu carta es el "+num+" de ESPADAS");break;
			case 4:
				System.out.println("Tu carta es el "+num+" de OROS");break;	
		}
	}

	public double valorCarta(){
		return num;
	}
}