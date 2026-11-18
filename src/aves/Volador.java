package aves;

public interface Volador {
	
	//PROHIBIDO: public int numeroPatas;
	//Solo se permiten atributos static final:
	public static final int DISTANCIA_MAXIMA=200;

	//ni public, ni private ni protected
	default void volar() {
		System.out.println("El ave vuela de una forma genérica.");
	}	
	//void volar();

}
