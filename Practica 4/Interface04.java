import java.awt.*;
public class Interface04 extends Frame{
	Button bNorte, bCentro, bEste, bSur;
	Checkbox ch1, ch2;
	CheckboxGroup grupo;
	

	public Interface04(String titulo){
		super(titulo);

		bNorte = new Button("NORTE");
		bCentro = new Button("CENTRO");
		bEste = new Button("ESTE");
		bSur = new Button("SUR");
		grupo = new CheckboxGroup();
		ch1 = new Checkbox("Check 1",false,grupo);
		ch2 = new Checkbox("Check 2",true,grupo);

		
		add("North",bNorte);
		add("Center",bCentro);
		add("East",bEste);
		add("South",bSur);

		Panel pOeste = new Panel();
		pOeste.setLayout( new GridLayout(2,1) );
		add("West",pOeste);
		pOeste.add(ch1);
		pOeste.add(ch2);

	}
}