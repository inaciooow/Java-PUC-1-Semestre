package com.aed.puc.lista4;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		/*Faça um programa para apurar uma eleição onde concorrem (João=1,
		Maria=2, Nulo=3). Para esta eleição, considere 8 eleitores.
		Ao término mostre:
		1. O número de votos do candidato João e os da Maria;
		2. O número de votos nulos;
		3. O candidato vencedor;
		4. A porcentagem de votos nulos no total de votos da eleição;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int voto, i, cv1, cv2, cv3;
		i = 0;
		cv1 = 0;
		cv2 = 0;
		cv3 = 0;
		 
		while (i<8) {
			do {
				
				System.out.println("Qual seu voto?\nJoão - 1\nMaria - 2\nNulo - 3");
				voto = entrada.nextInt();
				
				if (voto==1) {
					cv1 = cv1 + 1;
					} else if (voto==2) {
						cv2 = cv2 + 1;
						} else if (voto==3) {
							cv3 = cv3 + 1;
							} else {
								System.out.println("Opção incorreta! Digite novamente!");
								}
				} while((voto<1) || (voto>3));
			i++;
		}
		
		System.out.println("Total dos Votos de João = " +cv1); 
		System.out.println("Total dos Votos de Maria = " +cv2);
		System.out.println("Total dos Votos Nulos = " +cv3);
		System.out.println("Porcentagem dos Votos Nulos desta votação = " + ((cv3*100)/(8)) +"%" );
		 
		if (cv1>cv2) {
			System.out.println("O vencedor da votação foi João");
			} else if (cv2>cv1) {
				System.out.println("O vencedor da votação foi Maria");
				} else if (cv1 == cv2) {
					System.out.println("A eleição ficou empatada");
					} else {
						System.out.println("Todos votaram nulo, não houve vencedor!");
						}
		
		entrada.close();
	}

}