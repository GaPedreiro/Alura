import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        int numeroDeVidas = 7;
        int numeroEscolhido = new Random().nextInt(100);

        System.out.println("Usuário, seu objetivo é adivinhar o número em que estou pensando. Você tem 7 tentativas.");
        while (numeroDeVidas != 0) {
            System.out.println("Digite um número: ");
            int respostaUsuario = read.nextInt();

            if (respostaUsuario < numeroEscolhido) {
                System.out.println("- Dica: Meu número é maior que isso!");
                numeroDeVidas--;
                System.out.println("Suas vidas: " + numeroDeVidas);
            } else if (respostaUsuario > numeroEscolhido) {
                System.out.println("- Dica: Meu número é menor que isso!");
                numeroDeVidas--;
                System.out.println("Suas vidas: " + numeroDeVidas);
            } else  if (respostaUsuario == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou!" +
                        "\n Ainda restaram: " + numeroDeVidas + " vidas.");
                break;
            }
        }
        if (numeroDeVidas == 0) {
            System.out.println("Sinto muito, suas vidas acabaram!");
            System.out.println("O resultado era: " + numeroEscolhido);
        }
    }
}
