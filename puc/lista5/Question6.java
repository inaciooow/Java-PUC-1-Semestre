package com.aed.puc.lista5;

public class Question6 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição FOR, faça um programa para
		calcular a soma abaixo:
		S = ( 1! + 2! + 3! + 4! + ............ + 8! )
		*/
		
		int acumulador=1, soma=0;
		
		for (int i=1; i<=8; i++) {
			for (int x=i; x>1; x--) {
				acumulador = acumulador * x;
			}
			soma = soma + acumulador;
			acumulador = 1;
		}
		
		System.out.print(soma);

	}

}