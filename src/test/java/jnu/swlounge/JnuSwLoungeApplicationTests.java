package jnu.swlounge;

import jnu.swlounge.controller.Question;
import jnu.swlounge.repository.QuestionRepository;
import jnu.swlounge.service.QuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@ActiveProfiles(value = "dev")
class JnuSwLoungeApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuestionService questionService;

    @Test
    void insertQuestion() {
        String context = "1+1=?";

        Question question = Question.builder()
                .writer("김승민")
                .questioner("김승민")
                .content(context)
                .language("math")
                .date(LocalDateTime.now())
                .build();
        questionRepository.save(question);

        Question get_question = questionService.findById(question.getId());
        assertThat(get_question.getContent(), is(context));
    }

}
