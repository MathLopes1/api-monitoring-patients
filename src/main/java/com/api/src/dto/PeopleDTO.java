package com.api.src.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PeopleDTO extends AbstractDTO {

    private String name;

    private String cpf;

    private String address;

    private String state;

    private String city;

    private String phoneNumber;
}
