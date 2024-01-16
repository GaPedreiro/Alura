import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = read.nextLine(); // O nextLine(), diferente do next(). Lê a linha inteira que for passada para ele, o next() lê somente um caracter.
        System.out.println("Digite o ano de lançamento do filme " + filme + ":");
        int anoDeLancamento = read.nextInt();
        System.out.println("Digite uma nota para o filme: ");
        double avaliacao = read.nextDouble();
        System.out.println("- Nome do filme: " + filme +
                "\nAno de lançamento: " + anoDeLancamento +
                "\nNota: " + avaliacao);
    }
}
