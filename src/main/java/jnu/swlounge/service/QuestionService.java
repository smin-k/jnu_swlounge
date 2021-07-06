package jnu.swlounge.service;

import jnu.swlounge.controller.Question;
import jnu.swlounge.dto.QuestionDto;
import jnu.swlounge.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question save(QuestionDto questionDto) {
        Question question = questionDto.toEntity();
        return questionRepository.save(question);
    }

    public Question findById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new NotFountQuestionException());
    }

    public List<Question> findByWriter(String writer) {
        return questionRepository.findByWriter(writer);
    }

    public List<Question> findByDate(LocalDateTime startDate, LocalDateTime endDate ) {
        return  questionRepository.findAllByDateBetween(startDate, endDate);
    }

    public List<Question> findByQuestioner(String questioner) {
        return  questionRepository.findByQuestioner(questioner);

    }
}

