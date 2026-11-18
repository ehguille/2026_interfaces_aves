package aves;

public class Golondrina extends Ave implements Volador {
	
	public Golondrina() {
		super("Golondrina","Negra");
	}
	
	public void volar() {
		System.out.println("La golondrina vuela sin posarse.");
	}

}
