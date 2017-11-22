public class Numeros{
	public static void main(String [] args){
	System.out.println("========================");
	mostarNumero(10);
	System.out.println("========================");
	RangoNumeros(5,9);
	System.out.println("========================");
	MostrarRangoNumeros(4,9);
	System.out.println("========================");
	mostrarRangoNumeros(4,9,'i');
	
	}
	public static void mostarNumero(int numero){
		int contador =0;
		while (contador <= numero ){
			System.out.println( contador );
			contador++;
		}
		//Fuera del bucle
		System.out.println("========================");
		System.out.println(" Esta fuera del bucle " + contador);
	}
	public static void RangoNumeros (int numero1, int numero2){
		if (numero1 < numero2){
			
			int contador = numero1;
		while (contador <= numero2 ){
			System.out.println( contador );
			contador++;
		}
			
		}else {
			System.out.println(numero1 + " es mas grande que " + numero2);
	    } 
	}
	public static void MostrarRangoNumeros( int numeroChico, int numeroGrande ) {
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande ) {
                    System.out.println(contador);
                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }  
    }
	public static void mostrarRangoNumeros( int numeroChico, int numeroGrande, char parEimpar ) {
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande) {
					if((parEimpar= 'p' || parEimpar = 'i') && contador % 2 = 0){
                    System.out.println(contador);
					}
                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }  
    }
}
