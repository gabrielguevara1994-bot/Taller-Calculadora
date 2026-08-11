package com.calculadora;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		r1.altura=5;
		r1.base=4;
		
		int resultadoArea;
		
		resultadoArea=r1.calcularArea();
		
		System.out.println("Resultado Area:" +resultadoArea);
		
		Rectangulo r2=new Rectangulo();
		r2.altura=2;
		r2.base=4;
		
		double resultadoPerimetro;
		resultadoPerimetro=r2.calcularPerimetro();
		System.out.println("Resultado Perimetro:" +resultadoPerimetro);
		

	}

}
