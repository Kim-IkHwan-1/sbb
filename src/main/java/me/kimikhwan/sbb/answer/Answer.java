package me.kimikhwan.sbb.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.kimikhwan.sbb.question.Question;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createdDate;

    @ManyToOne
    private Question question;
}
