package Entornos;
	import java.util.Scanner;

	public class SumaNumeros {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese el primer número:");
	        int numero1 = scanner.nextInt();
	        
	        System.out.println("Ingrese el segundo número:");
	        int numero2 = scanner.nextInt();
	        
	        int suma = numero1 + numero2;
	        System.out.println("La suma de los números es: " + suma);
	        
	        scanner.close();
	    }
	}


