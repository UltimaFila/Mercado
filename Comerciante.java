import java.util.ArrayList;

public class Comerciante {

	String nombre;
	String CIF;
	String tipoNegocio;

	ArrayList<Mercancia> mercancias = new ArrayList<Mercancia>();
	
	
	public Comerciante(String nombre_nuevo, String CIF_nuevo){
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

	public void String setNombre(String nombre_nuevo) {
		this.nombre = nombre_nuevo;
	}
	
	public void String setTipoNegocio() {
		return (tipoNegocio);
	}
	
	
	
	

	private void Buscar() {

	}

}
