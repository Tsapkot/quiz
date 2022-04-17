package ru.diasoft.quiz.service;

import org.springframework.core.io.Resource;
import ru.diasoft.quiz.model.Answer;
import ru.diasoft.quiz.model.Question;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizServiceImpl implements QuizService {

    private String path;
    private Resource resource;
    private Map<Question, Answer> quizHistory;

    public QuizServiceImpl(String path) {
        this.path = path;
        quizHistory = new HashMap<>();
    }

    public String getPath() {
        return path;
    }

    public void startQuiz(Resource resource) {
        this.resource = resource;
        startConsoleQuiz();
    }

    private void startConsoleQuiz() {
        try (Scanner scanner = new Scanner(new InputStreamReader(this.resource.getInputStream()))) {
            while (scanner.hasNext()) {
                Scanner in = new Scanner(System.in);
                Question question = new Question(scanner.nextLine());
                System.out.println(question);
                Answer answer = new Answer(in.nextLine());
                System.out.println("\u001B[33m" + answer + "\u001B[0m");
                quizHistory.put(question, answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
