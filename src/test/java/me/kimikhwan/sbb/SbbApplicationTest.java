package me.kimikhwan.sbb;

import jakarta.transaction.Transactional;
import me.kimikhwan.sbb.answer.Answer;
import me.kimikhwan.sbb.question.Question;
import me.kimikhwan.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SbbApplicationTest {
    @Autowired
    private QuestionRepository questionRepository;

    @Transactional
    @Test
    void testJpa() {
        Optional<Question> oq = questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answersList = q.getAnswersList();

        assertEquals(1, answersList.size());
        assertEquals("네 자동으로 생성됩니다.", answersList.get(0).getContent());
    }

}