package ru.diasoft.quiz.service;

import org.springframework.core.io.Resource;

public interface QuizService {
    void startQuiz(Resource resource);

    String getPath();
}
