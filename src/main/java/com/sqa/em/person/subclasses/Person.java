/**
 * File Name: Person.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 3, 2016
 */
package com.sqa.em.person.subclasses;

/**
 * Person //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private String name;

	private int age;

	private double income;

	private boolean happy;

	public Person() {
		super();
		this.name = "No name";
		this.age = 30;
		this.income = 0.0;
	}

	/**
	 * @param name
	 * @param age
	 * @param income
	 */
	public Person(String name, int age, double income) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}

	public int calcStressLevel() {
		return 3;
	}

	public double determinePay() {
		return this.income * 1;
	}

	public void doWork() {
		System.out.println(this.getName() + " is doing their work!");
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the income
	 */
	public double getIncome() {
		return this.income;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the happy
	 */
	public boolean isHappy() {
		return this.happy;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param happy
	 *            the happy to set
	 */
	public void setHappy(boolean happy) {
		this.happy = happy;
	}

	/**
	 * @param income
	 *            the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", income=");
		builder.append(this.income);
		builder.append(", happy=");
		builder.append(this.happy);
		builder.append("]");
		return builder.toString();
	}
}
