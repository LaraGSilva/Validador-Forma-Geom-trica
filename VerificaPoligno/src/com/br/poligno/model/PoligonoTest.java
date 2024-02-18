package com.br.poligno.model;
import org.junit.Assert;
import org.junit.Test;

public class PoligonoTest {

	@Test
	public void verificaPoligonoQuadrado() {
		int lado1 = 1;
		int lado2 = 1;
		int lado3 = 1;
		int lado4 = 1;
		
		Poligono poli = new Poligono(lado1, lado2, lado3, lado4);
		String resultado = poli.verificaPoligno();
		Assert.assertEquals("Quadrado", resultado);
		
	}

	
	@Test
	public void verificaPoligonoTriangulo() {
		int lado1 = 1;
		int lado2 = 1;
		int lado3 = 1;
		int lado4 = 0;
		
		Poligono poli = new Poligono(lado1, lado2, lado3, lado4);
		String resultado = poli.verificaPoligno();
		Assert.assertEquals("Triangulo", resultado);
		
	}
	
	
	@Test
	public void verificaPoligonoTrapezio() {
		int lado1 = 1;
		int lado2 = 1;
		int lado3 = 12;
		int lado4 = 3;
		
		Poligono poli = new Poligono(lado1, lado2, lado3, lado4);
		String resultado = poli.verificaPoligno();
		Assert.assertEquals("Trapezio", resultado);
		
	}
	
	
	@Test
	public void verificaPoligonoOutro() {
		int lado1 = 1;
		int lado2 = 2;
		int lado3 = 3;
		int lado4 = 4;
		
		Poligono poli = new Poligono(lado1, lado2, lado3, lado4);
		String resultado = poli.verificaPoligno();
		Assert.assertEquals("Outro poligono", resultado);
		
	}
}
