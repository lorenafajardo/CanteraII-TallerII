package Entities;

/**
 * Clase extendida de la clase abstracta Aircraft
 */

public class NewHorizons extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
	public NewHorizons(){
		this.name = "New Horizons";
		this.AircraftType="No tripulada";
		this.fuelType= "Hidracina";
		this.pushingForce = 3500; 
		this.destination= "Pluton" ;
		this.inOrbit= true;
	}
	
	/**
	 * Sobreescritura de metodos 
	 */
	
	@Override
	public void speed() {
		System.out.println("56000 Km/h");
	}

	@Override
	public void timeActivity() {
		System.out.println("9 años");
	}
	
	@Override
	public void power() {
		System.out.println("No se especifica"); 
	}
	
	
}
