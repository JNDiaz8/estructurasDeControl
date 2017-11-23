import java.util.Scanner;

public class Cifras{
	public static void main(String [] args){
		
		System.out.println("Introduce un numero de 3 cifras");
		Scanner sc = new Scanner(System.in);
		int nTresCifras = sc.nextInt();
		sc.close();
		
		//Comprobamos si es un numero negativo, si lo es lo pasamos a positivo
		if(nTresCifras < 0){
			nTresCifras *= -1;
		}
		
		//Comprobamos que tiene 3 cifras
		if( nTresCifras < 100 || nTresCifras > 999){
			//No hacemos nada y salimos del programa 
			System.out.println("No es un nº de tres cifras");
			
		}else {
		//Codigo para el caso de tres cifras
		System.out.println("Es un nº de tres cifras");
		//Convertir a cadena, para poder recorrer los tres caracteres
		//TRUCO concatenar el int a cadena vacia
		String nCadena = nTresCifras + ""; //Casting a cadena
		for (int i = 0; i < 3; i++){
			System.out.println("Cifra = " + nCadena.charAt(i));
			
		}
		}
	}
}