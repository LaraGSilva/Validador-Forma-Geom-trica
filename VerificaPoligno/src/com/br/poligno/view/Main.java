package com.br.poligno.view;

import javax.swing.JOptionPane;

import com.br.poligno.model.Poligono;

public class Main {

	public static void main(String[] args) {
		
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado 1:"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado 2:"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado 3:"));
		int lado4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado 4:"));
		
		Poligono poli = new Poligono(lado1, lado2, lado3, lado4);
		String resulatdo = poli.verificaPoligno();
		
		JOptionPane.showMessageDialog(null, resulatdo);

	}

}
