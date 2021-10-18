package Practicas2;
 
//EJercicio 12
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String [] args){
		 
		Scanner keyboard = new Scanner(System.in);
		
		int num;
		int total=0;
	
		for (int  i = 1 ; i <= 8; i ++) {

		System.out.println("Introduce numero " + i +":");
		 num = keyboard.nextInt();
		 total += num;
		
		}
		System.out.println("\nSuma acumulada: " + total);
	
		
		keyboard.close(); 
	}
	 

}
