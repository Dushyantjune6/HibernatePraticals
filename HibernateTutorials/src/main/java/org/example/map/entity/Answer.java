package org.example.map.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
    public Answer(String answer, int id) {
        this.answer = answer;
        this.id = id;
    }

    public Answer() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    @Id
    @Column(name = "answer_id")
    private int id;
    private String answer;
}
