package cosas;

public class Objetos extends ElementoMapa{
	private String nombreObjeto;
	private String descripcionObjeto;
	
	public Objetos(String nombreObjeto, String descripcionObjeto) {
		this.nombreObjeto = nombreObjeto;
		this.descripcionObjeto = descripcionObjeto;
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	public String getDescripcionObjeto() {
		return descripcionObjeto;
	}

	public void setDescripcionObjeto(String descripcionObjeto) {
		this.descripcionObjeto = descripcionObjeto;
	}
	
	
	
}
