public class Mamifero extends Animal{
	protected String familia;
	
	public Mamifero(String cientifico,String vulgar,String familia){
		super(cientifico,vulgar,4);
		this.familia = familia;
	}

	public void setNumPatas(int nPatas){}

	public void describete(){
		super.describete();
		System.out.println("Familia: " + familia);
	}
}