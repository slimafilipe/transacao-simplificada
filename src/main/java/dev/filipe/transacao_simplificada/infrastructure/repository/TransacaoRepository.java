package dev.filipe.transacao_simplificada.infrastructure.repository;

import dev.filipe.transacao_simplificada.infrastructure.entity.Transacoes;
import dev.filipe.transacao_simplificada.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacoes, Long> {
}
