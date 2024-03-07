package Exercicios.ConsumindoAPI.ExerciciosAula3.ValidacaoDeSenha;

import java.util.Scanner;

/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a
exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não
atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
 */

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Digite uma senha com pelo menos 8 caracteres: ");
            Senha senha = new Senha(read.next());
            System.out.println("Senha gravada com sucesso!");
        } catch (RequisitoSenhaException e) {
            System.out.println(e.mensagem);
            System.out.println("\nÉ necessário criar uma nova senha.");
        }
    }
}
