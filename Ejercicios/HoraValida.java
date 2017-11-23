import java.util.Scanner;

public class HoraValida{
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una hora válida");
		int hora = in.nextInt();
		
		if(hora < 0 || hora > 23){
			System.out.println("La hora no es válida");
			return;
		}
		System.out.println("Introduce los minutos");
		int minutos = in.nextInt();
		if(minutos < 0 || minutos > 59){
			System.out.println("Los minutos no son válidos");
			return;
		}
		System.out.println("Introduce los segundos");
		int segundos = in.nextInt();
		if(segundos < 0 || segundos > 59){
			System.out.println("Los segundos no son válidos");
			return;
		}
		System.out.println("Hora válida -> " + hora + ":" + minutos + ":" + segundos);
	}
}