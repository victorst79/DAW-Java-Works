public class Rectangulo{
	protected Segmento s1,s2;

	public Rectangulo(Segmento s1, Segmento s2){
		if (s1.p1  == s2.p1) {
			this.s1 = s1;
			this.s2 = s2;
		}else{
			System.out.println("No se puede crear el rectangulo");
		}
	}

	public double area(){
		return s1.longitudSegmento()*s2.longitudSegmento();		
	}

	public double perimetro(){
		return 2*(s1.longitudSegmento() + s2.longitudSegmento() );
	}
}