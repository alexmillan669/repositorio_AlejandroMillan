import modelo.Gato;
import modelo.Perro;

/*
 * @autor Alejandro Millán
 * @version 1.0
 * */
public class App {

	public static void main(String[] args) {
		Perro p1 = new Perro("Rex");
		Gato g1 = new Gato("Nano");
		System.out.println(p1.getNombre());
		p1.sonido();
		System.out.println();
		System.out.println(g1.getNombre());
		g1.sonido();
		}
}