package com.api.src.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public class AbstractEntity {
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime createdAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	LocalDateTime UpdatedAt;
	
	public AbstractEntity() {}
	
	public AbstractEntity(LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.createdAt = createdAt;
		this.UpdatedAt = updatedAt;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		UpdatedAt = updatedAt;
	}
}
