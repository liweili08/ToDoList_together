package com.example.backend.Controller;

import com.example.backend.Model.ToDo;
import com.example.backend.Service.KanbanService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class KanbanController {
    public KanbanController(KanbanService service) {
        this.service = service;
    }
    private final KanbanService service;


    @GetMapping("/todo")
    public ArrayList<ToDo> getAll(){
        return service.getAllToDos();
    }

    @PostMapping("/todo")
    public ToDo addToDo(@RequestBody ToDo x){
        return service.addToDo(x);
    }

    @GetMapping("/todo/{id}")
    public ToDo getTodo(@PathVariable String id ){
        return service.deliverToDo(id);
    }
    @PutMapping("/todo/{id}/update")
    public ToDo putUpdate(@PathVariable String id,@RequestBody ToDo x ){
        return service.changeDetails(id, x);
    }

    @PutMapping("/todo/{id}")
    public ToDo putNext(@PathVariable String id,@RequestBody ToDo x){
        return service.changeDetails(id, x);
    }

    @DeleteMapping("/todo/{id}")
    public ToDo deleteToDo(@PathVariable String id){
        return service.removeToDo(id);
    }

}