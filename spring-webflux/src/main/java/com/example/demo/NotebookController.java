package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping ("/notebooks")
public class NotebookController {

    private final NotebookRepository notebookRepository;

    public NotebookController (NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    @GetMapping("/{id}")
    private Mono<Notebook> getNotebookById(@PathVariable String id) {
        return notebookRepository.findNotebookById ( id );
    }

    @GetMapping
    private Flux<Notebook> getNotebooks() {
        return notebookRepository.findAllNotebooks();
    }
}
