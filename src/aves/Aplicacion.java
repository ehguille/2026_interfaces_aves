package aves;

public class Aplicacion {
	
	public Aplicacion() {
	/*	Ave a=new Ave("Peti rojo","Marrón");
		a.respirar();*/
		Gorrion g=new Gorrion();
		g.respirar();
		g.volar();
		
		Gallina ga=new Gallina();
		ga.volar();
		System.out.println(ga.NUMERO_PATAS);
	}

	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();

	}

}
