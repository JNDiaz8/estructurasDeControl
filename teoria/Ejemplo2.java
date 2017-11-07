public class Ejemplo2{
	public static void main (String args []){
		int numero = (int)( Math.random() * 4);
		if (numero % 2 == 0){
			System.out.println( numero + " es par");
		}
		else if(numero == 1){ 
		System.out.println( numero + " es el uno");
		}
		else if (numero == 2){ 
		System.out.println( numero + " es el dos");
		}
		else { 
		System.out.println( numero + " es el 3");
		}
	}
}