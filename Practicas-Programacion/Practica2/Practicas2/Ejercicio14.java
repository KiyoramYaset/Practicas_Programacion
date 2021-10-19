package Practicas2;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String []agrs) {
		
		Scanner keyboard = new Scanner (System.in);
		
		int num;
		int suma = 0; 
		int nums = 0;
	
	System.out.print("Introduce un numeros. El cero es para salir");
	
	do {
		num = keyboard.nextInt();
		suma = suma + num;
		nums ++;
		
	} while (num !=0);
		
		
	  System.out.println("La suma de los numeros es "+ suma + ".");
      System.out.println("La media aritmetica de los numeros es " + suma / nums + ".");
		
		keyboard.close();
		
		
	}
}
