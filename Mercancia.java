import java.util.Scanner;

public class Mercancia {

	String tipo;
	float kgs;
	float preciokg;

	public Mercancia(String tipo_nuevo) {
		this.tipo = tipo_nuevo;

	}

	public Mercancia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca tipo de mercancía:");
		tipo = sc.nextLine();
		System.out.println("Introduzca Kgs:");
		kgs = sc.nextFloat();
		System.out.println("Introduzca Precio/kgs");
		preciokg = sc.nextFloat();
	}

	public Mercancia(String tipo_nuevo, float kgs_nuevo, float preciokg_nuevo) {
		this.tipo = tipo_nuevo;
		this.kgs = kgs_nuevo;
		this.preciokg = preciokg_nuevo;

	}

	public String getTipo() {
		return (tipo);

	}

	public float getKgs() {
		return (kgs);
	}

	public void setKgs(float kgs_nuevo) {
		this.kgs = kgs_nuevo;
	}

	public float getPreciokg() {
		return (preciokg);
	}

	public void setPreciokg(float preciokg_nuevo) {
		this.preciokg = preciokg_nuevo;
	}

	public String toString() {
		return (this.tipo + " " + this.kgs + " " + this.preciokg + "");
	}

}
