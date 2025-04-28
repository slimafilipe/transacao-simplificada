package dev.filipe.transacao_simplificada.infrastructure.repository;

import dev.filipe.transacao_simplificada.infrastructure.entity.Carteira;
import dev.filipe.transacao_simplificada.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
