package com.aed.puc.lista1;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar a velocidade de um móvel. Obs: V = D / T.
		
		Scanner entrada = new Scanner (System.in);
		int X, Y, resultado;
		
		System.out.print ("Digite a distância percorrida (Km): ");
		X = entrada.nextInt();
		
		System.out.print ("Digite o tempo da viagem (Hora): ");
		Y = entrada.nextInt();
		 
		resultado = X / Y;
		
		System.out.println("O velocidade média foi: " + resultado + "Km/h");
		
		entrada.close();
	}

}