public class Vegetal extends SerVivo{
	protected String partes[];

	public Vegetal(String cientifico,String vulgar,String partes[]){
		super(cientifico,vulgar);
		this.partes=partes;
	}

	public void visualizaPartes(){
		System.out.println("Partes: ");
		for (int i = 0; i < partes.length; i++) {
			System.out.println( partes[i] );
		}
	}

	public void describete(){
		super.describete();
		visualizaPartes();
	}
}