package Entities;

/**
 * Clase extendida de la clase abstracta Aircraft
 */

public class Energia extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
	public Energia(){
		this.name = "Energia";
		this.AircraftType="Autopropulsi�n";
		this.fuelType= "Petr�leo refinado y ox�geno l�quido";
		this.pushingForce = 3060; 
		this.destination= "" ;
		this.inOrbit= false;
	}
	
	/**
	 * Sobreescritura de m�todos 
	 */
	
	@Override
	public void speed() {
		System.out.println("No se especifica");
	}

	@Override
	public void timeActivity() {
		System.out.println(" 1 a�o");
	}
	
	@Override
	public void power() {
		System.out.println("32000�5 caballos"); 
	}
	
	/**
	 * Sobrecarga de m�todo  trasportCapacity(): Capacidad de transporte de carga
	 */
	public void trasportCapacity() {
		System.out.println("100 toneladas ");
	}
	
	
}
