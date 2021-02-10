package Pruebas;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca valor: ");
		
		double n=teclado.nextDouble();
		double r;
		teclado.close();
		if (n<20000) {
			r= n*10/100;
		}
		else {
			r= n*21/100;
		}
		
		System.out.print("El IVA de " + n + " es de " + r + "%");
	}
}


