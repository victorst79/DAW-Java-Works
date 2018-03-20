public class Cadena{
	private String c;

	public Cadena(){
		c="";
	}

	public Cadena(String c){
		this.c=c;
	}

	public void invierteCadena(){
		StringBuffer aux = new StringBuffer(c);
		aux = aux.reverse();
		c = aux.toString();		
	}

	public void visualizaCadena() {
		System.out.println(c);
	}

	public void encriptaCadena(){
		StringBuffer aux = new StringBuffer(c);
		char insertar;
		int ascii;
		for (int i = 0; i <= aux.length()-1;i++ ) {
			insertar = aux.charAt(i);
			ascii = Caracter.ordinal(insertar) + 3;
			insertar = Caracter.ascii(ascii);
			aux.setCharAt(i, insertar);
		}
		c = aux.toString();
		System.out.println("La cadena ha sido encriptada");
	}

	public void desencriptaCadena(){
		StringBuffer aux = new StringBuffer(c);
		char insertar;
		int ascii;
		for (int i = 0; i <= aux.length()-1;i++ ) {
			insertar = aux.charAt(i);
			ascii = Caracter.ordinal(insertar) - 3;
			insertar = Caracter.ascii(ascii);
			aux.setCharAt(i, insertar);
		}
		c = aux.toString();
		System.out.println("La cadena ha sido desencriptada");
	}
}