package org.example.map.entity;


import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name = "question_id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    private String question;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public Question(int id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
}
