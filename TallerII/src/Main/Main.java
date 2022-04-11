
/**
 * @author LORENA FAJARDO
 * Cantera II - Taller II
 */

package Main;

/**
 * Importación de clases
 */
import java.util.Scanner;
import Entities.Energia;
import Entities.NewHorizons;
import Entities.EEI;
import Entities.Pioneroxi;
import Entities.Salyut;
import Entities.Saturnov;

public class Main {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int option =0;
	
		
		/**
		 * Implemetacion de ciclo Do-while para generar ejecución infinita
		 */
		
		do{
	
		
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("Escriba el tipo de aeronnave que quiere crear o salir");
	System.out.println("1. Lanzadera: Cohetes autopropulsados");
	System.out.println("2. Nave no tripuladas o robóticas");
	System.out.println("3. Nave espaciales tripuladas");
	System.out.println("4. Salir");
	option = input.nextInt();
	System.out.println("-----------------------------------------------------------------------------------");

	
	/**
	* Creación de aeronaves mediante el condicional switch-case
	*/
	
	switch (option){
	
	case 1:
		System.out.println();
		System.out.println("Tipo de combustible");
		System.out.println("1. hidrógeno y oxígeno liquido");
		System.out.println("2. Petróleo refinado y oxígeno líquido");
		int fuel = input.nextInt();
		
		/**
		 * Implementación del condicional if para obtener el atributo seleccioado por el usuario 
		 */
		
		if (fuel == 1) {
			
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			Saturnov saturnov = new Saturnov();
			System.out.println();
			System.out.println("Nombre de la aeronave: " + saturnov.name);
			System.out.println("Tipo de aeronave: " + saturnov.AircraftType);
			System.out.println("Combustible: " + saturnov.fuelType);
			System.out.println("Empuje: " + saturnov.pushingForce +" Toneladas");
			System.out.println("Destino: " + saturnov.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + saturnov.inOrbit);
			System.out.println("");
			System.out.println("Velocidad: ");
			saturnov.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			saturnov.timeActivity();
			System.out.println("Potencia:  ");
			saturnov.power();
			System.out.println("Capacidad de trasporte: ");
			saturnov.trasportCapacity();
		}
		
		else if (fuel==2){
			
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			Energia energia = new Energia();
			
			System.out.println("");
			System.out.println("Nombre de la aeronave: " + energia.name);
			System.out.println("Tipo de aeronave: " + energia.AircraftType);
			System.out.println("Combustible: " + energia.fuelType);
			System.out.println("Empuje: " + energia.pushingForce +" Toneladas");
			System.out.println("Destino: " + energia.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + energia.inOrbit);
			System.out.println("");
			System.out.println("Velocidad: ");
			energia.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			energia.timeActivity();
			System.out.println("Potencia:  ");
			energia.power();
			System.out.println("Capacidad de trasporte: ");
			energia.trasportCapacity();
		}
		else{
		break;
		}
		
		break;
		
	case 2:
		
		System.out.println();
		System.out.println("Tipo de combustible");
		System.out.println("1. MMH y tetróxido de nitrógeno");
		System.out.println("2. Hidracina");
		fuel = input.nextInt();
		
		if (fuel==1){
			
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			Pioneroxi pioneroxi = new Pioneroxi();
			
			System.out.println("Nombre de la aeronave: " + pioneroxi.name);
			System.out.println("Tipo de aeronave: " + pioneroxi.AircraftType);
			System.out.println("Combustible: " + pioneroxi.fuelType);
			System.out.println("Empuje: " + pioneroxi.pushingForce +" Kilogramos");
			System.out.println("Destino: " + pioneroxi.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + pioneroxi.inOrbit);
		
			System.out.println("");
			System.out.println("Velocidad: ");
			pioneroxi.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			pioneroxi.timeActivity();
			System.out.println("Potencia:  ");
			pioneroxi.power();
			
			break;
		} else if (fuel==2){
		
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			NewHorizons newHorizons = new NewHorizons();
			
			System.out.println();
			System.out.println("Nombre de la aeronave: " + newHorizons.name);
			System.out.println("Tipo de aeronave: " + newHorizons.AircraftType);
			System.out.println("Combustible: " + newHorizons.fuelType);
			System.out.println("Empuje: " + newHorizons.pushingForce +" Toneladas");
			System.out.println("Destino: " + newHorizons.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + newHorizons.inOrbit);
			System.out.println("");
			System.out.println("Velocidad: ");
			newHorizons.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			newHorizons.timeActivity();
			System.out.println("Potencia:  ");
			newHorizons.power();
		}else{
			break;
		}
		
		break;
		
	case 3:
		System.out.println("");
		System.out.println("Capacaidad de personas");
		System.out.println("1. Menor o igual a 3 ");
		System.out.println("2. Menor o igual a 7");
		fuel = input.nextInt();
		
		if (fuel==1){
			
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			Salyut salyut = new Salyut();
			
			System.out.println("");
			System.out.println("Nombre de la aeronave: " + salyut.name);
			System.out.println("Tipo de aeronave: " + salyut.AircraftType);
			System.out.println("Combustible: " + salyut.fuelType);
			System.out.println("Empuje: " + salyut.pushingForce +" Toneladas");
			System.out.println("Destino: " + salyut.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + salyut.inOrbit);
			System.out.println("");
			System.out.println("Velocidad: ");
			salyut.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			salyut.timeActivity();	
			System.out.println("Potencia: ");
			salyut.power();
			System.out.println("Capacidad: ");
			salyut.peopleCapacity();
		
		} else if(fuel==2){
			
			/**
			 * Instancia de la aeroanave seleccionada y llamado de sus atributos
			 */
			EEI eei = new EEI();
			
			System.out.println("");
			System.out.println("Nombre de la aeronave: " + eei.name);
			System.out.println("Tipo de aeronave: " + eei.AircraftType);
			System.out.println("Destino: " + eei.destination);
			System.out.println("Actualmente se ecuentra en orbita? " + eei.inOrbit);
			System.out.println("");
			System.out.println("Velocidad: ");
			eei.speed();
			System.out.println("Tiempo de actividad que ha tenido este tipo de aeronave: ");
			eei.timeActivity();
			System.out.println("Potencia: ");
			eei.power();
			System.out.println("Capacidad: ");
			eei.peopleCapacity();
			
		}else{
			break;
		}
		
		break;
	}
	
	}while(option != 4 );
		System.out.println("  Vuelva pronto  ");
	}
	
}
