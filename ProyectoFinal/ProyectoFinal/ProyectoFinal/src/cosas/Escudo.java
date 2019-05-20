/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosas;

/**
 *
 * @author 1DAM
 */
public class Escudo extends Objetos {
    private byte defensaEscudo;   

	public Escudo(String nombreObjeto, String descripcionObjeto,byte defensaEscudo) {
		super(nombreObjeto, descripcionObjeto);
		this.defensaEscudo = defensaEscudo;
	}
	public byte getDefensaEscudo() {
		return defensaEscudo;
	}
	public void setDefensaEscudo(byte defensaEscudo) {
		this.defensaEscudo = defensaEscudo;
	}

    
}

