package com.api.src.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AbstractDTO {

	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime createdAt;

	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime updatedAt;

	public AbstractDTO() {}

	public AbstractDTO(LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
