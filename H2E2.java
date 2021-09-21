package hoja1Ejercicio2;

import java.util.Scanner;

public class H2E2 {

	public static void main(String[] args) {
		//Elisa Expolio 20-09-21
		/*Programa que lee 3 n�meros comprendidos enytre el 20 y el 40. En el caso de que alg�n n�mero introducido no se encuentre en el rango
		  se muestra un mensaje de error y se sigue pidiendo n�meros. El programa finaliza al haber introducido 3 n�meros v�lidos y muestra el 
		  m�ximo de los mismos.Adem�s indica cu�les no han sido v�lidos.
		 */

		//Declaramos variable
		int numero;
		int contNumValidos=0;  //contador para el bucle do-while. SIEMPRE hay que darles un valor inicial
		int contIncorrectos=0;
		int maximo=19;
		int minimo=41;
		Scanner sc = new Scanner(System.in); //ponerse encima para la opcion de importar el Java util
		
		//Creamos bucle for
		/*for (int i=1; i<=3;)
		{
			System.out.print("Introduzca n�mero: ");
			numero=sc.nextInt(); //vamos sobreescribiendo la variable n�mero y perdemos los datos anteriores
			//Esto no nos vale porque no cumple las condiciones que nos piden en el enunciado.
			//Probamos con un if
			
			if (numero<20 || numero>40)
			{
				System.out.println("Fuera de rango! Introducir n�mero entre 20 y 40"); //asi solo recoge 3 n�meros, pero solo queremos 3 correctos
			}
			else 
			{
				i++;
			}
		}*/
		//As� funciona, pero digamos que no es una forma muy limpia de realizar la tarea
		do 
		{
			System.out.println("Introduzca n�mero: "); //el orden de esta linea y la siguiente es importante
			numero=sc.nextInt();
			
			//ponemos las condiciones del ejercicio
			if(numero>=20 && numero<=40)
			{
				contNumValidos++;
				if(numero>maximo)
				{
					maximo=numero; //si el n�mero es mayor que el que hemos definido como m�ximo, ente pasa a ser el nuevo m�ximo
				}
				if(numero<minimo)
				{
					minimo=numero; //si el numero es menor que el definido, este pasa a ser el nuevo minimo
				}
			}
			
			else
			{
				System.out.println("N�mero fuera de rango! Introducir n�mero entre 20 y 40");
				contIncorrectos++;
			}
		}while(contNumValidos<3);
		
		sc.close();
		
		//sacamos el n�mero de numeros no validos, el m�ximo y el m�nimo
		String mensaje= "RESULTADOS:"+"\n" + "El m�ximo es: " + maximo + "\n"
						+"El m�nimo es: " + minimo + "\n"
						+"Cantidad de errores: " + contIncorrectos;
		System.out.println(mensaje);
				
		
	}

}
