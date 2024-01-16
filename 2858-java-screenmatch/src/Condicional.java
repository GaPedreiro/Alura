public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1980;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDoPlano= "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo.");
        } else {
            System.out.println("Filme retrô que vale a pena assistir.");
        }

        if (incluidoNoPlano == true && tipoDoPlano.equals("plus")) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Necessário assinatura ou aluguel de filme!");
        }
    }
}
