package br.com.ricky_forum_hub_api.forum.api.repository;

import br.com.ricky_forum_hub_api.forum.api.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    boolean existsByTitulo(String titulo);
    boolean existsByMensagem(String mensagem);

    List<Topico> findAllByOrderByDataCriacaoDesc();
}