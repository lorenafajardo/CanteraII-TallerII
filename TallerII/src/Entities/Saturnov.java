
package Entities;

/**
 * @author LORENA FAJARDO
 * Clase extendida de la clase abstracta Aircraft
 */

public class Saturnov extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
	public Saturnov(){
		this.name = "Saturno V";
		this.AircraftType="Autopropulsión";
		this.fuelType= "hidrógeno y oxígeno liquido";
		this.pushingForce = 3500; // toneladas
		this.destination= "Luna" ;
		this.inOrbit= false;
	}
	
	/**
	 * Sobreescritura de métodos 
	 */
	
	@Override
	public void speed() {
		System.out.println("No se especifica");
	}

	@Override
	public void  timeActivity() {
		System.out.println(" 6 años");
	}
	
	@Override
	public void power() {
		System.out.println("32000×5 caballos"); 
	}
	
	/**
	 * Sobrecarga de métodos
	 */
	public void trasportCapacity() { 
		System.out.println("118 toneladas en órbita baja terrestre ");
	}
	
	
}
