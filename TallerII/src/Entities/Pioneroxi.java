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
		this.fuelType=" MMH y tetr�xido de nitr�geno";
		this.pushingForce = 26; 
		this.destination= "J�piter" ;
		this.inOrbit= true;
	}
	
	
	/**
	 * Sobreescritura de m�todos 
	 */
	
	@Override
	public void speed() {
		System.out.println("Se desplaza inercialmente");
	}

	@Override
	public void timeActivity() {
		System.out.println("4 millones de a�os aproximadamente");
	}
	
	@Override
	public void power() {
		System.out.println("No se especifica"); 
	}
}
