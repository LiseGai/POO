import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpDelay {
    public static void main(String[] args) {
        // Opções para o usuário escolher
        Object[] opcoes = {"Sim", "Não", "Talvez"};
        int resposta = JOptionPane.showOptionDialog(
            null, 
            "Escolha uma opção", 
            "Pop-up com opções", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opcoes, 
            opcoes[0]
        );

        // Verifica a escolha do usuário
        if (resposta == 2) { // Se escolher "Talvez"
            // Criação da janela sem botão, apenas com uma mensagem
            JFrame janela = new JFrame("Mensagem");
            janela.setSize(300, 150);  // Tamanho da janela
            janela.setLocationRelativeTo(null);  // Centraliza na tela
            janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  // Não fechar automaticamente

            // Adiciona um painel com a mensagem
            JPanel painel = new JPanel();
            JLabel label = new JLabel("Por via das dúvidas, vamos mostrar como seria...");
            painel.add(label);
            janela.add(painel);

            janela.setVisible(true);  // Exibe a janela

            // Timer para fechar a janela após 5 segundos
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    janela.dispose();  // Fecha a janela após 5 segundos
                }
            });

            timer.setRepeats(false);  // Não repetir
            timer.start();  // Inicia o timer
        } else {
            // Exibe mensagem se o usuário escolheu "Sim" ou "Não"
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: " + opcoes[resposta]);
        }
    }
}
