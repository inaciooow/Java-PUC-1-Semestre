package com.aed.puc.lista5;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição FOR, faça um programa que
		leia uma série de 10 números e ao término informe a quantidade
		de números pares e a quantidade de números impares desta série.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int num, cnumpar=0, cnumimpar=0;
		
		for (int i=0; i<10; i++) {
			System.out.print("Insira um número: ");
			num = entrada.nextInt();
			
			if (num %2 == 0) {
				cnumpar++;
				} else {
					cnumimpar++;
					}
		}
		
		System.out.print("Nessa série teve um total de "+cnumpar +" números pares e um total de "+cnumimpar +" números ímpares");
		
		entrada.close();
	}

}