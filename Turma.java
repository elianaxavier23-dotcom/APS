package eedu.uea.demoin.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TURMA")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serie;

    @Column(name = "numero_da_turma")
    private String numeroDaTurma;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;

    public Turma() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getNumeroDaTurma() { return numeroDaTurma; }
    public void setNumeroDaTurma(String numeroDaTurma) { this.numeroDaTurma = numeroDaTurma; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public List<Aluno> getAlunos() { return alunos; }
    public void setAlunos(List<Aluno> alunos) { this.alunos = alunos; }
}


