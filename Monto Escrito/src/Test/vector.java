package Test;

import java.util.Scanner;

//Clase Vector
public class vector {
	
	public vector() {
		//Variables
		int NumeroDigitadoUser;
		String NumeroResultado;
		//String numeromos;
		//int numprueba;
		Scanner scan=new Scanner(System.in);
		
		//Número a guardar
		System.out.println("Ingrese el número que desea convertir: ");
		NumeroDigitadoUser = scan.nextInt();
	
		
		//Casos
		switch(NumeroDigitadoUser) 
		{
			case 1: 
				NumeroResultado = "UNO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			
			case 2: 
				NumeroResultado = "DOS";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 3: 
				NumeroResultado = "TRES";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 4: 
				NumeroResultado = "CUATRO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 5: 
				NumeroResultado = "CINCO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 6: 
				NumeroResultado = "SEIS";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 7: 
				NumeroResultado = "SIETE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 8: 
				NumeroResultado = "OCHO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;				
				
			case 9: 
				NumeroResultado = "NUEVE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;
				
			case 10: 
				NumeroResultado = "DIEZ";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				
			case 11: 
				NumeroResultado = "ONCE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				
				
			default:
				System.out.println("La expresion es incorrecta");
				break;
		
		}
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CLase del Test de MontoEscrito");	
	}
	*/

}
