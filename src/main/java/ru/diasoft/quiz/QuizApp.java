package ru.diasoft.quiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.diasoft.quiz.service.QuizService;

public class QuizApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml_config.xml");
        QuizService quizService = context.getBean(QuizService.class);
        quizService.startQuiz(context.getResource(quizService.getPath()));
    }
}