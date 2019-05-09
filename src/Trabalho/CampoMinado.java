package Trabalho;

import javax.swing.JOptionPane;

public class CampoMinado {

    static String tabuleiro[][] = new String[20][20];

    public static void main(String[] args) {

        int linhajogador;
        int colunajogador;
        int linhaAleatoria;
        int colunaAleatoria;
        int contador = 0;
        int pontos = 0;

        linhaAleatoria = (int) (Math.random() * 5);
        colunaAleatoria = (int) (Math.random() * 5);

        JOptionPane.showMessageDialog(null, "Batalha Naval\nBoa Sorte\nLegenda\n(&)Navio\n(+)Ponto Para Você");
        System.out.println(linhaAleatoria + " " + colunaAleatoria);

        for (int linha = 0; linha < 20; linha++) {
            for (int coluna = 0; coluna < 20; coluna++) {
                tabuleiro[linha][coluna] = "  *  ";

            }
        }

        while (contador < 25) {
            do {
                linhajogador = Integer.parseInt(JOptionPane.showInputDialog(mostrar() + "\nDigite uma linha:"));
                colunajogador = Integer.parseInt(JOptionPane.showInputDialog(mostrar() + "\nDigite uma coluna"));
            } while (linhajogador > 20 || colunajogador > 18);
            if ((linhajogador == linhaAleatoria) && (colunajogador == colunaAleatoria)) {
                tabuleiro[linhaAleatoria][colunaAleatoria] = "&";

                JOptionPane.showMessageDialog(null, mostrar() + "\n Você Perdeu");
                break;
            } else {
                pontos++;
                tabuleiro[linhajogador][colunajogador] = " + ";
                JOptionPane.showMessageDialog(null, mostrar() + "\n Ponto: " + pontos);
            }
            if (linhajogador > 20 || colunajogador > 18) {
                JOptionPane.showMessageDialog(null, "\n O numero não corresponde a matriz");
            }
            contador++;
            if (pontos == 24) {
                JOptionPane.showMessageDialog(null, "\n Você venceu\nParabéns");
            }

        }

    }

    public static String mostrar() {
        String tela = "";
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            tela += "\n";
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                tela += tabuleiro[linha][coluna];
            }
        }
        return tela;
    }

}
