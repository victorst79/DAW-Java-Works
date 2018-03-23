import java.awt.*;
public class Interface03 extends Frame{
	Button bNorte, bCentro, bEste, panel1, panel2;

	public Interface03(String titulo){
		super(titulo);

		bNorte = new Button("NORTE");
		bCentro = new Button("CENTRO");
		bEste = new Button("ESTE");
		panel1 = new Button("Panel 1");
		panel2 = new Button("Panel 2");

		add("North",bNorte);
		add("Center",bCentro);
		add("East",bEste);
		Panel pOeste = new Panel();
		pOeste.setLayout( new GridLayout(2,1) );
		pOeste.add(panel1);
		pOeste.add(panel2);
		add("West",pOeste);

	}
}