package project_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "_subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Integer id;

    @Column(name = "subject_name")
    private String subjectName;
}

