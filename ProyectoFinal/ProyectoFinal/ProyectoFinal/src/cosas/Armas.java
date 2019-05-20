
package cosas;

/**
 *
 * @author 1DAM
 */
public class Armas extends Objetos {
    private byte fuerzaArma;
    
	public Armas(String nombreObjeto, String descripcionObjeto, byte fuerzaArma) {
		super(nombreObjeto, descripcionObjeto);
		this.fuerzaArma = fuerzaArma;
	}
	
	public byte getFuerzaArma() {
		return fuerzaArma;
	}
	public void setFuerzaArma(byte fuerzaArma) {
		this.fuerzaArma = fuerzaArma;
	}

	
}
