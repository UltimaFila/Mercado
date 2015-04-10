import java.util.ArrayList;
import java.util.Scanner;

public class Comerciante {

	String nombre;
	String CIF;
	String tipoNegocio;
	static ArrayList<Mercancia> mercancias = new ArrayList<Mercancia>();

	static String cogerMercancia = new String();

	

	public Comerciante(String nombre_nuevo, String CIF_nuevo) {
		this.nombre = nombre_nuevo;
		this.CIF = CIF_nuevo;

	}

	public String getCIF() {
		return (CIF);
	}

	public String getNombre() {
		return (nombre);
	}

	public String getTipoNegocio() {
		return (tipoNegocio);
	}

	public void setNombre(String nombre_nuevo) {
		this.nombre = nombre_nuevo;
	}

	public String setTipoNegocio() {
		return (tipoNegocio);
	}

	public static void añadirMercancia() {

		Scanner sc = new Scanner(System.in);
		Mercancia patata = new Mercancia(cogerMercancia);
		System.out.println("Introduzca tipo de mercancía:");
		cogerMercancia = sc.nextLine();

		System.out.println("Introduzca cantidad en Kgs:");
		patata.setKgs(sc.nextFloat());
		sc.nextLine();
		System.out.println("Introduzca precio/kg:");
		patata.setPreciokg(sc.nextFloat());

		System.out.println(patata.getKgs());
		System.out.println(patata.getTipo());
		System.out.println(patata.getPreciokg());

	}

	public static void insertarMercancia() {
		mercancias.add(patata);
		System.out.println(patata.tipo + " " + patata.kgs + " "
				+ patata.preciokg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		añadirMercancia();
		//insertarMercancia();

	}

}
