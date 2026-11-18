package aves;

public class Pato extends Ave implements Volador, Nadador {
	
	public Pato() {
		super("Pato","Multicolor");
	}
	
	public void nadar() {
		System.out.println("El pato nada tranquilamente.");
	}

}
