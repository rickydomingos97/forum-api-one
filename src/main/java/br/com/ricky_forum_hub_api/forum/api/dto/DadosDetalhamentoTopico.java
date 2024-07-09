package br.com.ricky_forum_hub_api.forum.api.dto;

import br.com.ricky_forum_hub_api.forum.api.model.Topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        String status,
        String nomeCurso,
        String nomeAutor) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(),
                topico.getStatus(), topico.getCurso().getNome(), topico.getAutor().getNome());
    }
}