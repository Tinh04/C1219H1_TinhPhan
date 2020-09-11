package project_backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id")
    private Integer id;

    @Column(name = "exam_date")
    private Date examDate;

    @Column(name = "mark")
    private Double mark;

    @Column(name = "answer")
    private String answer;

    public Exam() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
//    FOREIGN KEY (user_id) REFERENCES _user (user_id),
//    FOREIGN KEY (test_id) REFERENCES test(test_id));