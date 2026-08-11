package com.calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora();
		
		int r1;
		
		r1 = c1.sumar(2, 3);
		
		System.out.println("Resultado Suma:" + r1);
		
		int r2;
		
		r2=c1.restar(8, 2);
		
		System.out.println("Resultado Resta:" + r2);
		
		double r3;
		
		r3=c1.multiplicar(6, 5);
		
		System.out.println("Resultado Multiplicación:" + r3);
		
		double r4;
		
		r4=c1.dividir(10, 2);
		
		System.out.println("Resultado División:" + r4);
		
		double r5;
		
		r5=c1.promedio(10, 9, 6);
		
		System.out.println("Resultado Promedio:" + r5);
		
		

	}

}
