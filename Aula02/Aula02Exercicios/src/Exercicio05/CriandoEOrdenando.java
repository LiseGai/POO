package Exercicio05;

import java.util.Scanner;

public class CriandoEOrdenando implements TAD05 {
    private int vetorCriado[];

    public CriandoEOrdenando() {
        // Inicializa o vetor com o tamanho especificado
        vetorCriado = new int[TAMANHO_VETOR];
        gerandoVetor();
    }

    private void gerandoVetor() {
        // Lê os valores do vetor
        Scanner lendoValores = new Scanner(System.in);
        System.out.println("Digite " + TAMANHO_VETOR + " números inteiros:");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorCriado[i] = lendoValores.nextInt();
        }
        
        // Garantindo que o vetor foi criado corretamente
        System.out.println("Vetor Criado:");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print(vetorCriado[i] + "\t");
        }
        System.out.println(); // Quebra de linha após a impressão do vetor
    }

    public void ordenandoVetor() {
        int aux;
        // Bubble Sort: Ordenação do vetor
        for (int i = 0; i < TAMANHO_VETOR - 1; i++) {
            for (int j = 0; j < TAMANHO_VETOR - 1 - i; j++) {
                if (vetorCriado[j] > vetorCriado[j + 1]) {
                    // Troca de elementos
                    aux = vetorCriado[j];
                    vetorCriado[j] = vetorCriado[j + 1];
                    vetorCriado[j + 1] = aux;
                }
            }
        }

        // Imprimindo o vetor ordenado
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print(vetorCriado[i] + "\t");
        }
        System.out.println(); // Quebra de linha após a impressão do vetor
    }
}
