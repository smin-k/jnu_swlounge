package jnu.swlounge.repository;
import jnu.swlounge.controller.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Optional<Question> findById(Long id);

    List<Question> findByWriter(String writer);

    List<Question> findByQuestioner(String questioner);

    List<Question> findByType(String type);

    //List<Question> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(LocalDateTime endDate, LocalDateTime startDate);
    List<Question> findAllByDateBetween(LocalDateTime endDate, LocalDateTime startDate);
}