package com.aed.puc.lista1;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar a distancia percorrida por um móvel. Obs: D = V x T.

		Scanner entrada = new Scanner (System.in);
		int X, Y, resultado;
		
		System.out.print ("Digite a velocidade do móvel (Km/h): ");
		X = entrada.nextInt();
		
		System.out.print ("Digite o tempo gasto da viagem (Horas): ");
		Y = entrada.nextInt();
		
		resultado = X * Y;
		
		System.out.println("A distância percorrida é: " + resultado + "Km");
		
		entrada.close();
		
	}

}