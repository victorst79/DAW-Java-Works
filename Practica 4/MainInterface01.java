import java.awt.*;
class MainInterface01 {
	public static void main(String args []) {
		Interface01 ventana = new Interface01("Ejemplo de GUI");

		ventana.setSize(300, 150);
		ventana.setLocation(400,400);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
}