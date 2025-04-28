package dev.filipe.transacao_simplificada.services;

import dev.filipe.transacao_simplificada.infrastructure.clients.AutorizacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AutorizacaoService {

    private final AutorizacaoClient client;

    public boolean validarTransafencia() {
        if (Objects.equals(client.validarAutorizacao().data().authorization(), true)){
            return true;
        }
        return false;
    }
}
