import java.awt.*;
public class Interface01 extends Frame{

	public Interface01(String titulo){
		super(titulo);
		Frame f = new Frame("Ejemplo Interfaz");
		this.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label L = new Label("Nombre");

		this.add(L);
		this.add(bSi);
		this.add(bNo);
		this.pack();
		this.setSize(300, 200);
		this.setLocation(400,400);
		this.setVisible(true);
	}

	public Interface01(){
		super();
		this.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label L = new Label("Nombre");

		this.add(L);
		this.add(bSi);
		this.add(bNo);
		this.pack();
		this.setSize(300, 200);
		this.setLocation(400,400);
		this.setVisible(true);
	}
}