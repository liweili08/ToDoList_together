package com.example.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {

    private String id;
    private String status; //OPEN, INPROGRESS, DONE
    private String description;



}
