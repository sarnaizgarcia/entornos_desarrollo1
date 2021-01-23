package calculadora;

/**
 * Esta clase implementa una calculadora.
 * 
 * @author sarnaizgarcia
 * @version 1.0
 * @since 15/01/2021
 */

public class Calculadora {

	public static void main(String[] args) {
		
		Cociente c = new Cociente();
		
		float divReales = c.cocienteReales(10.5F, 3.5F);
		int divEnteros = c.cocienteEnteros(10, 5);
		float inv = c.inverso(10F);
		double raizCuadrada = c.raiz(16);
		
		System.out.println(divReales);
		System.out.println(divEnteros);
		System.out.println(inv);
		System.out.println(raizCuadrada);

	}

}
