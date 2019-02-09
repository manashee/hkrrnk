package com.example.demo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class NotebookClient {

    WebClient client = WebClient.create("http://localhost:8080");

    public void consume () {
        Mono<Notebook> notebookMono = client.get().uri("/notebooks/{id}","5")
                .retrieve()
                .bodyToMono(Notebook.class);
        notebookMono.subscribe ( System.out::println );


        Flux<Notebook> notebookFlux = client.get().uri("/notebooks")
                .retrieve()
                .bodyToFlux(Notebook.class);
        notebookFlux.subscribe ( System.out::println);
    }

}