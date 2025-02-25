package Exercicio06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CodigoCidadesHabitantes implements TAD06 {
    private int numeroHabitantes[];
    private String cidades[];

    public CodigoCidadesHabitantes() {
        numeroHabitantes = new int[TAMANHO_CIDADES];
        cidades = new String[TAMANHO_CIDADES];
        gerandoVetor();
    }

    private void gerandoVetor() {
        JFrame frame = new JFrame("Entrada de Dados");
        frame.setSize(300, 200);

        DefaultTableModel modeloTabela = new DefaultTableModel(new String[]{"Cidade", "Habitantes"}, 0);
        JTable tabela = new JTable(modeloTabela);
        JFrame tabelaFrame = new JFrame("Tabela de Cidades");
        tabelaFrame.setSize(400, 300);
        JScrollPane scrollPane = new JScrollPane(tabela);
        tabelaFrame.add(scrollPane);

        for (int i = 0; i < TAMANHO_CIDADES; i++) {
            cidades[i] = JOptionPane.showInputDialog(frame, "Escreva o nome da cidade " + (i + 1) + " :");

            while (true) {
                try {
                    String habitantesStr = JOptionPane.showInputDialog(frame, "Escreva o número de habitantes da cidade " + (i + 1) + " :");
                    numeroHabitantes[i] = Integer.parseInt(habitantesStr);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido de habitantes.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

            modeloTabela.addRow(new Object[]{cidades[i], numeroHabitantes[i]});
        }

        tabelaFrame.setVisible(true);
    } 

    public void cidadeMaisPopulosa() {
        for (int i = 0; i < TAMANHO_CIDADES - 1; i++) {
            for (int j = 0; j < TAMANHO_CIDADES - 1 - i; j++) {
                if (numeroHabitantes[j] < numeroHabitantes[j + 1]) { // Ordenação decrescente
                    // Troca no vetor de habitantes
                    int tempHabitantes = numeroHabitantes[j];
                    numeroHabitantes[j] = numeroHabitantes[j + 1];
                    numeroHabitantes[j + 1] = tempHabitantes;

                    // Troca no vetor de cidades
                    String tempCidade = cidades[j];
                    cidades[j] = cidades[j + 1];
                    cidades[j + 1] = tempCidade;
                }
            }
        }

        // Exibindo a cidade mais populosa
        System.out.println("Cidade mais populosa: " + cidades[0] + " com " + numeroHabitantes[0] + " habitantes.");
    }
}


