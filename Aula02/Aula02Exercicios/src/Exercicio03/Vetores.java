package Exercicio03;

import java.util.Scanner;

public class Vetores implements TAD03 {
	private float[] vetorNotas;
	public Vetores() {
		// TODO Auto-generated constructor stub
		vetorNotas = new float[TAMANHO_VETOR];
		gerarVetor();
	}
	private void gerarVetor() {
		// TODO Auto-generated method stub
		System.out.println("Digite as notas: ");
		Scanner notasLidas = new Scanner(System.in);
		for (int i=0;i<5;i++) {
			vetorNotas[i]=notasLidas.nextFloat();
		}	
	}
	public void exibirVetor() {
		System.out.print("Notas: ");
		for (int i=0; i<TAMANHO_VETOR;i++) {
			System.out.print(vetorNotas[i]+"\t");
		}
	}

}
