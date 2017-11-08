public class Numeros{
	public static void main(String [] args){
	mostarNumero(10);
	RangoNumeros(10);
	}
	public static void mostarNumero(int numero){
		int contador =0;
		while (contador <= numero ){
			System.out.println( contador );
			contador++;
		}
	}
	public static void RangoNumeros (int numero){
		int contador =5;
		while (contador <= numero ){
			System.out.println( contador );
			contador++;
		}
		//Fuera del bucle
		//System.out.println(" Esta fuera del bucle " + contador);
	}
}