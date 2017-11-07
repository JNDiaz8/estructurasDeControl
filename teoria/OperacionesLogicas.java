public class OperacionesLogicas{
   public static void main (String args []){
	   boolean variable1 = 5 > 4 * 3;
	   System.out.println(" La operación 5 > 4 * 3 debe de dar false : " + variable1);
	   variable1 = 7 * 3 >= 5 / 1;
	   System.out.println(" La operación 7 * 3 == 5 / 3 debe de dar true : " + variable1);
	   variable1 = variable1 && !(5 > 3 * 7);
	   System.out.println(" La operación variable1 && !(5 > 3 * 7) debe de dar true : " + variable1);
	   variable1 = variable1 || 5 > 3 * 7;
	   System.out.println(" La operación variable1 || 5 > 3 * 7 debe de dar true : " + variable1);
	   variable1 = variable1 | 5 > 3 * 7;
	   System.out.println(" La operación variable1 | 5 > 3 * 7 debe de dar true : " + variable1);
	   variable1 = !variable1 && !(5 > 3 * 7);
	   System.out.println(" La operación !variable1 && !(5 > 3 * 7) debe de dar false : " + variable1);
	   variable1 = variable1 & !(5 > 3 * 7);
	   System.out.println(" La operación variable1 & !(5 > 3 * 7) debe de dar false : " + variable1);
   }
}
