package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payday;

	private Address address;

	private List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String name, int payday, Address address) {
		this.name = name;
		this.payday = payday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayday() {
		return payday;
	}

	public void setPayday(int payday) {
		this.payday = payday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public static double payroll(Department dep) {
		double result = 0.0;
		for (Employee employee : dep.getEmployees()) { // get busca, set troca
			result += employee.getSalary();
		}

		return result;
	}

}

// payroll = folha de pagamento
