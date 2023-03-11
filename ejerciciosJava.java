

package practica1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practica {

	static void primermetodo(String msg) {
		System.out.println(msg);
	}
	
	static void ejercicio1() {
		
	}
	
	static void ejercicio2() {
		double radio = 0.0;
		
		Scanner inputRadio = new Scanner(System.in);
		System.out.println("Ingresa el valor del radio: ");
		
		radio = inputRadio.nextInt();
		
		double area = Math.PI * radio * radio;
		double circunferencia =  2 * Math.PI * radio;
		
		inputRadio.close();
		System.out.println("El área es: " + area);
		System.out.println("La circunferencia es: " + circunferencia);
	}
	
	static void ejercicio3() {
		LocalDateTime now = LocalDateTime.now();
		String horaConFormato = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("La hora actual es: " + horaConFormato);
	}
	
	static void ejercicio4() {
		

		int segundosTotales = 0; 
		System.out.println("Ingrese el valor en segundos: ");

		Scanner inputSegundos = new Scanner(System.in);
		
		segundosTotales = inputSegundos.nextInt();
		
		inputSegundos.close();
        
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        
        System.out.println(segundosTotales + " segundos equivalen a: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
		
		//Aquí intente hacer algo que no funciono, pero planeo hacerlo funcionar
		/*
		int segundos = 0;
		double minutos = 0.0;
		double horas = 0.0;
		
		Scanner inputSegundos = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de segundos: ");
		
		segundos = inputSegundos.nextInt();
		if (segundos > 59) {
			minutos = segundos / 60;
			
			if (minutos > 60) {
				horas = minutos / 60;
			}
		} else {
			System.out.println(segundos + "segundos equivalen a " + segundos + "segundos");
		}
		
		*/
	}
	
	static void ejercicio5() {
		double radio = 0.0; 
		
		System.out.println("Ingrese el radio de la esfera: ");
		Scanner inputRadio = new Scanner(System.in);
		
		radio = inputRadio.nextDouble();
		//inputRadio.close();
		
		//Math.PI representa el valor de PI
		double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3); //Math.pow() es utilizada para elevar a una potencia
               
        System.out.println("El volumen de la esfera es: " + volumen);
	}
	
	static void ejercicio6() {
		double radio = 0.0; 
        double altura = 0.0;
        
        System.out.println("Ingrese el radio del cono: ");
		Scanner inputRadio = new Scanner(System.in);
		radio = inputRadio.nextDouble();
		//inputRadio.close();
		
		System.out.println("Ingrese la altura del cono: ");
		Scanner inputAltura = new Scanner(System.in);
		altura = inputAltura.nextDouble();
		//inputAltura.close();
        
        double volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El volumen del cono es: " + volumen);
	}
	
	static void ejercicio7() {
		double lado = 0.0;
		
		System.out.println("Ingrese el valor de uno de los lados del cubo: ");
		Scanner inputLado = new Scanner(System.in);
		lado = inputLado.nextDouble();
		
		double areaSuperficialCubo = (lado * lado) * 6;
		
		System.out.println("El área superficial del cubo es: " + areaSuperficialCubo);
	}
	
	static void ejercicio8() {
		int anio = 0;
		System.out.println("Ingrese un año para saber si es bisiesto: ");
		Scanner inputAnio = new Scanner(System.in);
		anio = inputAnio.nextInt();
		 
		//Investigue que los años bisiestos cumplen con las siguentes caracteristicas
		//Si el año es divisible entre 4, es bisiesto.
		//Pero si es divisible entre 100, no es bisiesto. A menos que tambien sea divisible entre 400. Entonces si lo es. 
		
		//inputAnio.close();
		
		String esBisiesto = ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) ? " es bisiesto" : " no es bisiesto";
		System.out.println(anio + esBisiesto);
		}
	
	static void ejercicio9() {
		
		//Este no me ha salido :(, pero lo corregiré
		
		/*
		
		boolean flag = true;
		int maximo = 100; // Ejemplo de número máximo
		int contador = 0;
		
		while (contador < maximo) {
			for (int i = 2; flag == true ; i++) {
	            boolean esPrimo = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	            if (esPrimo) {
	                System.out.println(i);
	                contador = contador + 1;
	            }
			}
        }
        
        */
		
		/*
		int numPrimosEncontrados = 0;
        int numActual = 2;
        
        while (numPrimosEncontrados < 100) {
            boolean esPrimo = true;
            for (int i = 2; i < numActual; i++) {
                if (numActual % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numActual);
                numPrimosEncontrados++;
            }
            numActual++;
        }
		 */
	}
	
	static void ejercicio10() {
		
		//Investigué
		//Este ejercicio se puede realizar utilizando métodos XOR y AND, pero aún no comprendo muy bien como es que funciona. 
		//Aún no me ha salido 
		
		/*
		
		int a = 5;
        int b = 3;
        int carry;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println("La suma de los números es: " + a);
		
		*/
	}
	
	static void ejercicio11() {
		int numero = 0;
		System.out.println("Ingrese un numero de dos digitos");
		Scanner inputNumero = new Scanner(System.in);
		numero = inputNumero.nextInt();
		
		//Falta cerrar el Scanner
		
		if(numero < 10 || numero > 99) {
			System.out.println(numero + " no es un palíndromo.");
		}
		int decenas = numero / 10;
		int unidades = numero % 10;
		if (decenas == unidades) {
			System.out.println(numero + " es un palíndromo.");
		} else {
			System.out.println(numero + " no es un palíndromo.");
		}		
	}
	
	static void ejercicio12() {
		// Aun no encuentro como resolver este, pero lo revisaré durante el fin
	}
	
	static void ejercicio13() {
		String texto = "";
		String textoSinEspacios = "";
		
		System.out.println("Ingresa un texto corto: ");
		Scanner inputTexto = new Scanner(System.in);
		texto = inputTexto.nextLine();
		
		//Falta cerrar el Scanner
		
		textoSinEspacios = texto.replace(" ", "");
		
		System.out.println("Texto Original: " + texto);
		System.out.println("Texto Modificado: " + textoSinEspacios);
		
	}
	
	static void ejercicio14() {
		
		String texto = "";
		
		System.out.println("Ingresa un texto corto: ");
		Scanner inputTexto = new Scanner(System.in);
		texto = inputTexto.nextLine();
		
		//Falta cerrar el Scanner
		
        StringBuilder constructorTexto = new StringBuilder(texto); //Este metodo invierte el orden de los caracteres que se le mandan (Siempre es necesario crear el StringBuilder)
        constructorTexto.reverse();
        String textoInvertido = constructorTexto.toString();
        System.out.println(textoInvertido);
	}
	
	static void ejercicio15() {
		int numero = 0;
		int factorial = 0;
		System.out.println("Ingrese un numero para calcular su factorial: ");
		Scanner inputNumero = new Scanner(System.in);
		numero = inputNumero.nextInt();
		factorial = calcularFactorial(numero);
		
		//Este metodo utiliza recursión para poder calcular el factorial.
		
		System.out.println(factorial);
		
	}
	
	public static int calcularFactorial(int n) {
		if (n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
	}
	
	
	public static void main(String[] args) {
		primermetodo("Primeros ejercicios Java");
		System.out.println("------------------------");
	//	ejercicio2();
	//	ejercicio3();
	// 	ejercicio4();
	// 	ejercicio5();
	// 	ejercicio6();
	//	ejercicio7();
	//	ejercicio8();
	//	ejercicio9();
	//	ejercicio10();
	//	ejercicio11();
	//	ejercicio12();
	//	ejercicio13();
	//	ejercicio14();
		ejercicio15();
	
	}

}


//1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	// Revisar si es un triángulo válido
	
	// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
	// Utilizar PI de la libreria de Java
	
	// 3 Escribir un metodo que muestre por consola la hora del sistema
	// Utilizar e investigar la libreria de Java

	// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
	// ej 3600 = "1 hora = 60 min = 3600 seg"
	
	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	
	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	
	// 7 Encontrar el area superficial de un cubo dado un lado a

	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no

//9. Escribir mostrar en pantalla los primeros 100 numeros primos
//10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
//11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
//12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
//13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
//14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
//15. Escribir un metodo para encontrar el factorial de un numero sin loops
