/**
 * @author LORENA FAJARDO
 * Cantera II - Taller II
 */

package Entities;

/**
 * Creaci�n de clase abstracta Aircraft, con los atributos y m�todos de una aeronave
 */

public abstract class Aircraft {
	
	/**
	 * Atributos
	 * @param name            Nombre de la aeroave
	 * @param AircraftType    Clasificaci�n de la aeronave
	 * @param fuelType        Tipo de combustible
	 * @param pushingForce    Empuje
	 * @param inOrbit         Si se ecuentra en orbita este tipo de aeronave
	 */
	
	public String name;
	public String AircraftType;
	public String fuelType;
	public float pushingForce;
	public String destination;
	public boolean inOrbit; 

	/**
	 * Generaci�n de constructor vacio e inicializaci�n de las variables 
	 */
	
	public Aircraft() {
		this.name = "";
		this.fuelType = "";
		this.pushingForce = 0;
		this.destination = "";
		this.inOrbit = false;
	}
	
	/**
	 * Creaci�n de m�todos abstractos: 
	 * @param speed() Velocidad de la aeronave
	 * @param timeActivity() Tiempo que estuvo e actividad la aeronave 
	 * @param power() Potencia
	 */
	
	public abstract void speed();
	public abstract void  timeActivity();  
	public abstract void power();  
	
	
	
}
