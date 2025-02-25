package Exercicio02;

public class Tabela implements TAD02 {
    private int[][] tabelaMultiplicacao;

    public Tabela() {
        // Inicializa a matriz de 10x10
        tabelaMultiplicacao = new int[TAMANHO_TABELA][TAMANHO_TABELA];
        gerarTabela();
    }

    // Método que gera a tabela de multiplicação 10x10
    private void gerarTabela() {
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            for (int j = 0; j < TAMANHO_TABELA; j++) {
                tabelaMultiplicacao[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    // Método para exibir a tabela na tela com índices
    public void exibirTabela() {
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            for (int j = 0; j < TAMANHO_TABELA; j++) {
                System.out.print(String.format("%4d", tabelaMultiplicacao[i][j])); // Valor da multiplicação
            }
            System.out.println();
        }
    }
}

