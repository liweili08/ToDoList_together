package com.example.backend.Model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ToDoDatabase {


    private final ArrayList<ToDo> toDoList;
    public ToDoDatabase(ArrayList<ToDo> toDoList) {
        this.toDoList = toDoList;
    }



    public ToDo addToTodo(ToDo todo){
        toDoList.add(todo);
        return todo;
    }

    public ToDo removeToDo(String x){
        ToDo returnValue = getTodo(x);
        toDoList.remove(returnValue);
        return returnValue;
    }

    public ArrayList<ToDo> returnAll(){
        System.out.println(toDoList);
        return toDoList;
    }

    public ToDo getTodo(String x){
        for (int i = 0; i<toDoList.size(); i++){
            if (x.equals(toDoList.get(i).getId()));{
                return toDoList.get(i);
            }
        }return null;
    }

    public ToDo updateToDo(String id, ToDo x){
        removeToDo(id);
        addToTodo(x);
        return x;
    }

    @Override
    public String toString() {
        return "ToDoDatabase{" +
                "toDoList=" + toDoList +
                '}';
    }
}
