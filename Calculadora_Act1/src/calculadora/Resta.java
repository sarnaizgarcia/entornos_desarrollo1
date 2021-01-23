    package calculadora;
		import java.util.*;

		/**
		 * Esta clase implementa los metodos relacionados con la <b>resta</b> de la clase Calculadora
		 * 
		 * @author MerySagra
		 * @version 1.0
		 * @since 22/01/2021
		 * 
		 */

		public class resta{
			
			/**
			 * Este metodo resta dos <b>numeros reales</b>
			 * 
			 * @param minuendoR
			 * 		Valor del minuendo.
			 * @param sustraendoR
			 * 		Valor del sustraendo.
			 * @param resultado1
			 *		Valor del resultado.
			 * @return resultado1
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double restaReales(double minuendoR, double sustraendoR) {
				resultado1=minuendoR-sustraendoR;
				return resultado1;
			}
			
			/**
			 * Este metodo resta dos <em>numeros enteros</em>
			 * 
			 * @param minuendoE
			 * 		Valor del minuendo.
			 * @param sustraendoE
			 * 		Valor del sustraendo.
			 * @param resultado2
			 *		Valor del resultado.
			 * @return resultado2
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public int restaEnteros(int minuendoE, int sustraendoE) {
				resultado2=minuendoE-sustraendoE;
				return resultado2;
			}
			
			/**
			 * Este metodo calcula la resta de <u>tres numeros reales</u>
			 * 
			 * @param minuendoTres
			 * 		Valor del minuendo.
			 * @param sustraendoTres
			 * 		Valor del sustraendo.
			 * @param sustraendoDosTres
			 * 		Valor del sustraendo dos.
			 * @param resultado3
			 *		Valor del resultado.
			 * @return resultado3
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double restaTresReales(double minuendoTres, double sustraendoTres, double sustraendoDosTres) {
				resultado3=minuendoTres-sustraendoTres-sustraendoDosTres;
				return resultado3;
			}
			
			/**
			 * Este metodo calcula la resta de un valor acumulado
			 * 
			 * @param valor
			 * 		Valor del numero guardado
			 * @param resultado4
			 *		Valor del resultado.
			 * @return resultado4
			 * 		Resultado de la operación.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double acumulado(double valor) {
				resultado4=resultado4-valor;
				return resultado4;
			}

		}
