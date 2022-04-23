package com.example.letscode.repository;

import com.example.letscode.model.alternativa.Alternativa;
import com.example.letscode.model.questao.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlternativaRepository extends JpaRepository<Alternativa, Integer> {
    Alternativa findAlternativaById(Integer id);
    List<Alternativa> findByDescricaoEquals(String descricao);
    List<Alternativa> findAlternativaByQuestao(Questao questao);
}