import javax.swing.*;
import java.awt.*;

public class CorSwingExemplo {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de Cores");
        JButton botao = new JButton("Clique aqui");

        // Definindo a cor de fundo do botão
        botao.setBackground(Color.CYAN);
        
        // Definindo a cor do texto do botão
        botao.setForeground(Color.WHITE);

        janela.setLayout(new FlowLayout());
        janela.add(botao);

        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
