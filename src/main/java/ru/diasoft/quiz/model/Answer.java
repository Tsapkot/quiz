package ru.diasoft.quiz.model;

public class Answer extends AbstractTextObject {

    public Answer(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return "Answer: " +
                super.getText();
    }
}
