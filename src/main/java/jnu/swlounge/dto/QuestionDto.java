package jnu.swlounge.dto;

import jnu.swlounge.controller.Question;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class QuestionDto {
    private String writer;
    private String questioner;
    private String content;
    private String language;
    private String type;

    public Question toEntity() {
        Question build = Question.builder()
                .writer(writer)
                .content(content)
                .type(type)
                .build();
        return build;
    }

    @Builder
    public QuestionDto(String writer,
                       String questioner,
                       String content,
                       String language,
                       String type,
                       LocalDateTime date) {
        this.writer = writer;
        this.questioner = questioner;
        this.content = content;
        this.language= language;
        this.type= type;
    }
}
