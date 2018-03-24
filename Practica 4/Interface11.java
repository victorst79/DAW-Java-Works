import java.awt.*;
import java.awt.event.*;
public class Interface11 extends Frame{

	Label sexo, estadoCivil, nHijos;
	CheckboxGroup grupoBox;
	Checkbox hombre, mujer;
	Choice chEstado, chHijos;
	TextArea textA;

	public Interface11(String titulo){
		super(titulo);

		setLayout( new GridLayout(2,1) );

		// Creacion Paneles
		Panel pNorte = new Panel();
		Panel pSur = new Panel();

		// Layout Paneles
		pNorte.setLayout( new BorderLayout() );

		// Creacion Componentes
		sexo = new Label("Sexo");
		estadoCivil = new Label("Estado Civil");
		nHijos = new Label("Num Hijos");
		grupoBox = new CheckboxGroup();
		hombre = new Checkbox("Hombre",grupoBox,false);
		mujer = new Checkbox("Mujer",grupoBox,false);
		chEstado = new Choice();
		chHijos = new Choice();

		// Estructura Panel Superior
		Panel subPanelNorte = new Panel();
		subPanelNorte.setLayout( new GridLayout(1,7) );
		subPanelNorte.add( new Label("     ") );
		subPanelNorte.add( sexo );
		subPanelNorte.add( new Label("     ") );
		subPanelNorte.add( estadoCivil );
		subPanelNorte.add( new Label("     ") );
		subPanelNorte.add( nHijos );
		subPanelNorte.add( new Label("     ") );

		Panel subPanelOeste = new Panel();
		subPanelOeste.setLayout( new GridLayout(2,1) );
		subPanelOeste.add( hombre );
		subPanelOeste.add( mujer );

		Panel subPanelCentro = new Panel();
		subPanelCentro.add( chEstado );
		chEstado.addItem("Soltero");
		chEstado.addItem("Casado");
		chEstado.addItem("Viudo");
		chEstado.addItem("Divorciado");

		Panel subPanelEste = new Panel();
		subPanelEste.add( chHijos );
		for (int i=0; i<=5; i++) {
			chHijos.addItem( ""+i );
		}

		add(pNorte);
		pNorte.add("North",subPanelNorte);
		pNorte.add("West",subPanelOeste);
		pNorte.add("Center",subPanelCentro);
		pNorte.add("East",subPanelEste);

		// Estructura Panel Inferior
		textA = new TextArea(50,50);
		textA.setEditable(false);

		add(pSur);
		pSur.add(textA);

		// Control Ventana
		addWindowListener( new ControlVentana() );

		// Control Item
		hombre.addItemListener( new ControlItem() );
		mujer.addItemListener( new ControlItem() );
		chEstado.addItemListener( new ControlItem() );
		chHijos.addItemListener( new ControlItem() );
		// li.addItemListener( new ControlItem() );
	}


	// Controlador ItemEvent
	class ControlItem implements ItemListener{
		public void itemStateChanged( ItemEvent ie){
			textA.append( ie.getItem() + "\n" );
		}
	}

	// Controlador Ventana Window
	class ControlVentana extends WindowAdapter{
	public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}