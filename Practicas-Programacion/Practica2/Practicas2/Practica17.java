package Practicas2;
import java.util.Scanner;

public class Practica17 {
	public static void main(String [] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Indica los lados que quieres");
	int n = keyboard.nextInt(); //se le indica a la  variable que tendra una entrada
	
	for (int i = 1; i<=n ; i++){ //i++ suma uno
		for (int j = 1 ; j <= n; j++){
			if (j == 1 || j == n || i == 1 || i == n){

				System.out.print("* ");
			} else{
				System.out.print("  ");
			}

		}
		System.out.println(" ");	

	}
		
		keyboard.close();
		
	}

}
