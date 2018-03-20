public class SerVivo{
	protected String nombreVulgar, nombreCientifico;

	public SerVivo(String cientifico, String vulgar){
		nombreCientifico = cientifico;
		nombreVulgar = vulgar;
	}

	public SerVivo(){
		nombreVulgar="";
		nombreCientifico="";
	}

	public void describete(){
		System.out.println("Nombre cientifico: " + nombreCientifico);
		System.out.println("Nombre vulgar: " + nombreVulgar);
	}

	public void setNombreCientifico(String cientifico){
		nombreCientifico = cientifico;
	}

	public void setNombreVulgar(String vulgar){
		nombreVulgar = vulgar;
	}
}