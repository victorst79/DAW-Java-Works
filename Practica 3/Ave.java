public class Ave extends Animal{

	public Ave(String cientifico,String vulgar){
		super(cientifico,vulgar,2);
	}

	public void describete(){
		super.describete();
		System.out.println("Puede volar");
	}
}