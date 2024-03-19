package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Model.DadosSerie;
import br.com.alura.screenmatch.Service.ConsumoAPI;
import br.com.alura.screenmatch.Service.ConverteDados;
import br.com.alura.screenmatch.Service.IConverteDados;
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

		// Otendo os dados da série
		// Atribuímos a resposta para uma variável chama 'json'
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Supernatural&apikey=d1fb1433");
		// Printamos o json para verificar seu conteúdo
		System.out.println(json);
		// Instanciamos o conversor
		ConverteDados conversor = new ConverteDados();
		// Pedimos que o conversor transformasse o json em um objeto da classe DadosSerie
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

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
