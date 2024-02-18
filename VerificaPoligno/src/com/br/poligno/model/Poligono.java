package com.br.poligno.model;

public class Poligono {

	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	private String resultado;
	
	public Poligono(int lado1, int lado2, int lado3, int lado4){
		this.lado1 = lado1;	
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public String verificaPoligno() {
		if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
			this.resultado = "Quadrado";
		}else if (lado1 == lado2 && lado2 != lado3 && lado3 != lado4) {
			this.resultado = "Trapezio";
		}else if (lado1 == lado2 && lado2 == lado3 && lado4 == 0) {
			this.resultado = "Triangulo";
		}else {
			this.resultado = "Outro poligono";
		}
		return resultado;
		
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public int getLado4() {
		return lado4;
	}
	
	
}


