package personas;

import java.util.Random;
import cosas.Armas;
import cosas.ElementoMapa;
import cosas.Escudo;
import cosas.Objetos;
import java.util.ArrayList;

/**
 *
 * @author AleRodr
 */
public class Persona extends ElementoMapa{
    private String nombrePersona;
    private String apellidoPersona;
    private boolean generoPersona; //true it's woman, false it's men
    private byte esperanzaVidaPersona;
    private byte edadPersona;
    private byte fuerzaPersona;
    private byte defensaPersona;
    private byte carismaPersona;
    private ArrayList<Objetos> inventario;

    public final static  String[] nombresHombre= {"Aland","Bennett","Everard","Percival","Theobald","Ricker","Ackerley","Alistair","Brawley","Brayton","Buckminster","Drake","Odo","Wade","Richard","Robert","Walden"};
    public final static  String[] nombresMujer= {"Dye","Aalis","Aethelu","Margery","Melisende","Ibb","Agnes","Amice","Cecily","Daisy","Dionisia","Eda","Elena","Edith","Emma","Malle","Rhoslyn"};
    public final static String[] apellidosAl= {"Erikson","Tryggvan","Payne","Haraldsen"}; 
    
	public Persona() {
		Random r = new Random();
		this.generoPersona = r.nextBoolean();
		if(generoPersona==true) { // woman
			this.nombrePersona=nombresMujer[r.nextInt(nombresMujer.length)];
		}else {
			this.nombrePersona=nombresHombre[r.nextInt(nombresHombre.length)];
		}
		this.apellidoPersona = apellidosAl[r.nextInt(apellidosAl.length)];
		this.esperanzaVidaPersona = (byte)(40+r.nextInt(101-40));
		this.edadPersona = 15;
		this.fuerzaPersona = (byte)r.nextInt(15);
		this.defensaPersona = (byte)r.nextInt(15);
		this.carismaPersona = (byte)r.nextInt(101);
		this.inventario = new ArrayList<Objetos>();
	}
	
	public Persona(Persona padre, Persona madre) {
		Random r = new Random();
		this.generoPersona = r.nextBoolean();
		if(generoPersona==true) { //woman
			this.nombrePersona=nombresMujer[r.nextInt(nombresMujer.length)];
		}else {
			this.nombrePersona=nombresHombre[r.nextInt(nombresHombre.length)];
		}
		this.apellidoPersona = padre.getApellidoPersona();
		this.esperanzaVidaPersona = (byte)((padre.getEsperanzaVidaPersona()+madre.getEsperanzaVidaPersona())/2);
		this.edadPersona = 15;
		this.fuerzaPersona = (byte)r.nextInt(15);
		this.defensaPersona = (byte)r.nextInt(15);
		this.carismaPersona = (byte)r.nextInt(101);
		this.inventario = new ArrayList<Objetos>();
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
 
	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public boolean getGeneroPersona() {
		return generoPersona;
	}


	public byte getEsperanzaVidaPersona() {
		return esperanzaVidaPersona;
	}

	public byte getEdadPersona() {
		return edadPersona;
	}


	public byte getFuerzaPersona() {
		//Recorrer con un bucle el array de objetos y en un entero auxiliar (entAux) ir sumando la fuerza de los objetos (si la tiene)
		byte fArm=0;
		for (Objetos o:inventario) {
			if(o.getClass() == Armas.class){
			fArm+=((Armas)o).getFuerzaArma();
			}
			 
		}
		byte FuerzaRes = (byte)(fArm + fuerzaPersona);
		
		return FuerzaRes;
	}

	public byte getDefensaPersona() {
		//Lo mismo que con defensa
		byte defArm=0;
		for (Objetos o:inventario) {
			if(o.getClass() == Escudo.class) {
				defArm+= ((Escudo)o).getDefensaEscudo();
			}
		}
		byte DefensaRes = (byte)(defArm + defensaPersona);
		
		return DefensaRes;
	}

	public void setDefensaPersona(byte defensaPersona) {
		this.defensaPersona = defensaPersona;
	}

	public byte getCarismaPersona() {
		return carismaPersona;
	}

	public void setCarismaPersona(byte carismaPersona) {
		this.carismaPersona = carismaPersona;
	}


    
    
}
