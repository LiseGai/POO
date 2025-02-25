import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpComEntrada {
    public static void main(String[] args) {
        // Criando o JFrame principal
        JFrame frame = new JFrame("Entrada de Dados");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando os campos para entrada dos dados
        JTextField campoNome = new JTextField(10);
        JTextField campoIdade = new JTextField(10);

        // Labels
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelIdade = new JLabel("Idade:");

        // Botão para adicionar os dados à tabela
        JButton botaoAdicionar = new JButton("Adicionar");

        // Criando um painel para colocar os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));  // Layout com 3 linhas e 2 colunas
        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelIdade);
        painel.add(campoIdade);
        painel.add(botaoAdicionar);

        // Adicionando o painel ao frame principal
        frame.add(painel);
        frame.setVisible(true);

        // Tabela para exibir os dados
        String[] colunas = {"Nome", "Idade"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunas);
        JTable tabela = new JTable(modeloTabela);

        // Criando uma janela pop-up para exibir a tabela
        JFrame tabelaFrame = new JFrame("Tabela de Dados");
        tabelaFrame.setSize(400, 300);
        JScrollPane scrollPane = new JScrollPane(tabela);
        tabelaFrame.add(scrollPane);

        // Ação ao clicar no botão
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pegando os dados do usuário
                String nome = campoNome.getText();
                String idade = campoIdade.getText();

                // Verificar se os campos não estão vazios
                if (!nome.isEmpty() && !idade.isEmpty()) {
                    // Adiciona uma nova linha na tabela
                    modeloTabela.addRow(new Object[]{nome, idade});
                    campoNome.setText("");  // Limpa o campo nome
                    campoIdade.setText(""); // Limpa o campo idade

                    // Mostra a tabela na janela pop-up
                    tabelaFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos!");
                }
            }
        });
    }
}
