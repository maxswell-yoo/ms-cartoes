package io.github.maxswellyoo.mscartoes.application.representation;

import io.github.maxswellyoo.mscartoes.domain.BandeiraCartao;
import io.github.maxswellyoo.mscartoes.domain.entities.Cartao;

import java.math.BigDecimal;

public record CartaoSaveRequest(
        String nome,
        BandeiraCartao bandeira,
        BigDecimal renda,
        BigDecimal limite
) {
    public Cartao toModel() {
        return new Cartao(nome, bandeira, renda, limite);
    }
}
