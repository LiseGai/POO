import javax.swing.*;
import java.awt.*;

public class ManipulandoCores {
    public static void main(String[] args) {
        // Criando uma cor a partir de HSB (matiz, saturação, brilho)
        float matiz = 0.5f;  // Valor da matiz (0 a 1)
        float saturacao = 0.8f;  // Saturação (0 a 1)
        float brilho = 0.8f;  // Brilho (0 a 1)

        // Convertendo HSB para RGB
        int corRGB = Color.HSBtoRGB(matiz, saturacao, brilho);
        Color cor = new Color(corRGB);

        // Exibindo a cor criada no console
        System.out.println("Cor criada com HSB: " + cor);

        // Criando uma janela com o quadrado colorido
        JFrame janela = new JFrame("Quadrado com cor HSB");
        JPanel painel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                // Definindo a cor do quadrado
                g.setColor(cor);
                g.fillRect(50, 50, 200, 200);  // Desenha um quadrado com a cor criada
            }
        };

        janela.add(painel);
        janela.setSize(300, 300);  // Tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);  // Exibe a janela
    }
}
