package ru.diasoft.quiz.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuizServiceImplTest {

    private QuizServiceImpl quizService;

    @BeforeEach
    void setUp() {
        quizService = new QuizServiceImpl("dfsdfsd");
    }

    @Test
    void getPathMustReturn() {
        assertEquals("dfsdfsd", quizService.getPath());
    }
}