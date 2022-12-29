package com.api.src.exepctions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundExepction extends AbstractExepction {
    public NotFoundExepction(String descricao) {
        super("Not Found", descricao);
    }
}
