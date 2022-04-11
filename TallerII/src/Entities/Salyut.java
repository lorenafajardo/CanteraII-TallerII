package Entities;

/**
 * Clase extendida de la clase abstracta Aircraft
 */

public class Salyut extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
	public Salyut(){
		this.name = "Salyut";
		this.AircraftType="Tripulada";
		this.fuelType= "";
		this.pushingForce = 0; 
		this.destination= "Satelites" ;
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
		System.out.println("9 a�os");
	}
	
	@Override
	public void power() {
		System.out.println("No se especifica"); 
	}
	
	/**
	 * Sobrecarga de m�todo  peopleCapacity(): Capacidad de personas de la aeronave tripulada
	 */
	public void peopleCapacity(){
		System.out.println(" 3 personas");;
	}
}

