package com.example.backend.Service;

import com.example.backend.Model.ToDo;
import com.example.backend.Model.ToDoDatabase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KanbanServiceTest {

    private final ArrayList<ToDo> probeListe = new ArrayList(List.of(
            new ToDo("001", "OPEN", "Hallo1"),
            new ToDo("002", "OPEN", "Hallo2"),
            new ToDo("003", "OPEN", "Hallo3"),
            new ToDo("004", "OPEN", "Hallo4"),
            new ToDo("005", "OPEN", "Hallo5")
    ));

    private final ToDoDatabase testDatabase = new ToDoDatabase(probeListe);

    @Test
    void getAllToDos() {
        assertEquals(probeListe, testDatabase.returnAll());
    }

    @Test
    void addToDo() {
       final KanbanService service = new KanbanService(testDatabase);
        ToDo x = new ToDo("001", "OPEN", "Hallo1");
        assertEquals(x, service.addToDo(x));
    }

    @Test
    void deliverToDo() {
        final KanbanService service = new KanbanService(testDatabase);
        ToDo x = new ToDo("001", "OPEN", "Hallo1");
        assertEquals(x,service.deliverToDo("001"));
    }

    @Test
    void changeDetails() {
        final KanbanService service = new KanbanService(testDatabase);
        ToDo x = new ToDo("001", "OPEN", "Hallo1");
        ToDo xy= new ToDo("002", "OPEN", "Hallo2");
        assertEquals(x, service.changeDetails("xy.getId",x));
    }

    @Test
    void removeToDo() {
        final KanbanService service = new KanbanService(testDatabase);
        ToDo x = new ToDo("001", "OPEN", "Hallo1");
        assertEquals(x, service.removeToDo("001"));
    }
}