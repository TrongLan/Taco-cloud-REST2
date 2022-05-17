package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
@Table(name = "taco")
public class Taco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	private Date createdAt;
	@ManyToMany(targetEntity=Ingredient.class)
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
