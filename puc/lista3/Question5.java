package com.aed.puc.lista3;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		/*Utilizando uma estrutura de repetição, implemente um programa em
        Java para ler uma sequência de 5 números inteiros positivos e verificar
        se cada um deles é divisível por 3, escrevendo mensagem adequada.
        */
		
		Scanner entrada = new Scanner (System.in);
		int n, i;
		i=0;
		
		while (i<5) {
			i = i +1;
			System.out.println("Digite um número: ");
			n = entrada.nextInt();
			
			if (n % 3 == 0) {
				System.out.println("É divisível por 3");
			} else {
				System.out.println("Não é divisível por 3");
			}
		 }
		
		entrada.close();
	}

}