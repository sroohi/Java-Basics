package com.big.sean;

public class BigSean {
	private Double height;
	private Integer weight;
	private Integer age;

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BigSean [height=" + height + ", weight=" + weight + ", age=" + age + "]";
	}

}
