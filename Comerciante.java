import java.util.ArrayList;
import java.util.Scanner;

public class Comerciante {

	private String nombre;
	private String CIF;
	private String tipoNegocio;
	private Mercancia mercancia;
	private ArrayList<Mercancia> mercancias = new ArrayList<Mercancia>();

	
	
	public Comerciante() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre del comerciante:");
		nombre = sc.nextLine();
		System.out.println("Introduzca CIF del comerciante:");
		CIF = sc.nextLine();
		System.out.println("Introduzca tipo de negocio:");
		tipoNegocio = sc.nextLine();
	
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
	
	public String toString() {
		
		return "Nombre del comerciante: " + this.nombre + " " + this.CIF + " " + this.tipoNegocio;
	}

	public void añadirMercancia() {

		boolean existe = false;
		mercancia = new Mercancia();

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


		for (int i = 0; i < mercancias.size(); i++) {
			System.out.println(mercancias.get(i));
		}
	}

	
	
	public void menuComerciante() {
		
		
		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("Bienvenido al mercaodrrrrrrrrrrrrrrrrrrrlfdfsff\n\n" + nombre);
			System.out.println("1.- (A)ñadir mercancia");
			System.out.println("2.- (E)liminar mercancia");
			System.out.println("3.- (M)ostrar mercancia");
			System.out.println("4.- (V)olver");
			System.out.println("5.- (S)alir");

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
			case 'm':
			case 'M': {
				mostrarMercancia();
				break;
			}
			case '4':
			case 'v':
			case 'V': {
				MiMercado.menuLogin();
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();
	}
	

}
