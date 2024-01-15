package com.example.project.controller;

import com.example.project.model.Question;
import com.example.project.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    /* A Get API to return all the questions from the question table
       Route here is, http://localhost:8080/question/allQuestions */
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){

        return questionService.getAllQuestions();
    }

    /* A Get API to return all the questions based on a category
       Route here is, http://localhost:8080/question/category/{category}
    */
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    /* A Post API to add a question to the table question
       Route here is, http://localhost:8080/question/add } */
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }
}
