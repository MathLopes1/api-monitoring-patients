package com.api.src.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AbstractEntity {
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime createdAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime updatedAt;
}
