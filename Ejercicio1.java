public class Ejercicio1{
	public static void main (String [] args){
		
		 // System.out.println("==========================================");
		 //Ejemplo de contains
		 // String cadena = " Puede ser una frase ";
		 // boolean contiene = cadena.contains(" una ");
		 // System.out.println(contiene);
		
		
    System.out.println("==========================================");
        // Ejemplo de endsWith
		String emails1[] = {"Joaquin@gmail.com","Joaquin@red.es","Joaquin@hotmail.com","Joaquin@email.it","Joaquin@telecom.fr", "Joaquin@aulambra.com","Joaquin@hotmail.com","Joaquin@yahoo.com","Joaquin@realmadrid.cat"};
		for (String email1: emails1)
			if (email1.endsWith(".com")) System.out.println(email1);
		
	System.out.println("==========================================");
		//Ejemplo de EqualsIgnoreCase
		String sCadena1 = new String("Joaquin");
        String sCadena2 = new String("Marcos");
        String sCadena3 = new String("JOAQUIN");

        if (sCadena1.equalsIgnoreCase(sCadena2))
			System.out.println(sCadena1 + " y " + sCadena2 + " son IGUALES");
		else
			System.out.println(sCadena1 + " y " + sCadena2 + " son DIFERENTES");
		if (sCadena1.equalsIgnoreCase(sCadena3))
			System.out.println(sCadena1 + " y " + sCadena3 + " son IGUALES");
		else
			System.out.println(sCadena1 + " y " + sCadena3 + " son DIFERENTES");
		
	System.out.println("==========================================");
		// Ejemplo de isEmpty
        String str = "Este string no esta vacio";
        System.out.println(" Este string no esta vacio ");
        System.out.println(" Longitud del string = " + str.length() );
        System.out.println(" ¿Esta vacio este string? = " + str.isEmpty() );
		
	System.out.println("==========================================");
	// Ejemplo de startsWith
		String emails2[] = {"Joaquin@gmail.com","Hoa@red.es","Hoa@hotmail.com","Hoa@email.it","Joaquin@telecom.fr", "Joaquin@aulambra.com","Joaquin@hotmail.com","Joaquin@yahoo.com","Joaquin@realmadrid.cat"};
		for (String email2: emails2)
			if (email2.startsWith("Hoa")) System.out.println(email2);
		
	System.out.println("==========================================");
	// Ejemplo charAt
		String Acadena="Joaquin";
        char letra1=Acadena.charAt(0);
        char letra2=Acadena.charAt(1);
        char letra3=Acadena.charAt(2);
        System.out.println(letra1);
        System.out.println(letra2);
        System.out.println(letra3);
	
	System.out.println("==========================================");	
	// Ejemplo length 
	  String Str1 = new String(" Este es un ejemplo de length ");
      String Str2 = new String(" Joaquin " );
	  System.out.println (" Frases utilizadas "); 
	  System.out.println (" ------------------- "); 
	
	  System.out.println (" Este es un ejemplo de length "); 
	  System.out.println (" Joaquin "); 
      System.out.println (" ------------------- "); 
	  
      System.out.println (" Longitud del String = " + Str1.length( ));
    

      System.out.println (" Longitud del String = " + Str2.length( ) );
   
	  
	System.out.println("==========================================");
	  String Rcadena = new String(" Nata ");
      System.out.println(" Cambiamos de Nata a = "); 
      System.out.println(Rcadena.replace('a','e')); //nete
   
	System.out.println("==========================================");
	//Ejemplo toUpperCase
	  String Str3 = new String(" Ejemplo de toUpperCase ");

      System.out.println (" La frase esta escrita de esta forma = ");
      System.out.println (" Ejemplo de toUpperCase  ");
      System.out.println (" Devolver valor = " + Str3.toUpperCase());
	
	System.out.println("==========================================");
	// Ejemplo de toLowerCase
	  String Str4 = new String(" Ejemplo de TOLOWERCASE ");

      System.out.println (" La frase esta escrita de esta forma = ");
      System.out.println (" Ejemplo de TOLOWERCASE  ");
      System.out.println (" Devolver valor = " + Str4.toLowerCase());
	  
	System.out.println("==========================================");
	// Ejemplo de SubsString
	  String s = " Joaquin Diaz ";
      System.out.println ( " Mandamos Joaquin Diaz y nos devuelve = ");
      System.out.println (s.substring(8)); // Nos devuelve "Diaz"
	System.out.println("==========================================");
	
	
	}
}
		
