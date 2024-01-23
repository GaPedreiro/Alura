package br.com.alura.minhasmusicas.Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" +
                    " e geral curte.");
        } else {
            System.out.println(audio.getTitulo() + " merece uma chance.");
        }
    }
}
