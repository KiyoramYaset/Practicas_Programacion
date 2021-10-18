package Practicas2;
import java.util.Scanner;

public class Ejercicio10 {

	    public static void main(String[] args) {	
	    	Scanner teclado = new Scanner(System.in);
	    	
	    	int dato1, dato2, dato3;
	        
	    	int[] arr;
			
			arr = new int[3];
			
			String mensaje;
			mensaje = "Los numeros ordenados son: ";
			
				for(int i=0; i<arr.length; i++) {
				
				System.out.println("Introduzca un numero: ");
				arr[i] = teclado.nextInt();
			   }
			
			dato1 = arr[0];
			dato2 = arr[1];
			dato3 = arr[2];
			
			if(dato1 >= dato2){
				if(dato1 >= dato3) {
						if(dato2 >= dato3) {
						System.out.println(mensaje + dato1 + ", " + dato2 + " y " + dato3);
					}
					else if(dato3 >= dato2) {
						System.out.println(mensaje + dato1 + ", " + dato3 + " y " + dato2);
					}
				}
				else {
					System.out.println(mensaje + dato3 + ", " + dato1 + " y " + dato2);
				}
			}		
			
			else if(dato2 >= dato3){
					if(dato1 >= dato3) {
						System.out.println(mensaje + dato2 + ", " + dato1 + " y " + dato3);
					}
					else if(dato3 >= dato1) {
						System.out.println(mensaje + dato2 + ", " + dato3 + " y " + dato1);
					}
				}
			
			else if (dato1 >= dato3){
						System.out.println(mensaje + dato1 + ", " + dato3 + " y " + dato2);
			}	
					else {
						System.out.println(mensaje + dato3 + ", " + dato2 + " y " + dato1);
					}
			teclado.close();
	    }
	}


