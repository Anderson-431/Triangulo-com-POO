package app;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digiti as medidas do tri?ngulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digiti as medidas do tri?ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();		
		double areaY = y.area();
		
		if (areaX > areaY) {
			System.out.println("?rea Maior: X");
		}
		else {
			System.out.println("?rea Maior: Y");
		}
		
		
		sc.close();

	}

}
