package com.jps;
import java.util.Scanner;
public class Calculadora {
Scanner dato = new Scanner (System.in);
double val1, val2; 

public void sumar () {
	System.out.println("Ingrese el primer valor ");
	val1 = dato.nextDouble();
	System.out.println("Ingrese el segundo valor ");
	val2 = dato.nextDouble();
	double resultado = 0;
	resultado = val1 + val2;
	System.out.println("El resultado es: " + resultado); 
}

public void restar () {
	System.out.println("Ingrese el primer valor ");
	val1 = dato.nextDouble();
	System.out.println("Ingrese el segundo valor ");
	val2 = dato.nextDouble();
	double resultado = 0;
	resultado = val1 - val2;
	System.out.println("El resultado es: " + resultado); 
}

public void multiplicar () {
	System.out.println("Ingrese el primer valor ");
	val1 = dato.nextDouble();
	System.out.println("Ingrese el segundo valor ");
	val2 = dato.nextDouble();
	double resultado = 0;
	resultado = val1 * val2;
	System.out.println("El resultado es: " + resultado); 
}

public void dividir () {
	System.out.println("Ingrese el primer valor ");
	val1 = dato.nextDouble();
	System.out.println("Ingrese el segundo valor ");
	val2 = dato.nextDouble();
	double resultado = 0;
	resultado = val1 / val2;
	System.out.println("El resultado es: " + resultado); 
}


public void calculo () {
	System.out.println("Elija la operacion que desea realizar: ");
	System.out.println("1: Sumar ");
	System.out.println("2: Restar ");
	System.out.println("3: Multiplicar ");
	System.out.println("4: Dividir ");
	int opcion = dato.nextInt();
	
	switch (opcion) {
	
	case 1: sumar (); 
	break; 
	case 2: restar (); 
	break; 
	case 3: multiplicar(); 
	break; 
	case 4: dividir (); 
	break; 
	default: System.out.println("No es un numero valido "); 
	}
	
	
	}

public static void main (String args[]) {
	Calculadora cal = new Calculadora ();
	cal .calculo();
}



}




