package OperadoresJava;

import java.util.Scanner;

public class SalarioExtra {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.print("Adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		System.out.print("Horas extras: ");
		horasExtras = ler.nextFloat();
		System.out.print("Descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.print("Salário líquido: " + String.format("%.02f", salarioLiquido));
		
	}
}
