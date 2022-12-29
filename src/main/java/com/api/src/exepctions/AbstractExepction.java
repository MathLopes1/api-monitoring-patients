package com.api.src.exepctions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractExepction extends RuntimeException{
    private String erro;
    private String descricao;
}
