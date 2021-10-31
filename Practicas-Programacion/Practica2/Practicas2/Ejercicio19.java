package Practicas2;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingresa el valor de X²: ");
			double a = keyboard.nextInt();
		System.out.println("Ingresa el valor de X¹: ");
			double b = keyboard.nextInt();
		System.out.println("Ingresa el valor de X: ");
			double c = keyboard.nextInt();
		
				
		  if ((a == 0) && (b == 0) && (c == 0)) {
		      System.out.println("La ecuación tiene infinitas soluciones.");
		    }
		    
		   
		    
		    if ((a == 0) && (b == 0) && (c != 0)) {
		      System.out.println("La ecuación no tiene solución.");
		    }
		      
		   
		    
		    if ((a != 0) && (b != 0) && (c == 0)) {
		      System.out.println("x1 = 0");
		      System.out.println("x2 = " + (-b / a));
		    }
		    
		    if ((a == 0) && (b != 0) && (c != 0)) {
		      System.out.println("x1 = x2 = " + (-c / b));
		    }

		   
		    
		    if ((a != 0) && (b != 0) && (c != 0)) {
		        
		      double discriminating  = b*b - (4 * a * c);
		      
		      if (discriminating < 0) {
		          System.out.println("Ya que el discriminante es menor que cero entonces la ecuación no tiene resolución real.");
		      }  else {
		        System.out.println("x1 = " + (-b + Math.sqrt(discriminating))/(2 * a));
		        System.out.println("x2 = " + (-b - Math.sqrt(discriminating ))/(2 * a));
		      }
		    }

	keyboard.close();
	}
}
