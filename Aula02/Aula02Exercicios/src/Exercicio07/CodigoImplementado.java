package Exercicio07;

import java.util.Scanner;

public class CodigoImplementado implements TAD07 {
	// Matriz [Aluno][Disciplina]
	private float matrizAlunoNotas[][];

	// Construtor
	public CodigoImplementado() {
		matrizAlunoNotas = new float[TAMANHO_ALUNOS][TAMANHO_NOTAS];
		gerarMatriz();
	}

	private void gerarMatriz() {
		Scanner notasDigitadas = new Scanner(System.in);

		// Preenchendo a matriz com notas
		for (int i = 0; i < TAMANHO_ALUNOS; i++) {
			System.out.println("Digite as notas do aluno " + (i + 1) + ": ");
			for (int j = 0; j < TAMANHO_NOTAS; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				matrizAlunoNotas[i][j] = notasDigitadas.nextFloat();
			}
		}

		// Não fechar o Scanner aqui para evitar erros de entrada
	}

	public void calcularNotasPorDisciplina() {
		// Percorrer cada disciplina (colunas)
		for (int j = 0; j < TAMANHO_NOTAS; j++) {
			float notaMaisAlta = matrizAlunoNotas[0][j];
			float notaMaisBaixa = matrizAlunoNotas[0][j];

			// Percorrer cada aluno (linhas)
			for (int i = 1; i < TAMANHO_ALUNOS; i++) {
				if (matrizAlunoNotas[i][j] > notaMaisAlta) {
					notaMaisAlta = matrizAlunoNotas[i][j];
				}
				if (matrizAlunoNotas[i][j] < notaMaisBaixa) {
					notaMaisBaixa = matrizAlunoNotas[i][j];
				}
			}

			System.out.println("Disciplina " + (j + 1) + ":");
			System.out.println(" - Nota mais alta: " + notaMaisAlta);
			System.out.println(" - Nota mais baixa: " + notaMaisBaixa);
		}
	}

	// Getters (caso precise acessar externamente)
	public float[][] getMatrizAlunoNotas() {
		return matrizAlunoNotas;
	}
}


