package br.com.alura.screenmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

        /*
            O <T> T é uma coisa genérica, se chama Generics, ele vai retorar alguma coisa, mas
            ainda não sei o que, é algum tipo que vai ser genérico, mas ainda assim precisamos
            dizer o tipo de retorno que queremos. Não passamos no início do cabeçalho do método o
            tipo que queremos, então ema lgum lugar vamos ter que dizer qual é o tipo que nós esperamos.
            Então basicamente nós vamos receber um json que é uma string de alguma classe, e no conversor
            de dados vamos tentar converte esse json na classe que foi indicada.

            Em Java, generics permitem criar classes, interfaces e métodos que podem trabalhar com tipos
            desconhecidos ou parâmetros genéricos. Eles fornecem uma forma de escrever código flexível e
            reutilizável, tornando-o independente de tipos específicos e permitindo que ele funcione com
            diferentes tipos de dados.
         */
}
