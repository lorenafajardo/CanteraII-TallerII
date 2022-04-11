package Entities;

/**
 * Clase extendida de la clase abstracta Aircraft
 */

public class Pioneroxi extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
	public Pioneroxi(){
		this.name = "Pionero XI";
		this.AircraftType="No tripulada";
		this.fuelType=" MMH y tetróxido de nitrógeno";
		this.pushingForce = 26; 
		this.destination= "Júpiter" ;
		this.inOrbit= true;
	}
	
	
	/**
	 * Sobreescritura de métodos 
	 */
	
	@Override
	public void speed() {
		System.out.println("Se desplaza inercialmente");
	}

	@Override
	public void timeActivity() {
		System.out.println("4 millones de años aproximadamente");
	}
	
	@Override
	public void power() {
		System.out.println("No se especifica"); 
	}
}
