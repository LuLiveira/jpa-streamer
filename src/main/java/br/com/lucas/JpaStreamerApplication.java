package br.com.lucas;

import br.com.lucas.entities.User;
import br.com.lucas.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStreamerApplication implements CommandLineRunner {

	private final UserRepository repository;

	public JpaStreamerApplication(UserRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaStreamerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User ninaBrown = User.builder().email("nina@gmail.com").name("Nina Brown").password("$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu").build();
		User leiaRed = User.builder().email("leia@gmail.com").name("Leia Red").password("$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu").build();
		User lucasSilva = User.builder().email("lcsd.lucas@gmail.com").name("Lucas Silva").password("$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu").build();

		repository.save(ninaBrown);
		repository.save(leiaRed);
		repository.save(lucasSilva);
	}
}
