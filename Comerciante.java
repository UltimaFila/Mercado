import java.util.ArrayList;
import java.util.Scanner;

public class Comerciante {

	private String nombre;
	private String CIF;
	private String tipoNegocio;
	private static ArrayList<Mercancia> mercancias = new ArrayList<Mercancia>();

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

	public void añadirMercancia() {

		boolean existe = false;
		Mercancia mercancia = new Mercancia();

		for (int i = 0; i < mercancias.size(); i++) {
			if (mercancias.get(i).getTipo().equals(mercancia.getTipo())) {
				mercancias.get(i).setKgs(
						mercancia.getKgs() + mercancias.get(i).getKgs());
				existe = true;
			}
		}

		if (existe == false) {
			mercancias.add(mercancia);

		}

	}

	public void eliminarMercancia() {
		Scanner sc = new Scanner(System.in);
	
	String eliminar;
	System.out.println("¿Qué mercancía desea eliminar?");
	eliminar = sc.nextLine();
	
	for (int i = 0; i < mercancias.size(); i++) {
		if (mercancias.get(i).getTipo().equals(eliminar)) {
			mercancias.remove(i);
		}
	}
	
	
	}
	
	public void mostrarMercancia() {

		// CLARO QUE SÍ

		for (int i = 0; i < mercancias.size(); i++) {
			System.out.println(mercancias.get(i));
		}
	}

	
	
	public void menuComerciante() {
		
		
		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("Bienvenido al mercaodrrrrrrrrrrrrrrrrrrrlfdfsff\n\n");
			System.out.println("1.- (A)ñadir mercancia");
			System.out.println("2.- (E)liminar mercancia");
			System.out.println("3.- (M)ostrar mercancia");

			opc_menu = sc.next().charAt(0);
			switch (opc_menu) {
			case '1':
			case 'a':
			case 'A': {
				añadirMercancia();
				break;
			}
			case '2':
			case 'e':
			case 'E': {
				eliminarMercancia();
				break;
			}
			case '3':
			case 'v':
			case 'V': {
				mostrarMercancia();
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();
	}
	// public static void insertarMercancia() {
	// mercancias.add(patata);
	// System.out.println(patata.tipo + " " + patata.kgs + " "
	// + patata.preciokg);
	//
	// }

	
	// insertarMercancia();

}
