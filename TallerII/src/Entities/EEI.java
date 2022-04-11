package Entities;

/**
 * Clase extendida de la clase abstracta Aircraft
 */

public class EEI extends Aircraft {

	/**
	 * Llamado del constructor de la clase abstracta
	 */
	
		public EEI(){
			this.name = "Estación Espacial Internacional";
			this.AircraftType="Tripulada";
			this.destination= "Satelites" ;
			this.inOrbit= true;
		}
		
	
		/**
		 * Sobreescritura de métodos 
		 */
		
		@Override
		public void speed() {
			System.out.println("No se especifica");
		}

		@Override
		public void timeActivity() {
			System.out.println("Actualmente esta en actividad");
		}
		
		@Override
		public void power() {
			System.out.println("No se especifica"); 
		}
		
		/**
		 * Sobrecarga de método  peopleCapacity(): Capacidad de personas de la aeronave tripulada
		 */
		public void peopleCapacity(){
			System.out.println(" 7 personas");;
		}
		
	}
