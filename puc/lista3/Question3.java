package com.aed.puc.lista3;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição WHILE, implemente um
		programa em Java que calcule e escreva a seguinte soma:
		soma = (1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50)
		*/
		
		Scanner entrada = new Scanner (System.in);
		int i, j;
		float soma;
		i=1;
		j=1;
		soma=0;
		
		while (i<=50) {
			System.out.print("("+j+"/"+i+") + ");
			j = j + 2;
			i = i + 1; 
			soma = soma + (j/i);
		}
		
		System.out.println("\nSoma = " + soma);
		
		entrada.close();
		
	}

}