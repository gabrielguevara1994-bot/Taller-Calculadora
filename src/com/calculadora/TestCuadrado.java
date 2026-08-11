package com.calculadora;

public class TestCuadrado {

	public static void main(String[] args) {
		
		System.out.println("===Cuadro 1===");
		
		Cuadrado c1= new Cuadrado();
		c1.lado=4;
		
		double resultadoArea;
		
		resultadoArea=c1.calcularArea();
		System.out.println("Resultado Area:" + resultadoArea);
		
		double resultadoPerimetro=c1.calcularPerimetro();
		System.out.println("Resultado Perimetro:" + resultadoPerimetro);
		
		
		System.out.println("===Cuadro 2===");
		
		Cuadrado c2= new Cuadrado();
		c2.lado=8;
		
		double resultadoArea2;
		
		resultadoArea2=c2.calcularArea();
		System.out.println("Resultado Area:" + resultadoArea2);
		
		double resultadoPerimetro2=c2.calcularPerimetro();
		System.out.println("Resultado Perimetro:" + resultadoPerimetro2);
		
System.out.println("===Cuadro 3===");
		
		Cuadrado c3= new Cuadrado();
		c3.lado=5;
		
		double resultadoArea3;
		
		resultadoArea3=c3.calcularArea();
		System.out.println("Resultado Area:" + resultadoArea3);
		
		double resultadoPerimetro3=c3.calcularPerimetro();
		System.out.println("Resultado Perimetro:" + resultadoPerimetro3);
		

	}

}
