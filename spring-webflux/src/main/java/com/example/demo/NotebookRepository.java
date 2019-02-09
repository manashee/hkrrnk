package com.example.demo;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Repository
public class NotebookRepository {

    static private HashMap<String,Notebook> notebooks;

    static {
        notebooks = new HashMap<>();
        notebooks.put ( "1" , new Notebook("1","Ashok1"));
        notebooks.put ( "1" , new Notebook("2","Ashok2"));
        notebooks.put ( "1" , new Notebook("3","Ashok3"));
        notebooks.put ( "1" , new Notebook("4","Ashok4"));
        notebooks.put ( "1" , new Notebook("5","Ashok5"));
        notebooks.put ( "1" , new Notebook("6","Ashok6"));
        notebooks.put ( "1" , new Notebook("7","Ashok7"));
        notebooks.put ( "1" , new Notebook("8","Ashok8"));
        notebooks.put ( "1" , new Notebook("9","Ashok9"));
        notebooks.put ( "1" , new Notebook("10","Ashok10"));
    }

    public Mono<Notebook> findNotebookById(String id ) {
        return Mono.just(notebooks.get(id));
    }

    public Flux<Notebook> findAllNotebooks () {
        return Flux.fromIterable ( notebooks.values( ));
    }
}
