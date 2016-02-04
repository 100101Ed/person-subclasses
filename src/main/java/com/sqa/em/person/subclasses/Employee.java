/**
 * File Name: Employee.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 3, 2016
 */
package com.sqa.em.person.subclasses;

/**
 * Employee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Employee extends Person {

	private int employeeId;

	private String companyName;

	/**
	 * @param employeeId
	 * @param companyName
	 */
	public Employee() {
		super();
		this.employeeId = 1;
		this.companyName = "No Name";
	}

	/**
	 * @param name
	 * @param age
	 * @param income
	 * @param employeeId
	 * @param companyName
	 */
	public Employee(String name, int age, double income, int employeeId, String companyName) {
		super(name, age, income);
		this.employeeId = employeeId;
		this.companyName = companyName;
	}

	/**
	 * @see com.sqa.em.person.subclasses.Person#calcStressLevel()
	 */
	@Override
	public int calcStressLevel() {
		// TODO Auto-generated method stub
		return super.calcStressLevel() / 2;// super.calcStressLevel();
	}

	/**
	 * @see com.sqa.em.person.subclasses.Person#determinePay()
	 */
	@Override
	public double determinePay() {
		// TODO Auto-generated method stub
		return this.getIncome() * 3;// super.determinePay();
	}

	/**
	 * @see com.sqa.em.person.subclasses.Person#doWork()
	 */
	@Override
	public void doWork() {
		System.out.println("Yippie " + getName() + " is now Working :-) !!!");
		;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return this.employeeId;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String parentString = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(parentString);
		builder.append("Employee [employeeId=");
		builder.append(this.employeeId);
		builder.append(", companyName=");
		builder.append(this.companyName);
		builder.append("]");
		return builder.toString();
	}
}
