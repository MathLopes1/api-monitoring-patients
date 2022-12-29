package com.api.src.exepctions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadRequestExepction extends AbstractExepction {
    public BadRequestExepction(String descricao) {
        super("Bad Request", descricao);
    }
}
