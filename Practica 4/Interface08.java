import java.awt.*;
import java.awt.event.*;
public class Interface08 extends Frame{

	private Button bPrincipal, bAceptar, bCancelar;
	private Dialog dVentana;
	private Label usu,pass, l;
	private TextField tfU, tfP;

	// Variables login
	protected String user = "user";
	protected int passw = 1234;

	public Interface08(String titulo){
		super(titulo);
		setLayout( new FlowLayout() );

		// Creacion Componenetes
		bPrincipal = new Button("Pulse Aqui");
		bAceptar = new Button("Aceptar");
		bCancelar = new Button("Cancelar");
		dVentana = new Dialog(this,"Ventana Password",true);
		l = new Label("        ");

		// Inserccion en Frame
		add( bPrincipal );
		dVentana.setLayout( new GridLayout(4,1) );
		dVentana.add( new Label("") );
		Panel p1 = new Panel();
		p1.add( new Label("     ") );
		p1.add( new Label("Usuario",Label.RIGHT) );
		tfU = new TextField("Nombre Usuario",15);
		p1.add(tfU);
		p1.add( new Label("     ") );
		bAceptar = new Button("Aceptar");
		p1.add(bAceptar);
		dVentana.add(p1);

		Panel p2 = new Panel();
		p2.add( new Label("     ") );
		p2.add( new Label("Password",Label.RIGHT) );
		tfP = new TextField("",15);
		tfP.setEchoChar('*');
		p2.add(tfP);
		p2.add( new Label("     ") );
		bCancelar = new Button("Cancelar");
		p2.add( bCancelar );
		dVentana.add( p2 );
		dVentana.add( l );
		
		// Listener Window
		ControlVentana cv = new ControlVentana();
		addWindowListener( cv );
		dVentana.addWindowListener( cv );

		// Listener Componentes
		ControlPrincipal cp = new ControlPrincipal();
		bPrincipal.addActionListener( cp );

		// Listener bAceptar
		ControlAceptar ControlBotonAceptar = new ControlAceptar();
		bAceptar.addActionListener( ControlBotonAceptar );

		// Listener bCancelar
		ControlCancelar ControlBotonCancelar = new ControlCancelar();
		bCancelar.addActionListener( ControlBotonCancelar );
		
	}

	// Evento bPrincipal
	class ControlPrincipal implements ActionListener{
		public void actionPerformed( ActionEvent e){
			dVentana.pack();
			dVentana.setLocation(400,350);
			dVentana.show();
		}
	}

	// Evento bAceptar
	class ControlAceptar implements ActionListener{
		public void actionPerformed( ActionEvent e){
			if ( user.equals(tfU.getText()) && passw == Integer.parseInt( tfP.getText() ) ) {
				l.setText("Usuario y Contrasena correcta");
				l.setForeground(Color.green);
			}else{
				l.setText("Usuario y Contrasena incorrecta");
				l.setForeground(Color.red);
			}
		}
	}

	// Evento bCancelar
	class ControlCancelar implements ActionListener{
		public void actionPerformed( ActionEvent e){
			dVentana.show(false);
		}
	}

	// Eventos Window
	class ControlVentana implements WindowListener{
		public void windowActivated(WindowEvent we){}
		public void windowDeactivated(WindowEvent we){}
		public void windowClosed(WindowEvent we){}
		public void windowClosing(WindowEvent we){
			if ( we.getSource() == dVentana ) {
				dVentana.show(false);
			}else{
				System.exit(0);				
			}
		}
		public void windowIconified(WindowEvent we){}
		public void windowDeiconified(WindowEvent we){}
		public void windowOpened(WindowEvent we){}
	}
}