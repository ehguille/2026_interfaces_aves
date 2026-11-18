package aves;

public class Gaviota extends Ave implements Volador {
	
	public Gaviota() {
		super("Gaviota","Gris");
		System.out.println("Gaviota.java: se crea "+nombreVulgar+" de color "+color);
	}
	
	public void volar() {
		System.out.println("Las gaviotas vuelan distancias largas.");
	}

	

}
