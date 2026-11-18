package aves;

public class Pinguino extends Ave implements Nadador {
	
	public Pinguino() {
		super("Pinguino","Blanco y negro");
		System.out.println("Pinguino.java: se crea "+nombreVulgar+" de color "+color);
	}
	
	public void nadar() {
		System.out.println("Los pingüinos nadan y bucean");
	}

}
