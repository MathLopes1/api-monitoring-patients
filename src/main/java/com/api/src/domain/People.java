package com.api.src.domain;

import lombok.*;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class People extends AbstractEntity {

    private String name;

    private String cpf;

    private String address;

    private String state;

    private String city;

    private String phoneNumber;
}
