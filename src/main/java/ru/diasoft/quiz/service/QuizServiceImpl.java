package ru.diasoft.quiz.service;

import org.springframework.core.io.Resource;
import ru.diasoft.quiz.model.Question;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuizServiceImpl implements QuizService {

    private String path;
    private Resource resource;

    public QuizServiceImpl(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void startQuiz(Resource resource) {
        this.resource = resource;
        startConsoleQuiz();
    }

    private void startConsoleQuiz() {
        try {
            Scanner scanner = new Scanner(new InputStreamReader(this.resource.getInputStream()));
            while (scanner.hasNext()) {
                Scanner in = new Scanner(System.in);
                System.out.println(new Question(scanner.nextLine()));
                System.out.println("Answer: " + in.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
