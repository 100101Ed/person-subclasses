/**
 * File Name: PersonTests.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 3, 2016
 */
package com.sqa.em.person.subclasses;

import org.junit.Ignore;
import org.junit.Test;

/**
 * PersonTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0 Employee (Teacher....
 */
public class PersonTests {

	@Test
	public void testEmployeeActions() {
		Person[] people = new Person[] { new Person(), new Employee(), new Person("Juan", 78, 200.01),
				new Employee("Juan", 78, 200.01, 45, "SQA School"), new Person("Fred", 23, 2.54),
				new Employee("Fred", 23, 2.54, 54, "SF School"), };
		// Loops through your array
		for (Person p : people) {
			p.doWork();
			System.out.println("\tStress Level: " + p.calcStressLevel());
			System.out.println("\tPay Amount:$ " + p.determinePay());
			System.out.println(p.toString());
		}
	}

	@Test
	@Ignore
	public void testPersonActions() {
		Person[] people = new Person[] { new Person(), new Person("Juan", 78, 200.01), new Person("Fred", 23, 2.54), };
		// Loops through your array
		for (Person p : people) {
			p.doWork();
			System.out.println("\tStress Level: " + p.calcStressLevel());
			System.out.println("\tPay Amount:$ " + p.determinePay());
			System.out.println(p.toString());
		}
	}
}
