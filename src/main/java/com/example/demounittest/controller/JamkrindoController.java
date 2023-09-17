package com.example.demounittest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jamkrindo")
public class JamkrindoController {
    @GetMapping("/tdd")
    public ResponseEntity<String> greetings(
            @RequestParam("name")String name
    ){
        return new ResponseEntity<>(
                String.format("Hello Sobat Jamkrindo %s.",name),
                HttpStatus.OK
        );
    }
}