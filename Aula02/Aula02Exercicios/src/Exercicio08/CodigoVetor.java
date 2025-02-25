package Exercicio08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CodigoVetor implements TAD08 {
    private int[] vetorNumeros;
    private int[] vetorPares;
    private int[] vetorImpares;
    private int quantidadePares = 0;
    private int quantidadeImpares = 0;

    public CodigoVetor() {
        vetorNumeros = new int[TAMANHO_PAREIMPAR];
        gerandoVetor();
    }

    private void gerandoVetor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros[i] = scanner.nextInt();
        }
        
        parOuImpar();
    }

    private void parOuImpar() {
        for (int num : vetorNumeros) {
            if (num % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        vetorPares = new int[quantidadePares];
        vetorImpares = new int[quantidadeImpares];

        int indicePar = 0, indiceImpar = 0;

        for (int num : vetorNumeros) {
            if (num % 2 == 0) {
                vetorPares[indicePar++] = num;
            } else {
                vetorImpares[indiceImpar++] = num;
            }
        }
    }

    public void imprimindoVetor() {
        while (true) {
            String[] opcoes = { "Mostrar vetor par", "Mostrar vetor ímpar", "Sair" };
            int escolha = JOptionPane.showOptionDialog( //O showOptionalDialog da as mensagens
                    null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Vetor Par: " + arrayToString(vetorPares));
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Vetor Ímpar: " + arrayToString(vetorImpares));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return;
                default:
                    break;
            }
        }
    }
    
    //Como o JOptionalPane so exibe strings, é necessario converter os inteiros em strings 

    private String arrayToString(int[] vetor) {
    	//Validaçoes:
        if (vetor.length == 0) return "Nenhum número encontrado.";
        StringBuilder sb = new StringBuilder(); //Como se fosse uma string, mas pode ser manipulavel  
        for (int num : vetor) {
            sb.append(num).append(" "); // Adiciona os numeros ao stringbuilder com um espaço entre eles
        }
        return sb.toString().trim(); //Trim remove os espaços vazios
    }
}

