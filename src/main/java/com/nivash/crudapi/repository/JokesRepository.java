package com.nivash.crudapi.repository;

import com.nivash.crudapi.bean.Jokes;
import org.springframework.data.repository.CrudRepository;

public interface JokesRepository extends CrudRepository<Jokes,String> {
}
