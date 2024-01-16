import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota para o filme ou '-1' para encerrar o loop: ");
            nota = read.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + media / totalDeNotas);
    }
}
