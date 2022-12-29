package com.api.src.dto.Hospital;

import com.api.src.domain.Hospital;
import com.api.src.dto.PeopleDTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DoctorForListHospitalDTO extends PeopleDTO {
    private Long id;

    private String crm;
}
