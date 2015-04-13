import java.util.Scanner;

public class MiMercado {

	
	private static Mercado mercado = new Mercado();
	
	public static void main(String[] args) {

		menuLogin();

	}

	public static void menuLogin() {

		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bienvenido al mercado xxxx. Indique cómo desea loguear.");
			System.out.println("1.- (C)liente");
			System.out.println("2.- C(O)merciante");
			System.out.println("3.- (J)efe");

			opc_menu = sc.next().charAt(0);
			switch (opc_menu) {
			case '1':
			case 'c':
			case 'C': {
				menuCliente();
				break;
			}
			case '2':
			case 'm':
			case 'M': {
				menuComerciante();
		
				break;
			}
			case '3':
			case 'j':
			case 'J': {
				menuJefe();
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();

	}
	
	
	public static void menuJefe() {

		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elija la opción que desea realizar");
			System.out.println("1.- (A)ñadir puesto");
			System.out.println("2.- (E)liminar puesto");
			System.out.println("3.- (L)istado de puestos");
			System.out.println("4.- A(Ñ)adir mercancía a puesto");
			System.out.println("5.- El(I)minar mercancía a puesto");
			System.out.println("6.- (V)olver");
			System.out.println("7.- (S)alir");

			opc_menu = sc.next().charAt(0);
			switch (opc_menu) {
			case '1':
			case 'a':
			case 'A': {
				
				mercado.abrirPuesto();

				break;
			}
			case '2':
			case 'e':
			case 'E': {
				
				mercado.eliminarPuesto();
		
				break;
			}
			case '3':
			case 'l':
			case 'L': {
				mercado.mostrarPuesto();
				break;
			}
			
			case '6':
			case 'v':
			case 'V': {
				
				menuLogin();
		
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();

	}

	public static void menuComerciante() {

		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elija la opción que desea realizar");
			System.out.println("1.- Loguear con mi CIF");
			System.out.println("2.- Volver");
			System.out.println("3.- Salir");
	

			opc_menu = sc.next().charAt(0);
			switch (opc_menu) {
			case '1':
			case 'c':
			case 'C': {
				mercado.loguearComerciante();
				break;
			}
			case '2':
			case 'm':
			case 'M': {
				menuLogin();
				break;
			}
			case '3':
			case 'j':
			case 'J': {
	
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();

	}
	
	
	public static void menuCliente() {

		char opc_menu;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Indique la opción que desea realizar");
			System.out.println("1.- Listado de puestos y mercancías");
			System.out.println("2.- Comprar");
			System.out.println("3.- Volver");
			System.out.println("4.- Salir");
	

			opc_menu = sc.next().charAt(0);
			switch (opc_menu) {
			case '1':
			case 'c':
			case 'C': {
				mercado.listadoCompleto();
				break;
			}
			case '2':
			case 'm':
			case 'M': {
		
				break;
			}
			case '3':
			case 'j':
			case 'J': {
				menuLogin();
	
				break;
			}

			}
		} while (opc_menu != '0');
		sc.close();

	}
	
		
}
