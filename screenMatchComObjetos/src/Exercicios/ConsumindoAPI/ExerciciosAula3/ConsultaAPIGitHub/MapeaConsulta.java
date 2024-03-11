package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

public record MapeaConsulta(String login, String id, String avatar_url) {

    @Override
    public String toString() {
        return "Login: " + login +
                "\nId: " + id +
                "\nImagem: " + avatar_url ;
    }
}
