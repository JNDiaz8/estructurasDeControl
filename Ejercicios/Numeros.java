public class Numeros{
	public static void main(String [] args){
		System.out.println("====================");
		imprimirPrimerosDiezNumeros();
		System.out.println("====================");
		imprimirDeCincoEnCincoNumeros();
		System.out.println("====================");
		imprimirDeDiezEnDiezNumeros();
		System.out.println("====================");
		
	}
	public static void imprimirPrimerosDiezNumeros(){
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
		}
	}
	public static void imprimirDeCincoEnCincoNumeros(){
		for (int i = 20; i <= 80; i = i + 5){
			System.out.println(i);
		}
	}
	public static void imprimirDeDiezEnDiezNumeros(){
		for (int i = 100; i >= 50; i = i - 10){
			System.out.println(i);
		}
	}
	
}