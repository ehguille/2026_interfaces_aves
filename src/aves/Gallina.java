package aves;

public class Gallina extends Ave implements Volador {
	
	//Se sobreescribe lo que indicaba la interfaz
	public static final int DISTANCIA_MAXIMA=2;
	
	public Gallina() {
		super("Gallina","Blanco");
	}
	
	public void volar() {
		System.out.println("Las gallinas vuelan distancias cortas.");
	}

}
