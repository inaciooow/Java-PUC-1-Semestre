package com.aed.puc.lista2;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		/*Faça um programa que permita calcular qualquer uma das áreas escolhidas abaixo:
			- área do quadrado;
			- área do retângulo;
			- área do cubo;
			- área do triangulo retângulo;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int escolha;
		float dig1, dig2, resultado;
		
		System.out.print("Escolha o que deseja calcular: \n1- Área do quadrado \n2- Área do retângulo \n3- Área do cubo \n4- Área do triângulo retângulo \nInsira aqui : ");
		escolha = entrada.nextInt();
		
		switch(escolha) {
		case 1:
		System.out.print("Insira o lado do quadrado: ");
		dig1 = entrada.nextFloat();
		resultado = dig1 * dig1;
		System.out.print("A área do quadrado é: " + resultado);
		break;
		
		case 2:
		System.out.print("Insira o valor da base do retângulo: ");
		dig1 = entrada.nextFloat();
		System.out.print("Insira o valor da altura do retângulo: ");
		dig2 = entrada.nextFloat();
		resultado = dig1 * dig2;
		System.out.print("A área do retângulo é: " + resultado);
		break;
		
		case 3:
		System.out.print("Insira o lado do cubo: ");
		dig1 = entrada.nextFloat();
		resultado = dig1 * dig1 * dig1;
		System.out.print("A área do cubo é: " + resultado);
		break;
		
		case 4:
		System.out.print("Insira o valorr da base do triângulo retângulo: ");
		dig1 = entrada.nextFloat();
		System.out.print("Insira o valor da altura do triângulo retângulo: ");
		dig2 = entrada.nextFloat();
		resultado = (dig1 * dig2) / 2;
		System.out.print("A área do triângulo retângulo é: " + resultado);
		break;
		default:
			
		System.out.print("Opção Inválida!");
		break;
		}
		
		entrada.close();
		
	}

}