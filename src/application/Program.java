package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Rectangle ret;
		ret = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura do retangulo:");
		ret.width = sc.nextDouble();
		System.out.println("Digite a altura do retangulo:");
		ret.height = sc.nextDouble();
		double area = ret.area();
		double perimetro = ret.perimeter();
		double diagonal = ret.diagonal();
		ret.mostrarDados();
		sc.close();
		

	}

}
