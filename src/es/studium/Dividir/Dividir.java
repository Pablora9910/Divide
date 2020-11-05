package es.studium.Dividir;

import java.util.Scanner;

public class Dividir
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numerador, denominador;
		float resultado = 0;
		System.out.println( "Dame un numero" );
		numerador=teclado.nextInt();
		System.out.println( "Dame un segundo" );
		denominador=teclado.nextInt();
		if(denominador==0)
		{
			System.out.println( "No se puede dividir");
		}
		else
		{
			resultado=dividir(numerador, denominador);
			System.out.println( "El resultado es " + resultado);
		}
		
		teclado.close();
	}
	
	public static float dividir(int a, int b)
	{
		float resultado;
		resultado=(float)a/(float)b;
		return(resultado);
	}

}

/*FUNCION funDividir (ENTERO a,ENTERO b,) DEVUELVE REAL

VARIABLES
	REAL c
INICIO
	c=a/b
DEVOLVER c
FIN

PROGRAMA ejercicio6
VARIABLES
	ENTERO a,b
	REAL r
INICIO
	ESCRIBIR "Introduce el primer número"
	LEER a
	ESCRIBIR "Introduce el segundo número"
	LEER b
	SI b = 0 ENTONCES
		ESCRIBIR "No se puede dividir"
	SINO
		r=funDividir(a,b)
		ESCRIBIR "El resultado es " + r 
	FINSI
FIN*/