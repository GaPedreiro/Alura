package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
CTRL + ALT + O limpa todos os imports que não estão sendo utilizados.
 */

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { // CommandoLineRunner é uma interface que permite criar dentro do método principal algumas chamadas.

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();
	}
}
