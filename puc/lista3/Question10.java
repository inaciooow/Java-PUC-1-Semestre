package com.aed.puc.lista3;
import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		/*Faça um programa que leia os 5 resultados do lançamento sucessivos
		de uma moeda, onde temos para cada resultado (Cara=1 / Coroa=2).
		Ao final da leitura dos resultados dos lançamentos, mostre a
		ocorrência do número de Caras e o número de Coroas e informe qual
		dos dois resultados foi o que teve o maior número de ocorrências.
		*/
		
		Scanner entrada = new Scanner (System.in);
		int resultado, i, contcara, contcoroa;
		i=0;
		contcara=0;
		contcoroa=0;
		
		while (i<5) {
			
			do {
				System.out.println("Qual lado da moeda caiu? \n1- Cara \n2- Coroa");
				resultado = entrada.nextInt();
				
				if (resultado==1) {
					contcara = contcara + 1;
				} else if (resultado==2) {
					contcoroa = contcoroa + 1;
					} else {
						System.out.println("Opção incorreta! Digite novamente!");
						}
				} while((resultado<1) || (resultado>2));
			
			i = i + 1;
			}
		
		System.out.println("Resultado total de Caras = " +contcara); 
		System.out.println("Resultado total de Coroas = " +contcoroa);
		
		if (contcara>contcoroa) {
			System.out.println("O lado da moeda com mais ocorrências foi: Cara");
		} else {
			System.out.println("O lado da moeda com mais ocorrências foi: Coroa");
			}
		
		entrada.close();

	}

}