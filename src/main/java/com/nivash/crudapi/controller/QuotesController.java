package com.nivash.crudapi.controller;


import com.nivash.crudapi.bean.Quotes;
import com.nivash.crudapi.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class QuotesController {

    @Autowired
    public QuotesService quotesService;

    @RequestMapping("/quotes")
    public List<Quotes> getAllQuotes(){
        return quotesService.getAllQuotes();
    }

    @RequestMapping("/quotes/{id}")
    public Quotes getOneQuote(@PathVariable("id")String id){
        return quotesService.getOneQuote(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/quotes")
    public void addQuote(@RequestBody Quotes quotes){
        quotesService.addQuote(quotes);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/quotes/{id}")
    public void updateQuote(@PathVariable String id,String quotes, @RequestBody Quotes quote){
        quotesService.updateQuote(id,quote);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/quotes/{id}")
    public void deleteQuote(@PathVariable("id")String id){
        quotesService.deleteQuote(id);
    }

    @GetMapping("/quotes/random")
    public Optional<Quotes> randomQuote(){
        return quotesService.randomQuote();
    }
}
