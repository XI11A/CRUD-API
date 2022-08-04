package com.nivash.crudapi.service;

import com.nivash.crudapi.bean.Quotes;
import com.nivash.crudapi.repository.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuotesService {

    @Autowired
    public QuotesRepository quotesRepo;

    public Long getQuotesCount(){
        return quotesRepo.count();
    }

    public List<Quotes> getAllQuotes(){
        List<Quotes> quotes = new ArrayList<>();
        quotesRepo.findAll().forEach(quotes::add);
        return quotes;
    }

    public Quotes getOneQuote(String id) {
        return quotesRepo.findById(id).get();
    }

    public void addQuote(Quotes quotes) {
        quotesRepo.save(quotes);
    }

    public void updateQuote(String id,Quotes quote) {
        quotesRepo.save(quote);
    }

    public void deleteQuote(String id) {
        quotesRepo.deleteById(id);
    }

    public Optional<Quotes> randomQuote() {
        List<Quotes> quotes = new ArrayList<>();
        System.out.println(getQuotesCount());
        return quotesRepo.findById(String.valueOf((int)Math.floor(Math.random()*getQuotesCount())+1));
    }
}
