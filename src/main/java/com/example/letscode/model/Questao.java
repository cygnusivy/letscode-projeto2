package com.example.letscode.model;

import com.example.letscode.model.Disciplina;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition="TEXT", nullable = false)
    private String enunciado;
    @ManyToOne
    @JoinColumn(name = "disciplina_id", nullable = false)
    private Disciplina disciplina;

    public Questao(String enunciado, Disciplina disciplina) {
        this.enunciado = enunciado;
        this.disciplina = disciplina;
    }

    @Override
    public String toString(){
        String res = "Questao " + this.id + " da disciplina " + this.disciplina.getNome() + "\n\r" +
                this.enunciado + "\n\r";
        return res;
    }
}
