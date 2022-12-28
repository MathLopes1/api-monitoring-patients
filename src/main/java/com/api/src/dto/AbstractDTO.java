package com.api.src.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AbstractDTO {

	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime createdAt;

	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime updatedAt;

}
