package br.com.marmitex2.model;

import java.time.DayOfWeek;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "tb_daily_special")
public class DailySpecial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<DayOfWeek> daysOfWeekAvailable;
	private String name;
	@ManyToMany
	private List<Ingredient> ingredients;
	private double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<DayOfWeek> getDaysOfWeekAvailable() {
		return daysOfWeekAvailable;
	}

	public void setDaysOfWeekAvailable(List<DayOfWeek> daysOfWeekAvailable) {
		this.daysOfWeekAvailable = daysOfWeekAvailable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
