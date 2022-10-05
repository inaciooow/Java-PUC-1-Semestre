package com.aed.puc.lista3;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição DO-WHILE, implemente um
		programa em Java que calcule e escreva a seguinte soma:
		soma = (1/1 + 1/2 + 1/3 + 1/4 + ... + 1/40)
		*/
		
		Scanner entrada = new Scanner (System.in);
		double i=1, j=0;
		double soma=0;
		
		do {
			i = 1;
			j = j + 1;
			soma = soma + (i/j);
			System.out.print("("+i+"/"+j+") + ");
		}while (j<=39);
		System.out.println("\nSoma = " + soma);
		
		entrada.close();

	}

}