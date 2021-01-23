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
			 * @return restoR
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double restaReales(double minuendoR, double sustraendoR) {
				return (minuendoR-sustraendoR);
			}
			
			/**
			 * Este metodo resta dos <em>numeros enteros</em>
			 * 
			 * @param minuendoE
			 * 		Valor del minuendo.
			 * @param sustraendoE
			 * 		Valor del sustraendo.
			 * @return restoE
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public int restaEnteros(int minuendoE, int sustraendoE) {
				return (minuendoE-sustraendoE);
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
			 * @return restoTres
			 * 		Resultado de la operacion.
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double restaTresReales(double minuendoTres, double sustraendoTres, double sustraendoDosTres) {
				return (minuendoTres-sustraendoTres-sustraendoDosTres);
			}
			
			/**
			 * Este metodo calcula la resta de un valor acumulado
			 * 
			 * @param valor
			 * 		Valor del numero guardado
			 * @return valor
			 * @throws NumberFormatException
			 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
			 * 
			 */
			
			public double acumulado(double valor) {
				return valor;
			}

		}
