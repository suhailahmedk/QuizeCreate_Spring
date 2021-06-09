package com.example.quizecreater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
    @GetMapping("/addQuiz")
    public String QuizForm(Model model) {
        model.addAttribute("addQuiz", new Quiz());
        return "addQuiz";
    }

    @PostMapping("/addQuiz")
    public String QuizSubmit(@ModelAttribute Quiz quiz, Model model) {
        model.addAttribute("addQuiz", quiz);
        return "result";
    }
}
