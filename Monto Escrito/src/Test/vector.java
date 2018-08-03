package Test;

import java.util.Scanner;

//Clase Vector
public class vector {
	
	public void operadores() {
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
				System.out.println("El numero digitado el letras es: "+(NumeroDigitadoUser));
				break;
				
			
			case 2: 
				NumeroResultado = "DOS";
				System.out.println("El numero digitado el letras es: "+(NumeroDigitadoUser));
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
