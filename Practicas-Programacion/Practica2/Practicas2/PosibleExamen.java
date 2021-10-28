package Practicas2;
import java.util.Scanner;

public class PosibleExamen {
	public static void main (String[]args) {
Scanner keyboard = new Scanner(System.in);
    	
    	int valorEntrada = 0, elMayor, elMenor, contadorDatosValidos = 1;
    	String seguir;
    	
    	System.out.print("Teclea numeros entre 1 y 2147483647:");
    	System.out.println("\n-0 para terminar-");
    	valorEntrada = keyboard .nextInt();
    	elMayor=valorEntrada;
    	elMenor=valorEntrada;
    	
    	do {
        	valorEntrada = keyboard.nextInt();
        	if (valorEntrada>=1 && valorEntrada<=2147483647) {
        		contadorDatosValidos++;
        		if (valorEntrada>elMayor)
                {
                    elMayor=valorEntrada;
                }
                if (valorEntrada<elMenor)
                {
                    elMenor=valorEntrada;
                }
        	}        	
        }
        while (valorEntrada !=0);
        
        System.out.println("Pulsa la tecla T para salir");
        seguir = keyboard .next();
        
		if (seguir.equals("T || t"));
				
		System.out.println("Resultados:");
		System.out.println("Total de datos validos es: " +contadorDatosValidos);
		System.out.print("El numero mayor es: "+elMayor+"\n");
		System.out.print("El numero menor es: "+elMenor+"\n");
		
		keyboard.close();
		
	}

}
