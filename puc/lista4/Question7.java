package com.aed.puc.lista4;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		/*Faça um programa para ler a idade, o gênero (masc=1/fem=2) e o peso de 5 pessoas.
		Após as leituras dos dados mostre:
		1. O número de homens e o número de mulheres;
		2. A média dos pesos dos homens;
		3. A média das idades das mulheres;
		4. A média do peso e das idades do grupo;
		*/
		
		Scanner entrada = new Scanner (System.in);
		float gen, i, cm, cf, idade, cidade, cidadem;
		float peso, somapeso, somapesoh, somapesof;
		 
		i = 0;
		cm = 0;
		cf = 0;
		somapesoh = 0;
		somapesof = 0;
		somapeso = 0;
		cidade = 0;
		cidadem = 0;
		
		while (i<5) {
			do {
				
				System.out.println("Qual a sua idade?");
				idade = entrada.nextFloat();
				cidade = cidade + idade;
				
				System.out.println("Qual o seu peso?");
				peso = entrada.nextFloat();
				somapeso = somapeso + peso;
				
				System.out.println("Qual seu gênero?\nMasculino - 1\nFeminino - 2");
				gen = entrada.nextFloat();
				
				if (gen==1) {
					cm = cm + 1;
					somapesoh = somapesoh + peso;
					cidadem = cidadem + idade;
					} else if (gen==2) {
						cf = cf + 1;
						somapesof = somapesof + peso;
						} else {
							System.out.println("Opção incorreta! Digite novamente!");
							}
				} while((gen<1) || (gen>2));
			i++;
		 }
		
		System.out.println("Total de Homens = " +cm); 
		System.out.println("Total de Mulheres = " +cf);
		System.out.println("A média de pesos dos Homens foi = " + (somapesoh/5));
		System.out.println("A média das idades das mulheres foi = " + (cidadem/5));
		System.out.println("A média de pesos foi = " +(somapeso/5));
		System.out.println("A média das idades foi = " +(cidade/5));
		
		entrada.close();
		
	}

}