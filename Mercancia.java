public class Mercancia {

	String tipo;
	float kgs;
	float preciokg;

	public Mercancia(String tipo_nuevo) {
		this.tipo = tipo_nuevo;

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

	public String listadoMercancia() {
		return (this.tipo + " " + this.kgs + " " + this.preciokg + "");
	}

}
