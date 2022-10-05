package com.aed.puc.lista4;

public class Question3 {

	public static void main(String[] args) {
		/*Um país A possui uma população de 80.000.000 habitantes e cresce a
		uma taxa de 1,5% ao ano. Já o país B possui 65.000.000 habitantes e
		cresce a uma taxa de 3% ao ano.
		Pergunta-se: mantidas constantes estas taxas de crescimento,
		quantos anos serão necessários para que o país B ultrapasse ou se
		iguale ao país A?
		*/
		
		double paisA, paisB, taxaA, taxaB;
		paisA = 80000000;
		paisB = 65000000;
		taxaA = 0.015; //1,5%
		taxaB = 0.030; //3,0%
		int contAno = 0;
		
		while(paisB<=paisA) {
			paisA = (paisA * taxaA)+paisA;
			paisB = (paisB * taxaB)+paisB;
			contAno = contAno + 1; 
		}
		
		System.out.printf("Pais B: %.0f habitantes",paisB);
		System.out.printf("\nPais A: %.0f habitantes",paisA);
		System.out.printf("\nSe passaram: %d anos",contAno);

	}

}