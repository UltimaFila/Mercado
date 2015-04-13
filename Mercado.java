import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {

	private static ArrayList<Puesto> puestos = new ArrayList<Puesto>();

	public void abrirPuesto() {

		boolean existe = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca ID puesto");
		int IDPuesto = sc.nextInt();

		for (int i = 0; i < puestos.size(); i++) {

			if (IDPuesto == puestos.get(i).getIDPuesto()) {

				existe = true;
			}
		}

		if (existe == true) {
			System.out.println("La ID Introducida ya existe.");
		} else {
			Puesto puestoNuevo = new Puesto(IDPuesto);
			puestos.add(puestoNuevo);
		}

	}

	public void eliminarPuesto() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca ID puesto a eliminar");
		int IDPuesto = sc.nextInt();

		for (int i = 0; i < puestos.size(); i++) {
			if (IDPuesto == puestos.get(i).getIDPuesto()) {

				puestos.remove(i);
			}
		}

	}

	public void mostrarPuesto() {

		for (int i = 0; i < puestos.size(); i++) {

			System.out.println(puestos.get(i));
		}
	}

	public void loguearComerciante() {

		String CIFlogueo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su CIF");
		CIFlogueo = sc.nextLine();

		for (int i = 0; i < puestos.size(); i++) {
			if (CIFlogueo.equals(puestos.get(i).comerciante.getCIF())) {
				
				
				puestos.get(i).comerciante.menuComerciante();
				
				
			}

		}
	}

	
	public void listadoCompleto() {
		
		for (int i = 0; i < puestos.size(); i++) {
			System.out.println(puestos.get(i));
			puestos.get(i).comerciante.mostrarMercancia();

			
		}
	}
}
