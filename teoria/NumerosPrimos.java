public class NumeroPrimo {
    public static void main(String[] args){
        
       // long posibleNumeroPrimo = 7;

        boolean verificacionDivisible235 = verificarDivisibilidad2o3o5( posibleNumeroPrimo );
        System.out.println(verificacionDivisible235);

        long valorEnteroRaizCuadrada = calcularEnteroRaizCuadrada( posibleNumeroPrimo );
        boolean segundaVerificacion = valorEnteroRaizCuadrada * valorEnteroRaizCuadrada == posibleNumeroPrimo;
        System.out.println(segundaVerificacion);
        boolean divisiblePrimo = verificarDivisibilidadPrimos(valorEnteroRaizCuadrada);
        System.out.println(divisiblePrimo);
		
    }	

    public static boolean verificarDivisibilidad2o3o5 ( long numero ) {
        return resultado = numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 ;        
    }
    
    public static int calcularEnteroRaizCuadrada( long numero ) {
        return (long) Math.sqrt(numero);
    }

    public static boolean verificarDivisibilidadPrimos( long numero ) {
         boolean resultado = false;
         for (long divisor = 7 ; divisor <= numero / 2 ; divisor++ ) {
            resultado = numero % divisor == 0;
            if ( resultado ) {
                break;
            }
         }
         return resultado; 
    }


}