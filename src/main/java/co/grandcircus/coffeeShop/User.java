package co.grandcircus.coffeeShop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id  @GeneratedValue
	private String name;
	private int age;
	private int coffeeCups;
	
	public User(String name, int age, int coffeeCups) {
		super();
		this.name = name;
		this.age = age;
		this.coffeeCups = coffeeCups;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getCoffeeCups() {
		return coffeeCups;
	}
	
	public void setCoffeeCups(int coffeeCups) {
		this.coffeeCups = coffeeCups;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", coffeeCups=" + coffeeCups + "]";
	}
	
}
