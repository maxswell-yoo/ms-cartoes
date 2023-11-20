package io.github.maxswellyoo.mscartoes.application.representation;

import io.github.maxswellyoo.mscartoes.domain.entities.ClienteCartao;

import java.math.BigDecimal;

public record CartoesPorClienteResponse(
        String nome,
        String bandeira,
        BigDecimal limite

) {
    public static CartoesPorClienteResponse fromModel(ClienteCartao clienteCartao) {
        return new CartoesPorClienteResponse(
                clienteCartao.getCartao().getNome(),
                clienteCartao.getCartao().getBandeira().toString(),
                clienteCartao.getLimite()
        );
    }
}
