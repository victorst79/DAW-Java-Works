public class Animal extends SerVivo{
	protected int numPatas;

	public Animal(String cientifico, String vulgar, int numPatas){
		super(cientifico,vulgar);
		this.numPatas = numPatas;
	}

	public Animal(){
		super();
		numPatas=0;
	}

	public String getNombreCientifico(){
		return nombreCientifico;
	}

	public String getNombreVulgar(){
		return nombreVulgar;
	}

	public int getNumPatas(){
		return numPatas;
	}

	public void setNumPatas(int nPatas){
		numPatas=nPatas;
	}

	public void describete(){
		super.describete();
		System.out.println("Puedo moverme");
		System.out.println("Numero de patas: " + numPatas);
	}

}