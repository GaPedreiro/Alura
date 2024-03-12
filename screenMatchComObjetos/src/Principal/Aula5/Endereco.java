package Principal.Aula5;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "\nDados do endereço." +
                "\nCEP: " + cep +
                "\nLogradouro: " + logradouro +
                "\nComplemento: " + complemento +
                "\nBairro: " + bairro +
                "\nLocalidade: " + localidade +
                "\nUF: " + uf;
    }
}
