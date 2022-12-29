package com.api.src.domain;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "tb_report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Report extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private Integer bloodPressure;
	private Integer glucose;
	private Integer BPM;
	private String Description;
	private LocalDateTime date;

	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
}
