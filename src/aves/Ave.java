package aves;

public abstract class Ave {
	
	protected String color;
	protected String nombreVulgar;
	
	public Ave(String nombreVulgar, String color) {
		this.color=color;
		this.nombreVulgar=nombreVulgar;
		System.out.println("Ave.java: se crea "+nombreVulgar+" de color "+color);
	}
	
	public String getColor() {
		return color;
	}
	
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	
	public void respirar() {
		System.out.println(nombreVulgar+ ": fiu fiu...");
	}
	

}
