package com.example.backend.Service;

import com.example.backend.Model.ToDo;
import com.example.backend.Model.ToDoDatabase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class KanbanService {

    private final ToDoDatabase openList;

    public KanbanService(ToDoDatabase openList) {
        this.openList = openList;
    }


    public ArrayList<ToDo> getAllToDos(){
        return openList.returnAll();
    }

    public ToDo addToDo(ToDo x){
       x.setId(UUID.randomUUID().toString());
        return openList.addToTodo(x);
    }

    public ToDo deliverToDo(String x){
        return openList.getTodo(x);
    }

    public ToDo changeDetails(String id, ToDo toDoToChange){
        return openList.updateToDo(id, toDoToChange);
    }

    public ToDo removeToDo(String idToRemove){
        return openList.removeToDo(idToRemove);
    }


}
