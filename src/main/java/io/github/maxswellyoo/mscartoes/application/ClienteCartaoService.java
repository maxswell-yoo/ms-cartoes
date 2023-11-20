package io.github.maxswellyoo.mscartoes.application;

import io.github.maxswellyoo.mscartoes.domain.entities.ClienteCartao;
import io.github.maxswellyoo.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {
    private final ClienteCartaoRepository clienteCartaoRepository;

    public List<ClienteCartao> getCartoesByCpf(String cpf) {
        return clienteCartaoRepository.findByCpf(cpf);
    }
}
