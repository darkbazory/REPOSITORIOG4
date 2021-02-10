package Pruebas;

public class refactorizacion {
	Ejercicio 1 (SUMA 5 NUMEROS MAYORES QUE 5)
	package cambio1;

	import java.util.Scanner;

	package refactorizacion;

	import java.util.Scanner;

	public class totalNumerosMayor5 {

		public static void main(String[] args) {
			System.out.println(calcular_Importe());

		}
		private static int calcular_Importe() {
			
				int total = 0;
				System.out.println("Introduzca el primer número mayor que 5");
				Scanner sc1  = new Scanner(System.in);
				int num1 = sc1.nextInt();
				if (num1 < 6)
					System.out.println("El número introducido debe ser mayor que 5");
				else
					total = total + num1;
					
				System.out.println("Introduzca el segundo número mayor que 5");
				Scanner sc2  = new Scanner(System.in);
				int num2 = sc2.nextInt();
				if (num2 < 6)
					System.out.println("El número introducido debe ser mayor que 5");
				else
					total = total + num2;
					System.out.println("Introduzca el tercer número mayor que 5 ");
					Scanner sc3  = new Scanner(System.in);
				int num3 = sc3.nextInt();
				if (num3 < 6)
					System.out.println("El número introducido debe ser mayor que 5");
				else
					total = total + num3;
					
				System.out.println("Introduzca el cuarto número mayor que 5");
				Scanner sc4  = new Scanner(System.in);
				int num4 = sc4.nextInt();
				if (num4 < 6)
					System.out.println("El número introducido debe ser mayor que 5");
				else
					total = total + num4;
				
				System.out.println("Introduzca el quinto número mayor que 5");
				Scanner sc5  = new Scanner(System.in);
				int num5 = sc1.nextInt();
				if (num5 < 6)
					System.out.println("El número introducido debe ser mayor que 5");
				else
					total = total + num5;
				return total;
				
				}
			}
}
