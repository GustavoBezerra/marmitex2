package br.com.marmitex2.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tb_ingredient")
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double quantity;
	private String measure;
	private LocalDate dueDate;
	@ManyToOne
	private Category category;
	private double amount;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<DayOfWeek> daysOfWeekAvailable;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<DayOfWeek> getDaysOfWeekAvailable() {
		return daysOfWeekAvailable;
	}

	public void setDaysOfWeekAvailable(List<DayOfWeek> daysOfWeekAvailable) {
		this.daysOfWeekAvailable = daysOfWeekAvailable;
	}
}
