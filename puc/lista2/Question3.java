package com.aed.puc.lista2;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		/*Faça um programa que calcule a idade em anos de qualquer
		pessoa e após ter calculado mostre a idade e uma das mensagens abaixo:
			- se idade <= 10 anos, diga “Criança”;
			- se idade > 10 e <= 17 anos, diga “Adolescente”;
			- se idade >= 18 anos, diga “Adulto”;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int anoNasc, anoAtual, resultado;
		 
		System.out.print("Digite o ano do seu nascimento: ");
		anoNasc = entrada.nextInt();
		 
		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();
		 
		resultado = anoAtual - anoNasc;
		
		if (resultado <= 10)
			System.out.printf("Criança");
			 
		if ((resultado >10)&&(resultado <=17))
			System.out.printf("Adolescente");
			 
		if (resultado >=18)
			System.out.printf("Adulto");
		
		entrada.close();

	}

}