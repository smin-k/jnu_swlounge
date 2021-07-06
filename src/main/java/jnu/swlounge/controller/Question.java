package jnu.swlounge.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table

public class Question {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String writer;

    @Column
    private String questioner;

    @Column
    private String content;

    @Column
    private String language;

    @Column
    private String type;

    @Column
    private LocalDateTime date;

    @Builder
    public Question(String writer,
                    String questioner,
                    String content,
                    String language,
                    String type,
                    LocalDateTime date
                    ) {
        this.writer = writer;
        this.questioner = questioner;
        this.content = content;
        this.language= language;
        this.type= type;
        this.date = date;
    }

}
