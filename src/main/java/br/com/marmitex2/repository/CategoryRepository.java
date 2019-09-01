package br.com.marmitex2.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.marmitex2.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	Category findByName(String name);

}
