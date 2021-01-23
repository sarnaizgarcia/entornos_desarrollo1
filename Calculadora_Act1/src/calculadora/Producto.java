package Calculadora;
import java.util.*;

/**
* Esta clase permite definir unos metodos
* para crear las multiplicaciones 
*@author guardiola
*
*/

public class Productos {
/**
* Este metodo permite multiplicar 2 valores reales
* @param num1-valor 1
* @param num2-valor 2
* @return -retorna un valor entero con el resultado de la operacion
* @throws NumberFormatException
* Excepcion si se introduce un valor String. {@link NumberFormatException#getLocalizedMessage()}
*/
	public int multiplicar1 (int num1, int num2){
	
	return num1*num2;
	}



/**
* Este metodo permite multiplicar 2 valores enteros
* @param num1-valor 1
* @param num2-valor 2
* @return -retorna un valor entero con el resultado de la operacion
* @throws NumberFormatException
* Excepcion si se introduce un valor String. {@link NumberFormatException#getLocalizedMessage()}
*/
	public float multiplicar2 (float num1, float num2){
	
	return num1*num2;
	}

/**
* Este metodo permite multiplicar 3 valores reales
* @param num1-valor 1
* @param num2-valor 2
* @param num3-valor 3
* @return -retorna un valor entero con el resultado de la operacion
* @throws NumberFormatException
* Excepcion si se introduce un valor String. {@link NumberFormatException#getLocalizedMessage()}
*/
	public int multiplicar3 (int num1, int num2,int num3){
	
	return num1*num2*num3;
	}

/**
* Este metodo permite multiplicar 2 valores reales
* @param base-valor 1
* @param exponente-valor 2
* @return -retorna un valor entero con el resultado de la operacion
* @throws NumberFormatException
* Excepcion si se introduce un valor String. {@link NumberFormatException#getLocalizedMessage()}
*/
	public double multiplicar4 (double base, double exponente){
	
	
	Object math;
	return (math).pow(base,exponente);
	}
}
