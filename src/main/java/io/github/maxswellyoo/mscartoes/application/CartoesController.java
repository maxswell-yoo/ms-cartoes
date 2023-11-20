package io.github.maxswellyoo.mscartoes.application;

import io.github.maxswellyoo.mscartoes.application.representation.CartaoSaveRequest;
import io.github.maxswellyoo.mscartoes.domain.entities.Cartao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cartoes")
@RequiredArgsConstructor
public class CartoesController {
    private final CartaoService cartaoService;

    @GetMapping
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("ok");
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> cadastra(@RequestBody CartaoSaveRequest request) {
        var cartao = request.toModel();
        cartaoService.save(cartao);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> getCartoesByRenda(@RequestParam("renda") Long renda) {
        List<Cartao> cartoesRendaMenorIgual = cartaoService.getCartoesRendaMenorIgual(renda);

        return ResponseEntity.ok(cartoesRendaMenorIgual);
    }
}
