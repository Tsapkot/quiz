package ru.diasoft.quiz.model;

public class Question extends AbstractTextObject {

    public Question(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return "Question: " +
                super.getText();
    }
}
