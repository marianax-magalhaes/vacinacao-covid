package br.com.akicovid.crud;

import br.com.akicovid.crud.model.Pessoa;
import br.com.akicovid.crud.repository.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PessoaRepository pessoaRepository){
		return args -> {
			pessoaRepository.deleteAll();

			Pessoa p = new Pessoa();
			p.setNome("Maria");
			p.setCpf("123.456.789-01");

			pessoaRepository.save(p);
		};
	}
}









