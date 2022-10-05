package com.aed.puc.lista5;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição FOR, faça um programa que
		leia um número inteiro qualquer e após a leitura, mostre os 20
		primeiros múltiplos deste número.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int x, multiplo;
		
		System.out.print("Insira um número para saber os 20 primeiros múltiplos dele: ");
		x = entrada.nextInt();
		
		for (int i=0; i<=20; i++) {
			multiplo = x * i;
			System.out.printf("%d, ",multiplo);	
		}
		
		entrada.close();
		
	}

}