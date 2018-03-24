import java.awt.*;
import java.awt.event.*;
public class Interface10 extends Frame{

	private Label sBase, eCivil, jDepart, nHijos, antig, sBruto;
	private TextField fBase, fHijos, fAntig, fBruto;
	private Choice cEstado;
	private CheckboxGroup grupoDepartamento;
	private Checkbox si,no;
	private Panel p1, p2, p3, p4, p5, p6, p7;
	private Button calcular, limpiar;

	public Interface10(String titulo){
		super(titulo);

		// Diseño
		setLayout( new FlowLayout() );

		// Creacion Componentes
		sBase = new Label("Sueldo Base");
		eCivil = new Label("Estado Civil");
		jDepart = new Label("Jefe Departamento");
		nHijos = new Label("Num Hijos");
		antig = new Label("Antiguedad");
		sBruto = new Label("Sueldo Bruto");
		fBase = new TextField(16);
		fHijos = new TextField(16);
		fAntig = new TextField(16);
		fBruto = new TextField(16);
		fBruto.setEditable(false);
		cEstado = new Choice();
		cEstado.add("Soltero");
		cEstado.add("Casado");
		cEstado.add("Viudo");
		cEstado.add("Divorciado");
		grupoDepartamento = new CheckboxGroup();
		si = new Checkbox("Si",false,grupoDepartamento);
		no = new Checkbox("No",false,grupoDepartamento);
		calcular = new Button("Calcular");
		limpiar = new Button("Limpiar");

		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p7 = new Panel();
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);

		// Creacion Estructura
		// 1
		p1.setLayout( new GridLayout(1,2) );
		p1.add( sBase );
		p1.add( fBase );
		// 2
		p2.setLayout( new GridLayout(1,2) );
		p2.add( eCivil );
		p2.add( cEstado );
		// 3
		p3.setLayout( new GridLayout(1,2) );
		p3.add( jDepart );
		p3.add( si );
		p3.add( no );
		// 4
		p4.setLayout( new GridLayout(1,2) );
		p4.add( nHijos );
		p4.add( fHijos );
		// 5
		p5.setLayout( new GridLayout(1,2) );
		p5.add( antig );
		p5.add( fAntig );
		// 6
		p6.setLayout( new GridLayout(1,2) );
		p6.add( sBruto );
		p6.add( fBruto );
		// 7
		p7.setLayout( new GridLayout(1,2) );
		p7.add( calcular );
		p7.add( limpiar );

		// Listeners
		addWindowListener( new ControlVentana() );
		calcular.addActionListener( new ControlBotones() );
		limpiar.addActionListener( new ControlBotones() );

	}

	// Control Botones
	class ControlBotones implements ActionListener{
		public void actionPerformed( ActionEvent ae ){
			if ( ae.getSource() == limpiar) {
				fBase.setText(" ");
				fHijos.setText(" ");
				fAntig.setText(" ");
				fBruto.setText(" ");
				grupoDepartamento.setSelectedCheckbox(no);
				cEstado.select(0);
			}else if(ae.getSource() == calcular ){
				// Captacion de datos en variables
				double sueldo = Integer.parseInt( fBase.getText() );
				double hijos = Integer.parseInt( fHijos.getText() );
				double antiguedad = Integer.parseInt( fAntig.getText() );
				String estado = cEstado.getSelectedItem();
				boolean siComprueba = si.getState();
				double resultado = sueldo ;
				// Operaciones
				// Operacion por antiguedad
				resultado = resultado + ( 30 * (antiguedad * 12) / 3 );
				// Operacion Jefe departamento
				if ( siComprueba == true ) {
					resultado += 42;
				}
				// Operacion Estado Civil
				if ( estado == "Casado" ) {
					resultado += 60;
				}
				// Operacion nº hijos
				resultado = resultado + (hijos * 18);

				fBruto.setText(""+resultado);
			}
		}
	}

	// Control Window
	class ControlVentana extends WindowAdapter{
		public void windowClosing( WindowEvent we ){
			System.exit(0);
		}
	}

}