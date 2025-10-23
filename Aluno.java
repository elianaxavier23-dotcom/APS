package eedu.uea.demoin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Aluno() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
}
