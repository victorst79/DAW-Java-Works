public class Reptil extends Animal{

	public Reptil(String cientifico,String vulgar,int nPatas){
		super(cientifico,vulgar,nPatas);
	}

	public void describete(){
		super.describete();
		System.out.println("Tiene sangre fria");
	}
}