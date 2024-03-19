package br.com.alura.screenmatch.Service;

import br.com.alura.screenmatch.Model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper(); // Isso aqui substitui o papel do GSON.


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        /*
        Aqui chamamos o mapper, que é o objeto do Mapper que faz a conversão e vamos passar o mapper.readValue pra
        ele ler o json e tentar transformar na classe que foi passada pra ele, o funcionamento é parecido
        com o do GSON.
         */
    }
}
