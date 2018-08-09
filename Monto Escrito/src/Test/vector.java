package Test;

import java.util.Scanner;

//Clase Vector
public class vector {
	
	public vector() {
		//Variables
		int NumeroDigitadoUser;
		String NumeroDigitadoUserr;
		String NumeroResultado;
		//String numeromos;
		//int numprueba;
		
		
		Scanner scan=new Scanner(System.in);		
		
		
	
		System.out.println("Ingrese si es Gay o no, Si o No: ");
		NumeroDigitadoUserr = scan.next();
		
		System.out.println("No importa lo que coloque, eres gay.");
	
		
		
		
		
		//Número a guardar
		System.out.println("Ingrese el número que desea convertir: ");
		NumeroDigitadoUser = scan.nextInt();
	
		
		//Casos
		switch(NumeroDigitadoUser) 
		{
			case 1: 
				NumeroResultado = "UNO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				NumeroResultado.equals(NumeroDigitadoUser);
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
				
			case 12: 
				NumeroResultado = "DOCE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		


			case 13: 
				NumeroResultado = "TRECE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				

			case 14: 
				NumeroResultado = "CATORCE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				

			case 15: 
				NumeroResultado = "QUINCE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				

			case 16: 
				NumeroResultado = "DIEZYSEIS";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				

			case 17: 
				NumeroResultado = "DIEZYOCHO";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				

			case 19: 
				NumeroResultado = "DIEZYNUEVE";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				
								

			case 20: 
				NumeroResultado = "VEINTE	";
				System.out.println("El numero digitado en letras es: "+(NumeroResultado));
				break;		
				
								
			default:
				System.out.println("La expresion es incorrecta");
				break;
		
		}
		
		
		//if()
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CLase del Test de MontoEscrito");	
	}
	*/

}
