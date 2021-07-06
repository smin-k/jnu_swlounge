package jnu.swlounge.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class QuestionController {

    @PostMapping(path = "/enroll")
    public ResponseEntity search(Question question) {
        System.out.println(question.getQuestioner());
        System.out.println(question.getWriter());
        System.out.println(question.getLanguage());
        System.out.println(question.getContent());
        return new ResponseEntity(HttpStatus.OK);
    }

}
