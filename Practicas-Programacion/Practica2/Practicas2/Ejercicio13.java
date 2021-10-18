package Practicas2;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String []main) {
	
	Scanner keyboard = new Scanner(System.in);
	
	int higher, num;
	char seguir = 'S';
	higher = 0; 
	
	

	do {
		System.out.print("Intoduce un numero:" );
		num = keyboard.nextInt();
		
		if (num>higher) {
			higher=num;
		}
				System.out.print("Quieres continuar (S/N)"); 
				seguir = keyboard.next().charAt(0);
		
	}
	
	while(seguir!='n');    
	System.out.print("El numero mayor es: " + higher + "\n");
	
	keyboard.close();

	}
}
