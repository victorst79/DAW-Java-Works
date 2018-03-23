import java.awt.*;
public class Interface02 extends Frame{

	private Button bNorte, bSur, bEste, bOeste, bCentro;

	public Interface02(String titulo){
		super(titulo);
		Frame f = new Frame("GUI02");
		bNorte = new Button("NORTE");
		bSur = new Button("SUR");
		bOeste = new Button("OESTE");
		bCentro = new Button("CENTRO");
		bEste = new Button("ESTE");

		add("North",bNorte);
		add("South",bSur);
		add("East",bEste);
		add("West",bOeste);
		add("Center",bCentro);
	}

	public Interface02(){
		super("");
	}
}