package com.calculadora;

public class Cuadrado {
	
		public double lado;
		
		public double calcularArea(){
			
			double area=Math.pow(this.lado, 2);
			return area;
		}
		
		public double calcularPerimetro(){
			
			double perimetro = lado*4;
			return perimetro;
		}

}
