package com.nivash.crudapi.controller;

import com.nivash.crudapi.bean.Jokes;
import com.nivash.crudapi.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class JokesController {

    @Autowired
    public JokesService jokesService;

    @RequestMapping("/jokes")
    public List<Jokes> getAllJokes(){
        return jokesService.getAllJokes();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/jokes")
    public void addJoke(@RequestBody Jokes joke){
        jokesService.addJoke(joke);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/jokes/{id}")
    public void updateJoke(@PathVariable String id, @RequestBody Jokes joke){
        jokesService.updateJoke(id , joke);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/jokes/{id}")
    public void deleteJoke(@PathVariable String id){
        jokesService.deleteJoke(id);
    }

    @GetMapping("/jokes/{id}")
    private Jokes getOneJoke(@PathVariable("id") String id){
        return jokesService.getOneJoke(id);
    }

    @GetMapping("/jokes/random")
    private Optional<Jokes> randomJoke(){
        return jokesService.randomJoke();
    }
}
