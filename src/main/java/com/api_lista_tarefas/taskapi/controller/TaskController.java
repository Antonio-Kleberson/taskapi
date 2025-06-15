package com.api_lista_tarefas.taskapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<String> tasks = new ArrayList<>();

    public TaskController() {
        tasks.add("Ler documentação");
        tasks.add("Estudar HTTP");
    }

    @GetMapping
    public ResponseEntity<List<String>> getTasks() {
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity<String> addTask(@RequestBody String task) {
        if (task == null || task.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Tarefa não pode ser vazia.");
        }
        tasks.add(task);
        return ResponseEntity.status(HttpStatus.CREATED).body("Tarefa adicionada com sucesso.");
    }
}
