import java.util.Scanner;
public class Ejercicio3{
	public static void main (String [] args){
		String nombre;
		String apellido;
		int edad;
		double altura;
		double peso;
		int entero;
		
		//Insertar Nombre y Apellido
	    Scanner NombreyApellido = new Scanner(System.in);
        System.out.println(" Inserta tu nombre y apellido: " );  
        nombre = NombreyApellido.next();
        apellido = NombreyApellido.next();
        
		//Insertar Edad
		Scanner Edad = new Scanner(System.in);
		System.out.println(" Inserta tu edad: " );
		edad = Edad.nextInt();
		
		//Insertar Peso
		Scanner Peso = new Scanner(System.in);
		System.out.println(" Inserta tu peso: " );
		peso = Peso.nextDouble();
		
		//Insertar Altura
		Scanner Altura = new Scanner(System.in);
		System.out.println(" Inserta tu altura: " );
		altura = Altura.nextDouble();

		//Todos los datos juntos
		
		System.out.println(" =================================== ");
		System.out.println(" Nombre y apellido: " + nombre + " " + apellido);
		System.out.println(" La edad es: " + edad + " años ");
		System.out.println(" Tu peso es de: " + peso + " kg ");
		System.out.println(" Tu estatura es de: " + altura + " m ");
		System.out.println(" =================================== ");
		System.out.println("  ");
		
		//Ejemplo hasnextint
		System.out.println(" =================================== ");
		Scanner Entero = new Scanner(System.in);
		System.out.println( " Inserte numero entero: ");
		while (Entero.hasNextInt() == true){
			entero = Entero.nextInt();
			System.out.println(" Es un valor entero :  " + entero);
			}
			System.out.println( " No es valor entero ");
		System.out.println(" =================================== ");
		
	}	
}
