package com.assimilate.jdbctemplate;

public class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	/*
	 * CREATE TABLE `assimilate_db`.`employee` ( `id` INT NOT NULL, `name`
	 * VARCHAR(45) NULL, `salary` VARCHAR(45) NULL, PRIMARY KEY (`id`));
	 */
}
