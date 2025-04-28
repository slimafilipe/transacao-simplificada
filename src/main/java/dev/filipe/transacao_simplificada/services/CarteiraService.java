package dev.filipe.transacao_simplificada.services;

import dev.filipe.transacao_simplificada.infrastructure.entity.Carteira;
import dev.filipe.transacao_simplificada.infrastructure.entity.Usuario;
import dev.filipe.transacao_simplificada.infrastructure.exceptions.UserNotFound;
import dev.filipe.transacao_simplificada.infrastructure.repository.CarteiraRepository;
import dev.filipe.transacao_simplificada.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarteiraService {

    private final CarteiraRepository repository;

    public void salvar(Carteira carteira) {
        repository.save(carteira);

    }
}
