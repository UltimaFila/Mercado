import java.util.Scanner;

public class Puesto {

	private int IDPuesto;
	private String ubicacion;
	Comerciante comerciante;
	
	
	public Puesto(int IDPuesto) {
		
		this.IDPuesto = IDPuesto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca ubicaci�n");
		ubicacion = sc.nextLine();
		comerciante = new Comerciante();
		
	}
	

	public void setIDPuesto(int IDPuestoNuevo) {
		this.IDPuesto = IDPuestoNuevo;
	}

	public int getIDPuesto() {
		return (IDPuesto);
	}
	
	public void setUbicacion (String ubicacionNuevo) {
		this.ubicacion = ubicacionNuevo;
	}

	public String getUbicacion() {
		return (ubicacion);
	}
	

	public String toString() {
		
		
		return "ID Puesto: " + Integer.toString(this.IDPuesto) + "Ubicaci�n " + this.ubicacion + " " + comerciante;
	}
	
	
		
		
	}
	
	

