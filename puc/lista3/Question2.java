package com.aed.puc.lista3;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição WHILE, implemente um
		programa em Java para ler o peso e o gênero (masculino=1 /
		feminino=2) de um grupo de 5 pessoas e ao término mostre:
			- o número de homens e o número de mulheres do grupo;
			- a média dos pesos do grupo;
			- indicar o gênero que teve a maior ocorrência (homens ou mulheres);
		*/
		
		Scanner entrada = new Scanner (System.in);
		int gen, i, cm, cf;
		float peso, somapeso;
		i = 0;
		cm = 0;
		cf = 0;
		somapeso = 0;
		
		while (i<5) {
			 do {
				 System.out.println("Qual seu gênero?\nMasculino -1\nFeminino - 2");
				 gen = entrada.nextInt();

				 if (gen==1) {
					 cm = cm + 1;
				 } else if (gen==2) {
					 cf = cf + 1;
				 	} else {
				 		System.out.println("Opção incorreta! Digite novamente!");
				 	}
				 } while((gen<1) || (gen>2));
			 System.out.println("Qual o seu peso?");
			 peso = entrada.nextFloat();
			 somapeso = somapeso + peso;
			 i = i + 1;
			 }
		
		System.out.println("Total de Homens = " +cm); 
		System.out.println("Total de Mulheres = " +cf);
		System.out.println("A média de pesos foi = " +(somapeso/5));
		
		if (cm>cf) {
			System.out.println("O gênero com mais ocorrências foi: Masculino");
		} else {
			System.out.println("O gênero com mais ocorrências foi: Feminino");
			}
		
		entrada.close();
	
	}

}