import java.awt.*;
public class Interface05 extends Frame{

	public Interface05(String titulo){
		super(titulo);

		Panel pOeste = new Panel();
		Panel pCentro = new Panel();
		Panel pEste = new Panel();
		Panel pSur = new Panel();

		List lista = new List();

		pOeste.setLayout( new GridLayout(2,1) );
		add("West",pOeste);
		pOeste.add(new Button("Boton 1"));
		pOeste.add(new Button("Boton 2"));

		pCentro.setLayout( new BorderLayout() );
		add("Center",pCentro);
		pCentro.add("North", new Label("Etiqueta",1) );
		pCentro.add("Center", new TextArea("Area de texto") );

		pEste.setLayout( new BorderLayout() );
		add("East",pEste);
		pEste.add(lista);
		lista.addItem("Lista-1");
		lista.addItem("Lista-2");
		lista.addItem("Lista-3");
		lista.addItem("Lista-4");

		pSur.setLayout( new FlowLayout() );
		add("South",pSur);
		pSur.add( new TextField("Campo de texto") );
		pSur.add( new Checkbox("Check 1") );
		Choice caja = new Choice();
		caja.addItem("Manolo");
		caja.addItem("Victor");
		pSur.add( caja );


	}
}