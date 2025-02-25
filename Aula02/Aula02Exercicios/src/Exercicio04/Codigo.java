package Exercicio04;

import java.util.Scanner;
import java.util.Locale;  // Importando para garantir que o separador decimal seja o ponto

public class Codigo implements TAD04 {
    private int[][] tabelaNotas;

    public Codigo() {
        // Inicializando a matriz das notas e dos alunos
        tabelaNotas = new int[QUANT_ALUNOS][QUANT_NOTAS];
        gerarTabelas();
    }

    // Método que gera a tabela de notas para os alunos
    private void gerarTabelas() {
        Scanner leituraDasNotas = new Scanner(System.in);

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");

            for (int j = 0; j < QUANT_NOTAS; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                tabelaNotas[i][j] = leituraDasNotas.nextInt();
            }
        }
    }

    // Método que calcula a média de cada disciplina
    public void calcularEMostrarMedias() {
        // Definir o Locale para garantir que usamos o ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Calculando e exibindo a média de cada disciplina
        for (int j = 0; j < QUANT_NOTAS; j++) {
            int somatorio = 0;

            // Somando as notas de todos os alunos para a disciplina j
            for (int i = 0; i < QUANT_ALUNOS; i++) {
                somatorio += tabelaNotas[i][j];
            }

            // Calculando a média
            double media = somatorio / (double) QUANT_ALUNOS;
            /*
             * Antes, a operação somatorio / QUANT_ALUNOS estava sendo feita com inteiros. Isso poderia gerar um 
             * valor incorreto na média. Agora, a divisão é feita com double (somatorio / (double) QUANT_ALUNOS), 
             * garantindo a precisão correta.
             */

            // Formatando a média para exibir apenas 2 casas decimais
            System.out.println("Média da disciplina " + (j + 1) + ": " + String.format("%.2f", media));
        }
    }
}
