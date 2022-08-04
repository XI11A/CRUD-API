package com.nivash.crudapi.repository;

import com.nivash.crudapi.bean.Quotes;
import org.springframework.data.repository.CrudRepository;

public interface QuotesRepository extends CrudRepository<Quotes,String> {
}
