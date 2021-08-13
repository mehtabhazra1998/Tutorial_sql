package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    TutorialRepository tutorialRepository;
    @GetMapping("/hi")
    public String Hi(){
        return "Hi";
    }
    @PostMapping("/tutorials")
    public String createTutorial(@RequestBody Tutorial tutorial)
    {
        try {
            System.out.print("Hi");
            tutorialRepository.save(tutorial);
            return "success";
        }catch (Exception e)
        {
            return "Failure";
        }
    }

}
