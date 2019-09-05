package br.com.marmitex2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.marmitex2.model.Category;
import br.com.marmitex2.repository.CategoryRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Marmitex2Application implements CommandLineRunner{
	
	private static final Logger LOG = LogManager.getLogger(Marmitex2Application.class);
	
	@Autowired
	private CategoryRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Marmitex2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("Teste2");
		LOG.info("Salvando categoria...");
		Category findByName = repository.findByName(category.getName());
		if(findByName != null)
			LOG.error("Categoria já existente!");
		else {
			repository.save(category);
			LOG.info("Categoria salva!");
			LOG.info("Buscando categorias...");
			repository.findAll().forEach(c -> LOG.info(c.getId() + " - " + c.getName()));
		}
	}

}
