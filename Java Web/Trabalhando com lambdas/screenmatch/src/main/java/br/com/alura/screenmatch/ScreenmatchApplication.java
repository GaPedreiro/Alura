package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { // CommandoLineRunner é uma interface que permite criar dentro do método principal algumas chamadas.

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();

		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Supernatural&Season=1&apikey=d1fb1433");
		System.out.println(json);

		// Agora a ideia é transoformar esse json de resposta em um objeto de uma classe. Vamos usar o Jackson pra isso. Ele é semelhante ao Gson.

		/*
		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		// Nesse exemplo aqui, pode-se verificar que podemos passar qualquer
		endereço de API para consumir os dados dela, nossa classe ConsumoAPI
		é versátil e retorna o json de qualquer endereço de API que você apssar aqui,
		essa no caso retorna a imagem de um café.
		 */
	}
}
